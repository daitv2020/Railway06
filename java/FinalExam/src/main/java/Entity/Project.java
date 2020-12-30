package Entity;

import java.util.Arrays;

public class Project {
	private int projectId;
	private int teamSize;
	Manager manager;
	User[] employees;

	public Project(int projectId, int teamSize, Manager manager, User[] employees) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.manager = manager;
		this.employees = employees;
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

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public User[] getEmployees() {
		return employees;
	}

	public void setEmployees(User[] employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", teamSize=" + teamSize + ", manager=" + manager + ", employees="
				+ Arrays.toString(employees) + "]";
	}

}
