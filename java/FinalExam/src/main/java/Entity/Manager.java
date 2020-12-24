package Entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(int projectId, int id, String fullname, String email,
			int expInYear, String password) {
		super(projectId, id, fullname, email, password);
		ExpInYear = expInYear;
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
		return "Manager [ExpInYear=" + ExpInYear + ", toString()=" + super.toString() + "]";
	}

}
