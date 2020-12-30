/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;
/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/


-- create table Manager
DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS Manager(
	Id			TINYINT UNSIGNED KEY AUTO_INCREMENT,
    FullName	VARCHAR(50),
    Email		VARCHAR(50),
    `Password`	VARCHAR(50),
    ExpInYear	TINYINT
);

-- create table employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee(
	Id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    FullName	VARCHAR(50),
    Email		VARCHAR(50),
    `Password`	VARCHAR(50),
    ProjectId	TINYINT UNSIGNED,
    Proskill	VARCHAR(50)
);
-- create table project
CREATE TABLE `Project`(
	ProjectID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TeamSize TINYINT UNSIGNED,
    IdManager TINYINT UNSIGNED,
    IdEmployees TINYINT UNSIGNED,
    FOREIGN KEY (IdManager) REFERENCES Manager (Id),
    FOREIGN KEY (IdEmployees) REFERENCES Employee(Id)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `Employee`	(FullName		,Email					,`Password`			,ProjectId	,Proskill)
VALUES					('Chinh Chinh'	,'chinh@gmail.com'		,'Chinh123456'		,2			,'Dev'),
						('Chinh Trung'	,'trung@gmail.com'		,'Chinh123456'		,2			,'test'),
                        ('Chinh Linh'	,'linh@gmail.com'		,'Chinh123456'		,2			,'sql'),
                        ('Chinh Nhan'	,'nhan@gmail.com'		,'Chinh123456'		,2			,'java'),
                        ('Chinh Nga'	,'nga@gmail.com'		,'Chinh123456'		,2			,'dev'),
                        ('Chinh Xinh'	,'xinh@gmail.com'		,'Chinh123456'		,2			,'java');

INSERT INTO `Manager`	(FullName		,Email					,`Password`			,ExpInYear)
VALUES					('Chinh Chinh'	,'chinh@gmail.com'		,'Chinh123456'		,2		),
						('Chinh Trung'	,'trung@gmail.com'		,'Chinh123456'		,2		),
                        ('Chinh Linh'	,'linh@gmail.com'		,'Chinh123456'		,2		),
                        ('Chinh Nhan'	,'nhan@gmail.com'		,'Chinh123456'		,2		),
                        ('Chinh Nga'	,'nga@gmail.com'		,'Chinh123456'		,2		),
                        ('Chinh Xinh'	,'xinh@gmail.com'		,'Chinh123456'		,2		);

INSERT INTO `Project` (ProjectID	,TeamSize	,IdManager	,IdEmployees)
VALUES					(1			,4			,1			,3)	,	
						(2			,5			,2			,4)	,
                        (3			,4			,3			,3)	,
                        (4			,3			,4			,5)	,
                        (5			,2			,5			,4)	;
