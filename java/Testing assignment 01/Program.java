package Buoi1;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// them doi tuong cho department
		department department01 = new department();
		department01.department_id = 1;
		department01.department_name = "sale";
		
		System.out.println("id phong ban: " + department01.department_id);
		System.out.println("ten phong ban: " + department01.department_name);
		
		department department02 = new department();
		department02.department_id = 2;
		department02.department_name = "QA";
		
		System.out.println("id phong ban: " + department02.department_id);
		System.out.println("ten phong ban: " + department02.department_name);
		
		department department03 = new department();
		department03.department_id = 3;
		department03.department_name = "marketing";
		
		
		System.out.println("id phong ban: " + department03.department_id);
		System.out.println("ten phong ban: " + department03.department_name);
		
		
		
		// them doi tuong cho position
		position position01 = new position();
		position01.position_id = 1;
		position01.position_name = PositionName.DEV;
		
		System.out.println("id chuc vụ: " + position01.position_id);
		System.out.println("ten chuc vu : " + position01.position_name);
		
		position position02 = new position();
		position02.position_id = 2;
		position02.position_name = PositionName.TEST;
		
		System.out.println("id chuc vụ: " + position02.position_id);
		System.out.println("ten chuc vu : " + position02.position_name);
		
		position position03 = new position();
		position03.position_id = 3;
		position03.position_name = PositionName.PM;
		
		
		System.out.println("id chuc vụ: " + position03.position_id);
		System.out.println("ten chuc vu : " + position03.position_name);
		
		// them doi tuong cho account
		account account01 = new account();
		account01.account_id = 1;
		account01.email = "01@gmail.com";
		account01.user_name = "TK 01";
		account01.full_name = "Tai Khoan 01";
		account01.department_id = department02;
		account01.position_id = position02;
		account01.create_date = LocalDate.now();
		
		System.out.println(account01.email);
		
		
		account account02 = new account();
		account02.account_id = 2;
		account02.email = "02@gmail.com";
		account02.user_name = "TK 02";
		account02.full_name = "Tai Khoan 02";
		account02.department_id = department02;
		account02.position_id = position03;
		account02.create_date = LocalDate.now();
		
		System.out.println(account02.account_id);
		
		
		account account03 = new account();
		account03.account_id = 3;
		account03.email = "03@gmail.com";
		account03.user_name = "TK 03";
		account03.full_name = "Tai Khoan 03";
		account03.department_id = department03;
		account03.position_id = position01;
		account03.create_date = LocalDate.now();
		
		System.out.println(account03.user_name);
		
		
		// Them doi tuong cho group
		group group01 = new group();
		group01.group_id = 1;
		group01.group_name = "group 1";
		group01.creator_id = account03;
		group01.create_date = LocalDate.of(2010, 12, 20);
		
		System.out.println(group01.group_name);
		
				
		group group02 = new group();
		group02.group_id = 2;
		group02.group_name = "group 2";
		group02.creator_id = account02;
		group02.create_date = LocalDate.of(2015, 11, 20);
		
		System.out.println(group02.create_date);
		
		
		group group03 = new group();
		group03.group_id = 3;
		group03.group_name = "group 3";
		group03.creator_id = account01;
		group03.create_date = LocalDate.of(2020, 11, 20);
		
		System.out.println(group03.group_name);
		
		// them moi doi tuong cho group_account
		group_account gr_ac01 = new group_account();
		gr_ac01.group_id = group01;
		gr_ac01.account_id = account01;
		gr_ac01.join_date = LocalDate.of(2020, 01, 01);
		
		System.out.println(group01.group_id);
		
		group_account gr_ac02 = new group_account();
		gr_ac02.group_id = group03;
		gr_ac02.account_id = account02;
		gr_ac01.join_date = LocalDate.of(2020, 10, 21);
		
		System.out.println(account02.account_id);
		
		group_account gr_ac03 = new group_account();
		gr_ac03.group_id = group02;
		gr_ac03.account_id = account01;
		gr_ac01.join_date = LocalDate.of(2020, 11, 20);
		
		System.out.println(gr_ac01.join_date);
		
		
		// them doi tuong cho type_question
		type_question typeQuestion01 = new type_question();
		typeQuestion01.type_id = 1;
		typeQuestion01.type_name = typeName.ESSAY;
		
		System.out.println(typeQuestion01.type_id);
		
		
		type_question typeQuestion02 = new type_question();
		typeQuestion02.type_id = 2;
		typeQuestion02.type_name = typeName.ESSAY;
		
		System.out.println(typeQuestion01.type_name);
		
		
		type_question typeQuestion03 = new type_question();
		typeQuestion03.type_id = 3;
		typeQuestion03.type_name = typeName.ESSAY;
		
		System.out.println(typeQuestion01.type_name);
		
		
		// them doi tuong cho categoryQuestion
		categoryQuestion categoryQuestion01 = new categoryQuestion();
		categoryQuestion01.category_id = 1;
		categoryQuestion01.category_name = "java";
		
		System.out.println(categoryQuestion01.category_id);
		
		categoryQuestion categoryQuestion02 = new categoryQuestion();
		categoryQuestion02.category_id = 2;
		categoryQuestion02.category_name = ".NET";
		
		System.out.println(categoryQuestion02.category_name);
		
		categoryQuestion categoryQuestion03 = new categoryQuestion();
		categoryQuestion03.category_id = 3;
		categoryQuestion03.category_name = "SQL";
		
		System.out.println(categoryQuestion03.category_name);
		
		
		
		// them doi tuong cho question
		question question01 = new question();
		question01.question_id = 1;
		question01.content = "cau hoi 1";
		question01.category_id = categoryQuestion02;
		question01.type_id = typeQuestion03;
		question01.creator_id = account03;
		question01.create_date = LocalDate.now();
		
		System.out.println(question01.question_id);
		
		question question02 = new question();
		question02.question_id = 2;
		question02.content = "cau hoi 2";
		question02.category_id = categoryQuestion02;
		question02.type_id = typeQuestion02;
		question02.creator_id = account02;
		question02.create_date = LocalDate.now();
		
		System.out.println(question02.content);
		
		question question03 = new question();
		question03.question_id = 3;
		question03.content = "cau hoi 3";
		question03.category_id = categoryQuestion01;
		question03.type_id = typeQuestion01;
		question03.creator_id = account01;
		question01.create_date = LocalDate.now();
		
		System.out.println(question01.create_date);
		
		
		
		// them doi tuong cho answer
		answer answer01 = new answer();
		answer01.answer_id = 1;
		answer01.content = "cau tra loi 1";
		answer01.question_id = question01;
		answer01.is_correct = true;
		
		System.out.println(answer01.answer_id);
		
		answer answer02 = new answer();
		answer02.answer_id = 2;
		answer02.content = "cau tra loi 2";
		answer02.question_id = question02;
		answer02.is_correct = false;
		
		System.out.println(answer02.is_correct);
		
		answer answer03 = new answer();
		answer03.answer_id = 3;
		answer03.content = "cau tra loi 3";
		answer03.question_id = question03;
		answer03.is_correct = true;
		
		System.out.println(answer03.content);
		
		
		// them moi doi tuong cho exam
		exam exam01 = new exam();
		exam01.exam_id = 1;
		exam01.code = "e123";
		exam01.title = "de thi 1";
		exam01.category_id = categoryQuestion02;
		exam01.duration = 30;
		exam01.creator_id = account01;
		exam01.create_date = LocalDate.now();
		
		System.out.println(exam01.title);
		
		exam exam02 = new exam();
		exam02.exam_id = 2;
		exam02.code = "e333";
		exam02.title = "de thi 2";
		exam02.category_id = categoryQuestion03;
		exam02.duration = 90;
		exam02.creator_id = account03;
		exam02.create_date = LocalDate.now();
		
		System.out.println(exam02.duration);
		
		exam exam03 = new exam();
		exam03.exam_id = 3;
		exam03.code = "e563";
		exam03.title = "de thi 3";
		exam03.category_id = categoryQuestion01;
		exam03.duration = 60;
		exam03.creator_id = account02;
		exam03.create_date = LocalDate.now();
		
		System.out.println(exam03.code);
		
		
		// them doi tuong cho examQuestion
		exam_question examQuestion01 = new exam_question();
		examQuestion01.exam_id = exam01;
		examQuestion01.question_id = question01;
		
		System.out.println(exam01.exam_id);
		
		exam_question examQuestion02 = new exam_question();
		examQuestion02.exam_id = exam02;
		examQuestion02.question_id = question02;
		
		System.out.println(question02.question_id);
		
		exam_question examQuestion03 = new exam_question();
		examQuestion03.exam_id = exam03;
		examQuestion03.question_id = question03;
		
		System.out.println(question03.question_id);
		
		
	}

}
