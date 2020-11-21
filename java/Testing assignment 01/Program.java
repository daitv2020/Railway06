package Buoi1;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// them doi tuong cho department
		department department01 = new department();
		department01.departmentId = 1;
		department01.departmentName = "sale";
		
		System.out.println("id phong ban: " + department01.departmentId);
		System.out.println("ten phong ban: " + department01.departmentName);
		
		department department02 = new department();
		department02.departmentId = 2;
		department02.departmentName = "QA";
		
		System.out.println("id phong ban: " + department02.departmentId);
		System.out.println("ten phong ban: " + department02.departmentName);
		
		department department03 = new department();
		department03.departmentId = 3;
		department03.departmentName = "marketing";
		
		
		System.out.println("id phong ban: " + department03.departmentId);
		System.out.println("ten phong ban: " + department03.departmentName);
		
		
		
		// them doi tuong cho position
		position position01 = new position();
		position01.positionId = 1;
		position01.positionName = PositionName.DEV;
		
		System.out.println("id chuc vu: " + position01.positionId);
		System.out.println("ten chuc vu : " + position01.positionName);
		
		position position02 = new position();
		position02.positionId = 2;
		position02.positionName = PositionName.TEST;
		
		System.out.println("id chuc vu: " + position02.positionId);
		System.out.println("ten chuc vu : " + position02.positionName);
		
		position position03 = new position();
		position03.positionId = 3;
		position03.positionName = PositionName.PM;
		
		
		System.out.println("id chuc vu: " + position03.positionId);
		System.out.println("ten chuc vu : " + position03.positionName);
		
		// them doi tuong cho account
		account account01 = new account();
		account01.accountId = 1;
		account01.email = "01@gmail.com";
		account01.userName = "TK 01";
		account01.fullName = "Tai Khoan 01";
		account01.department = department02;
		account01.position = position02;
		account01.createDate = LocalDate.now();
		
		System.out.println(account01.email);
		
		
		account account02 = new account();
		account02.accountId = 2;
		account02.email = "02@gmail.com";
		account02.userName = "TK 02";
		account02.fullName = "Tai Khoan 02";
		account02.department = department02;
		account02.position = position03;
		account02.createDate = LocalDate.now();
		
		System.out.println(account02.accountId);
		
		
		account account03 = new account();
		account03.accountId = 3;
		account03.email = "03@gmail.com";
		account03.userName = "TK 03";
		account03.fullName = "Tai Khoan 03";
		account03.department = department03;
		account03.position = position01;
		account03.createDate = LocalDate.now();
		
		System.out.println(account03.userName);
		
		
		// Them doi tuong cho group
		group group01 = new group();
		group01.groupId = 1;
		group01.groupName = "group 1";
		group01.account = account03;
		group01.createDate = LocalDate.of(2010, 12, 20);
		
		account[] accountOfGroup01= {account01, account02};
		group01.accounts = accountOfGroup01;
		
		System.out.println(group01.groupName);
		
				
		group group02 = new group();
		group02.groupId = 2;
		group02.groupName = "group 2";
		group02.account = account02;
		group02.createDate = LocalDate.of(2015, 11, 20);
		
		account[] accountOfGroup02= {account01, account03};
		group02.accounts = accountOfGroup02;
		
		System.out.println(group02.createDate);
		
		
		group group03 = new group();
		group03.groupId = 3;
		group03.groupName = "group 3";
		group03.account = account01;
		group03.createDate = LocalDate.of(2020, 11, 20);
		
		account[] accountOfGroup03= {account01, account02, account03};
		group03.accounts = accountOfGroup03;
		
		System.out.println(group03.groupName);
		
		// them moi doi tuong cho group_account
		groupAccount gr_ac01 = new groupAccount();
		gr_ac01.group = group01;
		gr_ac01.account = account01;
		gr_ac01.joinDate = LocalDate.of(2020, 01, 01);
		
		System.out.println(group03.groupId);
		
		groupAccount gr_ac02 = new groupAccount();
		gr_ac02.group = group03;
		gr_ac02.account = account02;
		gr_ac01.joinDate = LocalDate.of(2020, 10, 21);
		
		System.out.println(account02.accountId);
		
		groupAccount gr_ac03 = new groupAccount();
		gr_ac03.group = group02;
		gr_ac03.account = account01;
		gr_ac01.joinDate = LocalDate.of(2020, 11, 20);
		
		System.out.println(gr_ac01.joinDate);
		
		
		// them doi tuong cho type_question
		typeQuestion typeQuestion01 = new typeQuestion();
		typeQuestion01.typeId = 1;
		typeQuestion01.typeName = typeName.ESSAY;
		
		System.out.println(typeQuestion01.typeId);
		
		
		typeQuestion typeQuestion02 = new typeQuestion();
		typeQuestion02.typeId = 2;
		typeQuestion02.typeName = typeName.ESSAY;
		
		System.out.println(typeQuestion01.typeName);
		
		
		typeQuestion typeQuestion03 = new typeQuestion();
		typeQuestion03.typeId = 3;
		typeQuestion03.typeName = typeName.ESSAY;
		
		System.out.println(typeQuestion01.typeName);
		
		
		// them doi tuong cho categoryQuestion
		categoryQuestion categoryQuestion01 = new categoryQuestion();
		categoryQuestion01.categoryId = 1;
		categoryQuestion01.categoryName = "java";
		
		System.out.println(categoryQuestion01.categoryId);
		
		categoryQuestion categoryQuestion02 = new categoryQuestion();
		categoryQuestion02.categoryId = 2;
		categoryQuestion02.categoryName = ".NET";
		
		System.out.println(categoryQuestion02.categoryName);
		
		categoryQuestion categoryQuestion03 = new categoryQuestion();
		categoryQuestion03.categoryId = 3;
		categoryQuestion03.categoryName = "SQL";
		
		System.out.println(categoryQuestion03.categoryName);
		
		
		
		// them doi tuong cho question
		question question01 = new question();
		question01.questionId = 1;
		question01.content = "cau hoi 1";
		question01.categoryQuestion = categoryQuestion02;
		question01.typeQuestion = typeQuestion03;
		question01.account = account03;
		question01.createDate = LocalDate.now();		
	
		System.out.println(question01.questionId);
		
		question question02 = new question();
		question02.questionId = 2;
		question02.content = "cau hoi 2";
		question02.categoryQuestion = categoryQuestion02;
		question02.typeQuestion = typeQuestion02;
		question02.account = account02;
		question02.createDate = LocalDate.now();		

		System.out.println(question02.content);
		
		question question03 = new question();
		question03.questionId = 3;
		question03.content = "cau hoi 3";
		question03.categoryQuestion = categoryQuestion01;
		question03.typeQuestion = typeQuestion01;
		question03.account = account01;
		question01.createDate = LocalDate.now();
		
		System.out.println(question01.createDate);
		
		
		
		// them doi tuong cho answer
		answer answer01 = new answer();
		answer01.answerId = 1;
		answer01.content = "cau tra loi 1";
		answer01.question = question01;
		answer01.isCorrect = true;
		
		System.out.println(answer01.answerId);
		
		answer answer02 = new answer();
		answer02.answerId = 2;
		answer02.content = "cau tra loi 2";
		answer02.question = question02;
		answer02.isCorrect = false;

		
		System.out.println(answer02.isCorrect);
		
		answer answer03 = new answer();
		answer03.answerId = 3;
		answer03.content = "cau tra loi 3";
		answer03.question = question03;
		answer03.isCorrect = true;
		
		System.out.println(answer03.content);
		
		answer[] answerOfQuestion03 = {answer01, answer02};
		question01.answers = answerOfQuestion03;
		
		answer[] answerOfQuestion02 = {answer01, answer02};
		question02.answers = answerOfQuestion02;
		
		answer[] answerOfQuestion01 = {answer01, answer02};
		question03.answers = answerOfQuestion01;
		
		
		// them moi doi tuong cho exam
		exam exam01 = new exam();
		exam01.examId = 1;
		exam01.code = "e123";
		exam01.title = "de thi 1";
		exam01.categoryQuestion = categoryQuestion02;
		exam01.duration = 30;
		exam01.account = account01;
		exam01.createDate = LocalDate.now();
		
		question[] questionOfExam01 = {question01, question02};
		exam01.questions = questionOfExam01;
		
		System.out.println(exam01.title);
		
		exam exam02 = new exam();
		exam02.examId = 2;
		exam02.code = "e333";
		exam02.title = "de thi 2";
		exam02.categoryQuestion = categoryQuestion03;
		exam02.duration = 90;
		exam02.account = account03;
		exam02.createDate = LocalDate.now();
		
		question[] questionOfExam02 = {question01, question03};
		exam02.questions = questionOfExam02;
		
		System.out.println(exam02.duration);
		
		exam exam03 = new exam();
		exam03.examId = 3;
		exam03.code = "e563";
		exam03.title = "de thi 3";
		exam03.categoryQuestion = categoryQuestion01;
		exam03.duration = 60;
		exam03.account = account02;
		exam03.createDate = LocalDate.now();
		
		question[] questionOfExam03 = {question01, question03, question02};
		exam03.questions = questionOfExam03;
		
		System.out.println(exam03.code);
		
		
		// them doi tuong cho examQuestion
		examQuestion examQuestion01 = new examQuestion();
		examQuestion01.exam = exam01;
		examQuestion01.question = question01;
		
		System.out.println(exam01.examId);
		
		examQuestion examQuestion02 = new examQuestion();
		examQuestion02.exam = exam02;
		examQuestion02.question = question02;
		
		System.out.println(question02.questionId);
		
		examQuestion examQuestion03 = new examQuestion();
		examQuestion03.exam = exam03;
		examQuestion03.question = question03;
		
		System.out.println(question03.questionId);
		
		
	}

}
