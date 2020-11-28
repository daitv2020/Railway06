package Assignment04;

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
	
	// tạo constructor không có parameter
	public account() {
		super();
	}

	// Có các parameter là id, Email, Username, FirstName,LastName (với FullName = FirstName + LastName)
	public account(int accountId, String email, String userName, String firstName, String lastName) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}
//	Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, default createDate = now
	public account(int accountId, String email, String userName, String firstName, String lastName,
			Assignment04.position position) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.createDate = LocalDate.now();
		this.position = position;
	}
//	d) Có các parameter là id, Email, Username, FirstName,
//	LastName (với FullName = FirstName + LastName) và
//	Position của User, createDate
	public account(int accountId, String email, String userName, String firstName, String lastName, LocalDate createDate,
			Assignment04.position position) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.createDate = createDate;
		this.position = position;
	}





	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + ", department=" + department + ", position=" + position
				+ ", groups=" + Arrays.toString(groups) + "]";
	}


	
	
}
