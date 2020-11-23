package Buoi1;

import java.time.LocalDate;
import java.util.Arrays;

public class account {
	int accountId;
	String email;
	String userName;
	String fullName;
	LocalDate createDate;
	department department;
	position position;
	group[] groups;
	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + ", department=" + department + ", position=" + position
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	
	// ví dụ sửa lại hàm so sánh equals()
public boolean equals(account account2) {
		
		if(accountId == account2.accountId 
			&&  fullName == account2.fullName){
			return true;
			
		}else{			
			return false;			
		}
		
	}

	
	
}
