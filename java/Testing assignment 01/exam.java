package Buoi1;

import java.time.LocalDate;

public class exam {
	int exam_id;
	String code;
	String title;
	categoryQuestion category_id;
	int duration;
	account creator_id;
	LocalDate create_date;
	question[] question_in_exam;
}
