-- exercise 1
-- create database
DROP DATABASE IF EXISTS extra_assignment_1_2;
CREATE DATABASE IF NOT EXISTS extra_assignment_1_2;
USE extra_assignment_1_2;

-- create table Trainee
DROP TABLE IF EXISTS trainee;
CREATE TABLE IF NOT EXISTS trainee(
		trainee_id				SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        full_name				NVARCHAR(100),
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
		id				SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        `name`			VARCHAR(50),
        `code`			CHAR(5),
        modified_date	DATETIME
);