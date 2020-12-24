/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;
/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/
-- create table project
CREATE TABLE `Project`(
	ProjectID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TeamSize TINYINT UNSIGNED,
    IdManager TINYINT UNSIGNED,
    IdEmployees TINYINT UNSIGNED
);

-- create table user
CREATE TABLE `User`(
 UserID  TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 FullName  NVARCHAR(50) NOT NULL,
    Email  VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password` VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role` VARCHAR(50),
    ExpInYear   TINYINT,
    ProjectName VARCHAR(100),
    ProSkill  VARCHAR(100),
    ProjectId	TINYINT UNSIGNED,
    FOREIGN KEY (ProjectId) REFERENCES `Project` (ProjectId)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `Project` (ProjectID	,TeamSize	,IdManager	,IdEmployees)
VALUES					(1			,4			,1			,3)	,	
						(2			,5			,2			,4)	,
                        (3			,4			,3			,3)	,
                        (4			,3			,4			,5)	,
                        (5			,2			,5			,7)	;


INSERT INTO `User`  (UserID   , FullName 	,  Email,  `Password`, `Role` ,`ExpInYear` , ProjectID, Proskill) 
VALUES      		(1, N'Nguyen Thị Mỵ', 'mynt24@gmail.com',  'Mynguyen123', 'Employee', 1, 2 , 'Dev'),
					(2, N'Nguyen Thu Linh', 'mynt27@gmail.com',  'Mynguyen123', 'Manager', 4, 4 , 'test'),
                    (3, N'Nguyen Thị Chinh', 'mynt07@gmail.com',  'Mynguyen123', 'Employee', 1, 2 , 'test'),
                    (4, N'Nguyen Thị Cao', 'mynt7@gmail.com',  'Mynguyen123', 'Manager', 6, 3, 'dev' ),
                    (5, N'Nguyen Thị Chan', 'mynt@gmail.com',  'Mynguyen123', 'Manager', 2, 2, 'sql'),
                    (6, N'Nguyen Thị Le', 'mynt2@gmail.com',  'Mynguyen123', 'Employee', 1, 5, 'java'),
                    (7, N'Nguyen Thị Lan', 'mynt2427@gmail.com',  'Mynguyen123', 'Employee', 1, 1, 'java' );