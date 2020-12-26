package Entity;

public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;
	private int idEmployees;
	public Project(int projectId) {
		super();
		this.projectId = projectId;
	}
	public Project() {
		super();
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public int getIdManager() {
		return idManager;
	}
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	public int getIdEmployees() {
		return idEmployees;
	}
	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId +"]";
	}
	
}
