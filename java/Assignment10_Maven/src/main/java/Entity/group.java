package Entity;

import java.time.LocalDate;
import java.util.Arrays;

public class group {
	int groupId;
	String groupName;
	account account;
	LocalDate createDate;
	
	account[] accounts;

	@Override
	public String toString() {
		return "group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}
	
	
	
	
}


