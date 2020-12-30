package Entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(int id, String fullname, String email, String password, int expInYear) {
		super(id, fullname, email, password);
		ExpInYear = expInYear;
	}

	public Manager(int id, String fullname, String email, int expInYear) {
		super(id, fullname, email);
		ExpInYear = expInYear;
	}
	public Manager(String fullname, String email) {
		super(fullname, email);
	}


	public Manager() {
		super();
	}


	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + super.toString() + "]";
	}

}
