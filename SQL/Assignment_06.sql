-- create database
DROP DATABASE IF EXISTS Testing_System_Assignment_6;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_6;
USE Testing_System_Assignment_6;


--  create table1: Department
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    department_name			NVARCHAR(100) UNIQUE KEY
);


-- create table2: Position
DROP TABLE IF EXISTS position;
CREATE TABLE IF NOT EXISTS position (
	position_id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    position_name		ENUM('Dev','Test','Scrum Master','PM')
);


-- create table3: Account
DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    email				VARCHAR(100) UNIQUE KEY NOT NULL,
    username			VARCHAR(50) NOT NULL,
    full_name			NVARCHAR(200),
    department_id		TINYINT UNSIGNED NOT NULL,
    position_id			TINYINT UNSIGNED NOT NULL,
    create_date			DATE,
    FOREIGN KEY (department_id) REFERENCES department (department_id),
    FOREIGN KEY (position_id) REFERENCES position (position_id)
);



-- create table4: Group
DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
	group_id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    group_name			NVARCHAR(200),
    creator_id			SMALLINT UNSIGNED NOT NULL,
    create_date			DATE,
    FOREIGN KEY (creator_id) REFERENCES `account` (account_id)
);
	
 
 -- create table5: GroupAccount
DROP TABLE IF EXISTS `group_account`;
CREATE TABLE IF NOT EXISTS `group_account` (
	group_id			TINYINT UNSIGNED,
    account_id			SMALLINT UNSIGNED,
    join_date			DATE,
    PRIMARY KEY (group_id,account_id),
    FOREIGN KEY (group_id) REFERENCES `group` (group_id),
    FOREIGN KEY (account_id) REFERENCES `account` (account_id)
);


-- create table6: TypeQuestion
DROP TABLE IF EXISTS type_question;
CREATE TABLE IF NOT EXISTS type_question (
	type_id			TINYINT UNSIGNED AUTO_INCREMENT,
    type_name		ENUM('Essay','Multi-choice'),
    PRIMARY KEY(type_id)
);


-- create table7: CategoryQuestion
DROP TABLE IF EXISTS category_question;
CREATE TABLE IF NOT EXISTS category_question (
	category_id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    category_name		NVARCHAR(200)
);


-- create table8: Question
DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question (
	question_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    content				TEXT,
    category_id			TINYINT UNSIGNED,
    type_id				TINYINT UNSIGNED,
    creator_id			SMALLINT UNSIGNED,
    create_date			DATE,
	FOREIGN KEY (category_id) 
		REFERENCES category_question (category_id),
	FOREIGN KEY (type_id) 
		REFERENCES type_question (type_id),
	FOREIGN KEY (creator_id) 
		REFERENCES `account` (account_id)
);


-- create table9: Answer
DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer (
	answer_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    content			TEXT(200),
    question_id		SMALLINT UNSIGNED,
    FOREIGN KEY (question_id)
		REFERENCES question (question_id),
    is_correct		ENUM('TRUE','FALSE')
);


-- create table10: Exam 
DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam (
	exam_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `code`			VARCHAR(50),
    title			TEXT,
    category_id		TINYINT UNSIGNED,
    duration		TINYINT UNSIGNED,
    creator_id		SMALLINT UNSIGNED,
    create_date		DATE,
    FOREIGN KEY (creator_id) REFERENCES `account`(account_id),
    FOREIGN KEY (category_id) REFERENCES category_question(category_id)
);


--  create table11: ExamQuestion
DROP TABLE IF EXISTS exam_question;
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id			SMALLINT UNSIGNED,
    question_id		SMALLINT UNSIGNED,
    PRIMARY KEY (exam_id,question_id),
    FOREIGN KEY (exam_id) 
		REFERENCES exam (exam_id),
    FOREIGN KEY (question_id) 
		REFERENCES question (question_id)
);


-- ============================INSERT DATA==============================
-- Add data table Department
INSERT INTO department	(department_name		)
VALUES					(N'sale'				),
						(N'marketing'			),
						(N'Hành Chính Nhân Sự'	),
						(N'IT'					),
						(N'Pháp chế'			),
						(N'Đào tạo'				),
						(N'Tuyển dụng'			),
						(N'Kế Toán'				),
						(N'Communicator'		),
						(N'Giám Đốc'			);
                    
-- Add data table Positon
INSERT INTO `position`	(position_name	)
VALUE					('Dev'			),
						('Test'			),
						('Scrum Master'	),
						('PM'			);


-- Add data table Account
INSERT INTO `account`(email							, username				, full_name				, department_id		, position_id		, create_date)
VALUES				 ('tuvandai1996@gmail.com'		, 'tuvandai'			, 'Tu Van Dai'			, 1				, 2				, '2019-11-10'),
					 ('vietnam@gmail.com'			, 'vietnam'				, 'Nguyen Dao'			, 2				, 1				, '2019-11-11'),
                     ('nhatban@gmail.com'			, 'nhatban'				, 'Nhat Ban'			, 3				, 4				, '2019-11-12'),
                     ('hanquoc@gmail.com'			, 'hanquoc'				, 'Han Quoc'			, 1				, 3				, '2019-11-15'),
                     ('trieutien@gmail.com'			, 'trieutien'			, 'Trieu Tien'			, 4				, 2				, '2019-10-10'),
                     ('trungquoc@gmail.com'			, 'trungquoc'			, 'Trung Quoc'			, 1				, 4				, '2019-12-10'),
                     ('mongco@gmail.com'			, 'mongco'				, 'Nguyen Mong Co'		, 6				, 2				, '2020-10-10'),
                     ('nga@gmail.com'				, 'nga'					, 'Lien Bang Nga'		, 1				, 1				, '2019-01-10'),
                     ('lao@gmail.com'				, 'lao'					, 'CHDCND Lao'			, 8				, 3				, '2019-12-11'),
                     ('campuchia@gmail.com'			, 'campuchi'			, 'Vuong Quoc Campuchia', 3				, 3				, '2019-11-10');
                     

-- Add data table group
INSERT INTO `group` (group_name		, creator_id		, create_date	)
VALUES				('tieng viet'	, 1					, '2020-10-19'	),
					('tieng Nga'	, 2					, '2020-11-19'	),
                    ('tieng Nhat'	, 4					, '2019-10-19'	),
                    ('tieng Trung'	, 2					, '2019-10-09'	),
                    ('tieng Han'	, 5					, '2020-10-29'	),
                    ('tieng Lao'	, 3					, '2020-11-29'	),
                    ('tieng Mong Co', 4					, '2020-10-09'	),
                    ('tieng Khmer'	, 2					, '2018-10-19'	),
                    ('tieng Thai'	, 9					, '2018-11-19'	),
                    ('tieng Cham'	, 8					, '2018-10-29'	);
                    
-- Add data table group_account
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO group_account	(  group_id		, account_id		, join_date		)
VALUES					 	(  1			, 1					, '2019-10-09'	),
							(  2			, 2					, '2019-11-09'	),
							(  1			, 3					, '2019-12-09'	),
							(  1			, 4					, '2020-10-09'	),
							(  7			, 5					, '2020-10-19'	),
							(  1			, 8					, '2020-10-19'	),
							(  6			, 6					, '2019-10-19'	),
							(  1			, 5					, '2019-10-29'	),
							(  9			, 9 				, '2019-10-01'	),
                            (  1			, 10 				, '2019-10-19'	);


-- Add data table TypeQuestion
INSERT INTO type_question	(type_name		)
VALUES						('Essay'		),
							('Multi-choice'	)
;


-- Add data table CategoryQuestion
INSERT INTO category_question	(category_name	)
VALUES							('Java'			),
								('.NET'			),
                                ('SQL'			),
                                ('Postman'		),
                                ('Ruby'			),
                                ('Python'		),
                                ('React'		),
                                ('cotlin'		),
                                ('japaness'		),
                                ('English'		);
                                
							
-- Add data table Question
INSERT INTO question(content		, category_id	, type_id	, creator_id	, create_date )
VALUES				('Tieng Nhat'	, 1				, 1			, 3				, '2020-11-02'),
					('Tieng Nga'	, 6				, 2			, 1				, '2010-10-02'),
                    ('Tieng Han'	, 5				, 1			, 2				, '2020-10-02'),
                    ('content 4'	, 7				, 2			, 8				, '2020-09-02'),
                    ('content 5'	, 4				, 1			, 7				, '2019-08-02'),
                    ('Nhat Ban 6'	, 4				, 1			, 6				, '2019-11-02'),
                    ('Thai Lan 7'	, 1				, 2			, 5				, '2020-07-02'),
                    ('Campuchia 8'	, 9				, 2			, 3				, '2020-07-05'),
                    ('Mong Co 9'	, 5				, 1			, 4				, '2020-07-02'),
                    ('Indonesia a'	, 5				, 1			, 3				, '2020-06-02');


-- Add data table Answer
INSERT INTO answer	(content		, question_id		, is_correct	)
VALUES				('content 1'	, 2					, 'FALSE'		),
					('content 2'	, 1					, 'TRUE'		),
                    ('content 9'	, 3					, 'FALSE'		),
                    ('content 8'	, 4 				, 'TRUE'		),
                    ('content 7'	, 1					, 'TRUE'		),
                    ('content 6'	, 6					, 'FALSE'		),
                    ('content 5'	, 1					, 'TRUE'		),
                    ('content 4'	, 8					, 'TRUE'		),
                    ('content 3'	, 10				, 'TRUE'		),
                    ('content a'	, 1					, 'TRUE'		)
;


-- Add data table Exam
INSERT INTO exam(`code`		, title		, category_id	, duration		, creator_id	, create_date	)
VALUES			('E1'		, 'title 1'	, 2				, 30			, 2				, '2019-11-02'	),
				('E2'		, 'title 2'	, 1				, 50			, 4				, '2020-11-02'	),
                ('E3'		, 'title 3'	, 4				, 60			, 2				, '2020-11-02'	),
                ('E4'		, 'title 4'	, 5				, 90			, 2				, '2019-10-02'	),
                ('E5'		, 'title 5'	, 6				, 90			, 7				, '2020-11-02'	),
                ('E7'		, 'title a'	, 5				, 120			, 5				, '2020-11-02'	),
                ('E9'		, 'title s'	, 2				, 150			, 2				, '2020-11-02'	),
                ('E8'		, 'title d'	, 1				, 30			, 2				, '2020-11-02'	),
                ('Ea'		, 'title f'	, 4				, 90			, 5				, '2020-11-02'	),
                ('Eb'		, 'title g'	, 2				, 60			, 3				, '2020-11-02'	);


-- Add data table ExamQuestion
INSERT INTO exam_question	(exam_id	, question_id	)
VALUES						(1			, 10			),
							(2			, 9				),
                            (3			, 8				),
                            (4			, 8				),
                            (5			, 6				),
                            (6			, 5				),
                            (7			, 4				),
                            (8			, 3				),
                            (9			, 8				),
                            (10			, 1				);


-- =========================== Exercise 1 ==============================
--  Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS getInfoAccount;
DELIMITER $$
CREATE PROCEDURE getInfoAccount(IN in_department_name VARCHAR(30))
	BEGIN
		SELECT *
		FROM `account` a
		JOIN department d ON a.department_id = d.department_id
		WHERE department_name LIKE CONCAT('%' , in_department_name , '%');
	END $$
DELIMITER ;

call testing_system_assignment_6.getInfoAccount('sal');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS getInfoNumberOfAccount;
DELIMITER $$
CREATE PROCEDURE getInfoNumberOfAccount()
	BEGIN
		SELECT group_id, COUNT(account_id) AS SoLuongAccount
		FROM group_account
		GROUP BY group_id;
	END $$
DELIMITER ;

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS getQuestionInfo_question03;
DELIMITER $$
CREATE PROCEDURE getQuestionInfo_question03()
	BEGIN
		SELECT type_id, COUNT(question_id) AS SoLuongCauHoi
		FROM question
        WHERE MONTH(create_date) = MONTH(NOW()) AND YEAR(create_date) = YEAR(NOW())
		GROUP BY type_id;
	END $$
DELIMITER ;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS getInfoTypeQuestion_question_04;
DELIMITER $$
CREATE PROCEDURE getInfoTypeQuestion_question_04(OUT out_type_question TINYINT)
	BEGIN
		SELECT type_id INTO out_type_question
		FROM question
		GROUP BY type_id
		HAVING COUNT(question_id) = (
				SELECT COUNT(question_id)
				FROM question
				GROUP BY type_id
				ORDER BY COUNT(question_id) DESC
				LIMIT 1);
		END $$
	DELIMITER ;
    
set @out_type_question = 0;
call testing_system_assignment_6.getInfoTypeQuestion_question_04(@out_type_question);
select @out_type_question;
    
 
    
   -- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
   
DROP PROCEDURE IF EXISTS getInfoTypeQuestion_question_05;
DELIMITER $$
CREATE PROCEDURE getInfoTypeQuestion_question_05(OUT out_type_name VARCHAR(50))
	BEGIN
		DECLARE	out_type_question INT;
		SET out_type_question = 0;
		CALL testing_system_assignment_6.getInfoTypeQuestion_question_04(out_type_question);
		SELECT out_type_question;
				
		SELECT type_name INTO out_type_name
		FROM type_question
		WHERE type_id = out_type_question;
	END $$
	DELIMITER ;
SET @out_type_name = '';
CALL getInfoTypeQuestion_question_05(@out_type_name);
SELECT @out_type_name;


-- Question 6: 
/* Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
chuỗi của người dùng nhập vào */

DROP PROCEDURE IF EXISTS Question_06;
DELIMITER $$
CREATE PROCEDURE Question_06(IN in_name NVARCHAR(50))
BEGIN
		SELECT group_name AS `name`, 'group' AS `type`
        FROM `group`
        WHERE group_name LIKE CONCAT('%' , in_name , '%')
        UNION
        SELECT username AS `name`, 'account' AS `type`
        FROM `account`
        WHERE username LIKE CONCAT('%' , in_name , '%');
END $$
DELIMITER ;
-- Lệnh call trả về kết quả
call testing_system_assignment_6.Question_06('ie');

-- Question 7
/* Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
		username sẽ giống email nhưng bỏ phần @..mail đi
		positionID: sẽ có default là developer
		departmentID: sẽ được cho vào 1 phòng chờ
	Sau đó in ra kết quả tạo thành công */
DROP PROCEDURE IF EXISTS q_7;
DELIMITER $$
CREATE PROCEDURE q_7 (IN in_full_name VARCHAR(100), in_email VARCHAR(100))
	BEGIN
        DECLARE username1 VARCHAR(100) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
        DECLARE position_id TINYINT DEFAULT 1;
        DECLARE department_id TINYINT DEFAULT 10;
INSERT INTO `account` (email		, username		, full_name		, department_id	, position_id	, create_date)
VALUES				  (in_email		, username1		, in_full_name	, department_id	, position_id	, NOW()		);
		SELECT *
        FROM `account`
        WHERE username = username1;
	END $$
DELIMITER ;

call testing_system_assignment_6.q_7('tuvandai', 'tuvandai@gmail.com');

-- Question 8: 
/* Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất */

DROP PROCEDURE IF EXISTS Question_08;
DELIMITER $$
CREATE PROCEDURE Question_08(IN in_name ENUM('Essay','Multi-choice'))
	BEGIN
			SELECT *
			FROM question q
			JOIN type_question tq ON q.type_id = tq.type_id
			WHERE type_name = in_name AND LENGTH(content) = 
				(
				SELECT LENGTH(content)
				FROM question q
				JOIN type_question tq ON q.type_id = tq.type_id
				WHERE type_name = in_name
				ORDER BY LENGTH(content) DESC
				LIMIT 1
				);
	END $$
DELIMITER ;


-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS question_9;
DELIMITER $$
CREATE PROCEDURE question_9(IN in_id SMALLINT)
	BEGIN
		DELETE
		FROM exam
		WHERE creator_id = in_id;
	END $$
DELIMITER ;
call testing_system_assignment_6.question_9(3);


-- Question 10: 
/* Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
Sau đó in số lượng record đã remove từ các table liên quan trong khi removing */
DROP PROCEDURE IF EXISTS q_10;
DELIMITER $$
CREATE PROCEDURE q_10 ()
BEGIN
	DECLARE in_id TINYINT;
	SET @in_id=0;
	CALL testing_system_assignment_6.question_9(@in_id);
	SELECT @in_id;

CREATE VIEW exam_3_years_ago AS 
	SELECT *, YEAR(create_date) AS nam
	FROM exam
	WHERE YEAR(create_date) = (YEAR(NOW()) - 3);
DELETE 
FROM exam_3_years_ago
WHERE exam_id = in_id;

END $$
DELIMITER ;

-- Question 11:
/*Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban
 và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc*/
DROP PROCEDURE IF EXISTS question_11;
DELIMITER $$
CREATE PROCEDURE question_11 (IN in_department_name VARCHAR(100))
BEGIN
		DELETE
		FROM department
		WHERE department_name = in_department_name;
        
END $$
DELIMITER ;
CALL question_11(2);


-- Question 12 Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
DROP PROCEDURE IF EXISTS pro_12;
DELIMITER $$
CREATE PROCEDURE pro_12()
 BEGIN 
		DROP VIEW IF EXISTS view12;
		CREATE VIEW view12 As
			SELECT EachMonthInYear.MONTH
			FROM(
			SELECT 1 AS MONTH
			UNION SELECT 2 AS MONTH
			UNION SELECT 3 AS MONTH
			UNION SELECT 4 AS MONTH
			UNION SELECT 5 AS MONTH
			UNION SELECT 6 AS MONTH
			UNION SELECT 7 AS MONTH
			UNION SELECT 8 AS MONTH
			UNION SELECT 9 AS MONTH
			UNION SELECT 10 AS MONTH
			UNION SELECT 11 AS MONTH
			UNION SELECT 12 AS MONTH
			) AS EachMonthInYear;
 WITH CTE2 AS(
 WITH CTE1 AS (
	 SELECT MONTH(create_date) as month_created, count(question_id) AS number_question
	 FROM question
	 WHERE YEAR(create_date) = YEAR(NOW())
	 GROUP BY month_created
	 ORDER BY month_created)
	 SELECT v12.`MONTH`, CTE1.number_question
	 FROM view12 v12
	 JOIN CTE1 ON v12.`MONTH` = CTE1.month_created
	UNION
	 SELECT v12.`MONTH`, 0 AS number_question
	 FROM view12 v12
	 LEFT JOIN CTE1 ON v12.`MONTH` = CTE1.month_created
	 WHERE CTE1.month_created IS NULL)
	 SELECT * FROM CTE2
	 ORDER BY `MONTH`;
 END $$
DELIMITER ;
CALL pro_12();

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng") 

DROP PROCEDURE IF EXISTS pro_13;
DELIMITER $$
CREATE PROCEDURE pro_13()
 BEGIN 
		DROP VIEW IF EXISTS view13;
		CREATE VIEW view13 As
			SELECT EachMonthInYear.MONTH
			FROM(
			SELECT 1 AS MONTH
			UNION SELECT 2 AS MONTH
			UNION SELECT 3 AS MONTH
			UNION SELECT 4 AS MONTH
			UNION SELECT 5 AS MONTH
			UNION SELECT 6 AS MONTH
			UNION SELECT 7 AS MONTH
			UNION SELECT 8 AS MONTH
			UNION SELECT 9 AS MONTH
			UNION SELECT 10 AS MONTH
			UNION SELECT 11 AS MONTH
			UNION SELECT 12 AS MONTH
			) AS EachMonthInYear;
 WITH CTE3 AS(
 WITH CTE4 AS (
	 SELECT MONTH(create_date) as month_created, count(question_id) AS number_question
	 FROM question
	 WHERE YEAR(create_date) = YEAR(NOW())
	 GROUP BY month_created
	 ORDER BY month_created)
	 SELECT v13.`MONTH`, CTE4.number_question
	 FROM view13 v13
	 JOIN CTE4 ON v13.`MONTH` = CTE4.month_created
	UNION
	 SELECT v13.`MONTH`, 0 AS number_question
	 FROM view13 v13
	 LEFT JOIN CTE4 ON v13.`MONTH` = CTE4.month_created
	 WHERE CTE4.month_created IS NULL)
	 SELECT `MONTH`, IF(number_question = 0 , 'không có câu hỏi nào trong tháng', number_question) AS number_question
     FROM CTE3
     WHERE  `MONTH` BETWEEN (MONTH(NOW()) - 5)  AND MONTH(NOW())
     ORDER BY `MONTH`;
 END $$
DELIMITER ;
CALL pro_13();


