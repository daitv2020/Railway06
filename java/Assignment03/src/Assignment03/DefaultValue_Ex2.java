package Assignment03;

import java.time.LocalDate;

public class DefaultValue_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 1:
//			Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//			tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//			Email: "Email 1"
//			Username: "User name 1"
//			FullName: "Full name 1"
//			CreateDate: now
		
		account[] accounts = new account[5];
		for (int i = 0; i< accounts.length ; i++) {
			accounts[i] = new account();
			accounts[i].accountId = i;
			accounts[i].userName = "account " + i;
			accounts[i].email = "account" + i + "@gmail.com";
			accounts[i].createDate = LocalDate.now();
			}
		for (account account: accounts) {
			System.out.print("ID:" + account.accountId + "	");
			System.out.print("userName:" + account.userName + "	");
			System.out.print("fullName:" + account.fullName + "	");
			System.out.print("email:" + account.email + "	");
			System.out.println("createDate:" + account.createDate);
		}
		
		
		
		
		
		
		
		
		
	}

}
