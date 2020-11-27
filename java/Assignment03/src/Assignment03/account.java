package Assignment03;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class account {
	int accountId;
	String email;
	String userName;
	String fullName;
	LocalDate createDate;
	department department;
	position position;
	float salary1;
	
	
	
	group[] groups;
	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + ", department=" + department + ", position=" + position
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	
	
}
