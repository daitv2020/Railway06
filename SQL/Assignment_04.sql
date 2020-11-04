-- create database
DROP DATABASE IF EXISTS Testing_System_Assignment_4;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_4;
USE Testing_System_Assignment_4;


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
					 ('vietnam@gmail.com'			, 'vietnam'				, 'Dao'					, 2				, 1				, '2019-11-11'),
                     ('nhatban@gmail.com'			, 'nhatban'				, 'Nhat Ban'			, 3				, 4				, '2019-11-12'),
                     ('hanquoc@gmail.com'			, 'hanquoc'				, 'Han Quoc'			, 1				, 3				, '2019-11-15'),
                     ('trieutien@gmail.com'			, 'trieutien'			, 'Trieu Tien'			, 4				, 2				, '2019-10-10'),
                     ('trungquoc@gmail.com'			, 'trungquoc'			, 'Trung Quoc'			, 1				, 4				, '2019-12-10'),
                     ('mongco@gmail.com'			, 'mongco'				, 'Mong Co'				, 6				, 2				, '2020-10-10'),
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


/* =============== Exercise 1 ============= */
-- Question 1 Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT *
FROM `account` a
LEFT JOIN department d ON d.department_id = a.department_id;

-- Question 2 Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `account`
WHERE create_date > '2010-12-20';

-- Question 3 Viết lệnh để lấy ra tất cả các developer
SELECT *
FROM `account` a
JOIN position p ON p.position_id = a.position_id
WHERE p.position_name = 'Dev' ;

-- Question 4 Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT *
FROM department d
JOIN `account` a ON d.department_id = a.department_id
GROUP BY d.department_id
HAVING COUNT(*) > 3;

-- Question 5 Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT *, COUNT(*)
FROM question q
JOIN exam_question eq ON eq.question_id = q.question_id
GROUP BY eq.question_id 
ORDER BY COUNT(*) DESC
LIMIT 1;

-- Question 6 Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT cq.category_id, cq.category_name, q.question_id, q.content, COUNT(q.question_id) AS SoluongCauhoi
FROM category_question cq
LEFT JOIN question q ON q.category_id = cq.category_id
GROUP BY cq.category_id
;

-- Question 7 Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT *, COUNT(eq.exam_id) AS soluongdethi
FROM question q
LEFT JOIN exam_question eq ON eq.question_id = q.question_id
GROUP BY q.question_id
;

-- Question 8 Lấy ra Question có nhiều câu trả lời nhất
SELECT *, COUNT(a.answer_id) AS soluongcautraloi
FROM question q
LEFT JOIN answer a ON a.question_id = q.question_id
GROUP BY q.question_id
ORDER BY COUNT(a.answer_id) DESC
LIMIT 1
;

-- Question 9 Thống kê số lượng account trong mỗi group
SELECT *, COUNT(gc.account_id) AS Soluong_account
FROM `group` g
LEFT JOIN group_account gc ON g.group_id = gc.group_id
GROUP BY g.group_id
;

-- Question 10 Tìm chức vụ có ít người nhất
SELECT *, COUNT(a.account_id) AS SoNguoi
FROM position p
JOIN `account` a ON a.position_id = p.position_id
GROUP BY p.position_id 
HAVING COUNT(a.account_id) = 2
;

-- Question 11 Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT d.department_name, p.position_name
FROM `account` a
RIGHT JOIN department d ON a.department_id = d.department_id
LEFT JOIN position p ON a.position_id = p.position_id
WHERE p.position_name = 'Dev'

UNION

SELECT d.department_name, p.position_name
FROM `account` a
RIGHT JOIN department d ON a.department_id = d.department_id
LEFT JOIN position p ON a.position_id = p.position_id
WHERE p.position_name = 'Test'

UNION

SELECT d.department_name, p.position_name
FROM `account` a
RIGHT JOIN department d ON a.department_id = d.department_id
LEFT JOIN position p ON a.position_id = p.position_id
WHERE p.position_name = 'Scrum Master'

UNION

SELECT d.department_name, p.position_name
FROM `account` a
RIGHT JOIN department d ON a.department_id = d.department_id
LEFT JOIN position p ON a.position_id = p.position_id
WHERE p.position_name = 'PM';

-- Question 12 Lấy thông tin chi tiết của câu hỏi bao gồm: 
-- thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
SELECT *
FROM question q
LEFT JOIN type_question tq ON q.type_id = tq.type_id
LEFT JOIN `account` ac ON ac.account_id = q.creator_id
LEFT JOIN answer a ON q.question_id = a.question_id
;

-- Question 13 Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT *, COUNT(q.question_id)
FROM type_question tq
LEFT JOIN question q ON q.type_id = tq.type_id
GROUP BY tq.type_name
;

-- Question 14, 15 Lấy ra group không có account nào
SELECT *
FROM `group` g
LEFT JOIN `group_account` a ON a.group_id = g.group_id
WHERE a.account_id IS NULL
;


-- Question 16 Lấy ra question không có answer nào
SELECT *
FROM `question` q
LEFT JOIN `answer` a ON a.question_id = q.question_id
WHERE a.answer_id IS NULL
;


/* =============== Exercise 2 ================= */
-- Question 17 
SELECT *
FROM `account` a
JOIN group_account ag ON a.account_id = ag.account_id
WHERE ag.group_id = 1

UNION

SELECT *
FROM `account` a
JOIN group_account ag ON a.account_id = ag.account_id
WHERE ag.group_id = 2;

-- Question 18
SELECT g.group_id, g.group_name, COUNT(gc.account_id) AS SoluongAccount
FROM `group` g
JOIN group_account gc ON gc.group_id = g.group_id
GROUP BY g.group_id
HAVING COUNT(gc.account_id) > 5

UNION ALL

SELECT  g.group_id, g.group_name, COUNT(gc.account_id) AS SoluongAccount
FROM `group` g
JOIN group_account gc ON gc.group_id = g.group_id
GROUP BY g.group_id
HAVING COUNT(gc.account_id) > 7;