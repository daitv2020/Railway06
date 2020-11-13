-- create database
DROP DATABASE IF EXISTS Testing_System_Assignment_7;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_7;
USE Testing_System_Assignment_7;


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
    department_id		TINYINT UNSIGNED,
    position_id			TINYINT UNSIGNED NOT NULL,
    gender				VARCHAR(10),
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
INSERT INTO `account`(email							, username				, full_name				, department_id		, position_id	, gender		, create_date)
VALUES				 ('tuvandai1996@gmail.com'		, 'tuvandai'			, 'Tu Van Dai'			, 1					, 2				, 	'Nam'		, '2019-11-10'),
					 ('vietnam@gmail.com'			, 'vietnam'				, 'Dao'					, 2					, 1				,	'Nu'		, '2019-11-11'),
                     ('nhatban@gmail.com'			, 'nhatban'				, 'Nhat Ban'			, 3					, 4				,	'Nu'		, '2019-11-12'),
                     ('hanquoc@gmail.com'			, 'hanquoc'				, 'Han Quoc'			, 1					, 3				,	'Nam'		, '2019-11-15'),
                     ('trieutien@gmail.com'			, 'trieutien'			, 'Trieu Tien'			, 4					, 2				,	'Unknown'	, '2019-10-10'),
                     ('trungquoc@gmail.com'			, 'trungquoc'			, 'Trung Quoc'			, 1					, 4				,	'Nu'		, '2019-12-10'),
                     ('mongco@gmail.com'			, 'mongco'				, 'Mong Co'				, 6					, 2				,	'Nam'		, '2020-10-10'),
                     ('nga@gmail.com'				, 'nga'					, 'Lien Bang Nga'		, 1					, 1				,	'Nu'		, '2019-01-10'),
                     ('lao@gmail.com'				, 'lao'					, 'CHDCND Lao'			, 8					, 3				,	'Nam'		, '2019-12-11'),
                     ('campuchia@gmail.com'			, 'campuchi'			, 'Vuong Quoc Campuchia', 3					, 3				,	'Unknown'	, '2019-11-10');
                     

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
							(  1			, 7					, '2019-10-29'	),
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
INSERT INTO question(content	, category_id	, type_id	, creator_id	, create_date )
VALUES				('content 1', 1				, 1			, 3				, '2020-11-02'),
					('content 2', 6				, 2			, 1				, '2020-11-02'),
                    ('content 3', 5				, 1			, 2				, '2020-11-02'),
                    ('content 4', 7				, 2			, 8				, '2020-11-02'),
                    ('content 5', 4				, 1			, 7				, '2020-11-02'),
                    ('content 6', 4				, 2			, 6				, '2020-11-02'),
                    ('content 7', 1				, 2			, 5				, '2020-11-02'),
                    ('content 8', 9				, 2			, 3				, '2020-11-02'),
                    ('content 9', 5				, 1			, 4				, '2020-11-02'),
                    ('content a', 5				, 1			, 3				, '2020-11-02');


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
                ('E8'		, 'title d'	, 1				, 30			, 2				, '2020-11-12'	),
                ('Ea'		, 'title f'	, 4				, 90			, 5				, '2020-11-12'	),
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



-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước
DROP TRIGGER IF EXISTS q1;
DELIMITER $$
CREATE TRIGGER q1
BEFORE INSERT  ON `group`
FOR EACH ROW
BEGIN
	IF NEW.Create_Date < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN
        -- IF YEAR(NEW.CreateDate) < (YEAR(NOW()) - 1) THEN  -- Cách 2
      	SIGNAL SQLSTATE '10001'
        SET MESSAGE_TEXT = 'Lỗi nhập createDate';
        END IF;

END $$
DELIMITER ;
INSERT INTO `group` (Group_Name 		, Creator_ID		, Create_Date)
VALUES				('group22'			, 10				, '2018-12-10');
SELECT * FROM `group`;

-- Question 2: 
/* Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
"Sale" cannot add more user" */

DROP TRIGGER IF EXISTS q2;
DELIMITER $$
CREATE TRIGGER q2
BEFORE INSERT  ON `account`
FOR EACH ROW
BEGIN
	IF NEW.department_id = (SELECT department_id
							FROM department
                            WHERE department_name = 'sale') THEN
		SIGNAL SQLSTATE '10002'
        SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
        END IF;

END $$
DELIMITER ;
INSERT INTO `account`(email							, username				, full_name				, department_id		, position_id, gender		, create_date)
VALUES				 ('1996@gmail.com'				, 'tdai'				, 'Tu Dai'				, 1					, 2				, 'Nam'		, '2019-11-10');

/*
Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
tin liên quan tới user đó */

DROP TRIGGER IF EXISTS q5;
DELIMITER $$
CREATE TRIGGER q5
BEFORE DELETE  ON `account`
FOR EACH ROW
BEGIN
	IF 	OLD.email = 'admin@gmail.com' THEN
		SIGNAL SQLSTATE '10005'
        SET MESSAGE_TEXT = 'đây là tài khoản admin, không cho phép user xóa';
	
    ELSE
		DELETE
		FROM `account`
		WHERE OLD.email != 'admin@gmail.com';
      
        
        END IF;

END $$
DELIMITER ;

/*
Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
*/

INSERT INTO department(department_id, department_name)
VALUES				('11'			, 'waiting Department');
SELECT * FROM department;

DROP TRIGGER IF EXISTS q6;
DELIMITER $$
CREATE TRIGGER q6
BEFORE INSERT  ON `account`
FOR EACH ROW
BEGIN
		IF 	(NEW.department_id = NULL) THEN
			SET NEW.department_id = '11';
        
        END IF;

END $$
DELIMITER ;

SET FOREIGN_KEY_CHECKS=0;
INSERT INTO `account`(email							, username				, full_name				, department_id		, position_id	, gender	, create_date)
VALUES				 ('190@gmail.com'				, 'tdai'				, 'Tu Dai'				, NULL				, 2				, 'Nam'		, '2019-11-10');

SELECT * FROM `account`;

/*
Question 8: Viết trigger sửa lại dữ liệu cho đúng:
Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database */

DROP TRIGGER IF EXISTS q8;
DELIMITER $$
CREATE TRIGGER q8
BEFORE INSERT  ON `account`
FOR EACH ROW
BEGIN
		CASE	WHEN	NEW.gender='Nam' THEN 		SET NEW.gender='M';
				WHEN	NEW.gender='Nu' THEN 		SET NEW.gender='F';
				WHEN	NEW.gender='Unknown' THEN   SET	NEW.gender='U';

END CASE;
END $$
DELIMITER ;

INSERT INTO `account`(email							, username				, full_name				, department_id		, position_id	, gender	, create_date)
VALUES				 ('1990@gmail.com'				, 'tdai'				, 'Tu Dai'				, 3				, 2				, 'Nam'		, '2019-11-10');

SELECT * FROM `account`;



-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS q9;
DELIMITER $$
CREATE TRIGGER q9
BEFORE DELETE  ON exam
FOR EACH ROW
BEGIN
		IF 	DATE(OLD.create_date) >= (DATE(NOW())- 2) THEN
			SIGNAL SQLSTATE '10009'
            SET MESSAGE_TEXT = 'khong duoc xóa bài thi mới tạo được 2 ngày';
        
        END IF;

END $$
DELIMITER ;

DELETE
FROM exam
WHERE create_date ='2020-11-12';
SELECT * FROM exam;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào
DROP TRIGGER IF EXISTS q10;
DELIMITER $$
CREATE TRIGGER q10
BEFORE UPDATE  ON question
FOR EACH ROW
BEGIN
		IF OLD.question_id = ANY(SELECT question_id FROM exam_question) THEN 
			SIGNAL SQLSTATE '10010'
            SET MESSAGE_TEXT = 'khong duoc xóa question nay vi co trong exam';        
        END IF;

END ;
$$
DELIMITER ;
DROP TRIGGER IF EXISTS q10a;
DELIMITER $$
CREATE TRIGGER q10a
BEFORE DELETE  ON question
FOR EACH ROW
BEGIN
		IF OLD.question_id = ANY(SELECT question_id FROM exam_question) THEN 
			SIGNAL SQLSTATE '10010'
            SET MESSAGE_TEXT = 'khong duoc xóa question nay vi co trong exam';        
        END IF;

END 
$$
DELIMITER ;
DELETE
FROM question
WHERE question_id=1;

SELECT * FROM question;
SELECT * FROM exam_question;


/* 
Question 12: Lấy ra thông tin exam trong đó:
Duration <= 30 thì sẽ đổi thành giá trị "Short time"
30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
Duration > 60 thì sẽ đổi thành giá trị "Long time" */

SELECT *, 
	CASE 	WHEN Duration <= 30 THEN "Short time" 
            WHEN Duration > 30 and Duration <= 60 THEN "Medium time"
            WHEN Duration > 60 THEN "Long time"             
	END AS Duration2, COUNT(1)
FROM exam
GROUP BY Duration2 ;


/*
Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
là the_number_user_amount và mang giá trị được quy định như sau:
Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher  */

SELECT g.group_id, g.group_name,
	CASE	WHEN COUNT(a.account_id) <= 5 THEN 'few'
			WHEN COUNT(a.account_id) > 5 AND COUNT(a.account_id) <= 20 THEN 'normal'
            WHEN COUNT(a.account_id) > 20 THEN 'higer'
	END AS the_number_user_amount, COUNT(a.account_id)
FROM `group` g
LEFT JOIN `group_account` a ON g.group_id = a.group_id
GROUP BY g.group_id
;
SELECT * FROM `account`;


-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user,
--  nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"

SELECT d.department_id, d.department_name,
	CASE	WHEN  COUNT(account_id) = 0 THEN 'Khong co user' ELSE COUNT(account_id)
	END AS so_luong
FROM department d
LEFT JOIN `account` a ON d.department_id = a.department_id
GROUP BY d.department_id
;
