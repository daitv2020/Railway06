package Entity;

public class Employee extends User {

	private int projectId;
	private String proSkill;

	public Employee(int projectId, int id, String fullname, String email,
			String password, String proSkill) {
		super(projectId, id, fullname, email, password);
		this.proSkill = proSkill;
	}

	public Employee() {
		super();
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [ "+ "proSkill=" + proSkill  + super.toString() + "]";
	}

}
