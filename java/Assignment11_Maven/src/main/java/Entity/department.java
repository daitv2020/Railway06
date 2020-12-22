package Entity;

public class department {
	private int departmentId;
	private String departmentName;

	public department() {
		super();
	}

	public department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
