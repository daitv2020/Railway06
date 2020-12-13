package Entity_Ex1;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student other) {
		if(name.compareTo(other.name) > 0) {
			return 1;
		}else if (name.compareTo(other.name) < 0) {
			return -1;
		}
		return 0;
	}


	
	
	
	
}
