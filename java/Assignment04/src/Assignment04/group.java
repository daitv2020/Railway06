package Assignment04;

import java.time.LocalDate;
import java.util.Arrays;

public class group {
	int groupId;
	String groupName;
	account account;
	LocalDate createDate;
	String[] usernames;
	
	account[] accounts;

	// không có parameters
	public group() {
		super();
	}
	//Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate

	public group(String groupName, Assignment04.account account, LocalDate createDate,
			Assignment04.account[] accounts) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	// c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
	public group(String groupName, Assignment04.account account, LocalDate createDate, String[] usernames) {
		super();
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
		this.usernames = usernames;
	}

	@Override
	public String toString() {
		return "group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + ", usernames=" + Arrays.toString(usernames) + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}
	


	
	
}
