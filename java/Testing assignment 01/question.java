package Buoi1;

import java.time.LocalDate;

public class question {
	int question_id;
	String content;
	categoryQuestion category_id;
	type_question type_id;
	account creator_id;
	LocalDate create_date;
	answer[] answer_in_questions;
	
}
