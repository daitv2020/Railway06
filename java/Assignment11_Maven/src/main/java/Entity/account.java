package Entity;

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
	
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public department getDepartment() {
		return department;
	}
	public void setDepartment(department department) {
		this.department = department;
	}
	public position getPosition() {
		return position;
	}
	public void setPosition(position position) {
		this.position = position;
	}
	public float getSalary1() {
		return salary1;
	}
	public void setSalary1(float salary1) {
		this.salary1 = salary1;
	}
	public group[] getGroups() {
		return groups;
	}
	public void setGroups(group[] groups) {
		this.groups = groups;
	}
	group[] groups;
	@Override
	public String toString() {
		return "account [accountId=" + accountId + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + ", department=" + department + ", position=" + position
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	
	
}
