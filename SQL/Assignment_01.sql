DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;


#Table1: Department
DROP TABLE IF EXISTS Department ;
CREATE TABLE Department (
	Department_ID			INT,
    Department_Name			VARCHAR(50)
);


#Table2: Position
DROP TABLE IF EXISTS Position;
CREATE TABLE Position (
	Position_id			INT,
    Position_name		VARCHAR(50)
);


#Table3: Account
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
	Account_id			INT,
    Email				VARCHAR(50),
    Username			VARCHAR(50),
    Full_name			VARCHAR(50),
    Department_id		INT,
    Position_id			INT,
    Create_date			DATE
);



#Table4: Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
	Group_id			INT,
    Group_name			VARCHAR(50),
    Creator_id			INT,
    Create_date			DATE
);
	
 
 #Table5: GroupAccount
DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount` (
	Group_id			INT,
    Account_id			INT,
    Join_date			DATE
);


#Table6: TypeQuestion
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion (
	Type_id			INT,
    Type_name		VARCHAR(50)
);


#Table7: CategoryQuestion
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion (
	Category_id			INT,
    Category_name		VARCHAR(50)
);


#Table8: Question
DROP TABLE IF EXISTS Question;
CREATE TABLE Question (
	Question_id			INT,
    Content				VARCHAR(100),
    Category_id			INT,
    Type_id				INT,
    Creator_id			INT,
    Create_date			DATE
);


#Table9: Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer (
	Answer_id		INT,
    Content			VARCHAR(200),
    Question_id		INT,
    is_correct		VARCHAR(50)
);


#Table10: Exam
DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam (
	Exam_id			INT,
    `Code`	VARCHAR(20),
    Title			VARCHAR(20),
    Category_id		INT,
    Duration		VARCHAR(50),
    Creator_id		INT,
    Create_date		DATE
);


#Table11: ExamQuestion
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE ExamQuestion (
	Exam_id			INT,
    Question_id		INT
);


