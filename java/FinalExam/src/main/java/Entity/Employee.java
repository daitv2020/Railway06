package Entity;

public class Employee extends User {

	private int projectId;
	private String proSkill;
	
	public Employee(int id, String fullname, String email, String password, int projectId, String proSkill) {
		super(id, fullname, email, password);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
	public Employee(String fullname, String email) {
		super(fullname, email);
	}
	public Employee(int id, String fullname, String email, String password) {
		super(id, fullname, email, password);
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
		return "Employee [projectId=" + projectId + ", proSkill=" + proSkill + ", toString()=" + super.toString() + "]";
	}

	
}
