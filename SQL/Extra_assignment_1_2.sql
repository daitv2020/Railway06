-- exercise 1
-- create database
DROP DATABASE IF EXISTS extra_assignment_1_2_3;
CREATE DATABASE IF NOT EXISTS extra_assignment_1_2_3;
USE extra_assignment_1_2_3;

-- create table Trainee
DROP TABLE IF EXISTS trainee;
CREATE TABLE IF NOT EXISTS trainee(
		trainee_id				SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        full_name				VARCHAR(100),
        birth_date				DATE,
        gender					ENUM('male','female','unknown'),
        et_iq					TINYINT UNSIGNED,
		CHECK(et_iq >=0 && et_iq <=20),
        et_gmath				TINYINT UNSIGNED,
        CHECK(et_gmath >=0 && et_gmath <=20),
        et_english				TINYINT UNSIGNED,
        CHECK(et_english >=0 && et_english <=50),
        training_class			VARCHAR(10),
        evaluation_notes		TEXT,
        vti_account				VARCHAR(100) NOT NULL UNIQUE KEY
);


-- exercise 2
DROP TABLE IF EXISTS exercise_2;
CREATE TABLE IF NOT EXISTS exercise_2(
		id				MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        `name`			VARCHAR(50),
        `code`			CHAR(5),
        modified_date	DATETIME DEFAULT NOW()
);


-- exercise 3
DROP TABLE IF EXISTS exercise_3;
CREATE TABLE IF NOT EXISTS exercise_3(
		id				MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        bith_date		VARCHAR(50),
		gender			BIT,
		Is_delete_flag	BIT NOT NULL -- or ENUM('0','1')
);

-- ===== Extra 3 =======
-- Exercise 1- Thêm data vào table
INSERT INTO trainee (full_name		, birth_date	, gender	, et_iq	, et_gmath	, et_english	, training_class	, evaluation_notes	, vti_account)
VALUES				('Name_1'		, '2000-10-1'	, 'male'	, 17	, 18		, 15			, 'Class_1'			, 'Text_1'			, 'VIT01'	),
					('Name_2'		, '2000-11-1'	, 'female'	, 10	, 20		, 10			, 'Class_2'			, 'Text_1'			, 'VIT02'	),
					('Name_3'		, '2000-12-1'	, 'male'	, 15	, 18		, 16			, 'Class_1'			, 'Text_1'			, 'VIT03'	),
					('Name_4'		, '2000-10-3'	, 'male'	, 10	, 11		, 19			, 'Class_2'			, 'Text_1'			, 'VIT04'	),
					('Name_5'		, '2000-10-5'	, 'female'	, 20	, 18		, 15			, 'Class_5'			, 'Text_1'			, 'VIT05'	),
					('Name_6'		, '2000-10-1'	, 'male'	, 10	, 17		, 15			, 'Class_1'			, 'Text_1'			, 'VIT06'	),
					('Name_7'		, '2000-10-15'	, 'female'	, 14	, 18		, 15			, 'Class_8'			, 'Text_1'			, 'VIT07'	),
					('Name_8'		, '2000-10-10'	, 'unknown'	, 18	, 14		, 15			, 'Class_1'			, 'Text_1'			, 'VIT08'	),
					('Name_9'		, '2000-10-6'	, 'unknown'	, 16	, 18		, 16			, 'Class_9'			, 'Text_1'			, 'VIT09'	),
					('Name_10'		, '2000-10-1'	, 'male'	, 10	, 19		, 20			, 'Class_1'			, 'Text_1'			, 'VIT10'	);
            


-- Question 2
SELECT 
    *
FROM
    trainee
HAVING et_iq + et_gmath >= 20 AND et_iq > 8
    AND et_gmath >= 8
    AND et_english >= 18
        
;

-- Question 3 Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT *
FROM trainee
WHERE LENGTH(full_name) = (SELECT MAX(LENGTH(full_name))
							FROM trainee);