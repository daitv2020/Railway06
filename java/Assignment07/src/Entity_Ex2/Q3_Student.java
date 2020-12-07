package Entity_Ex2;

public class Q3_Student {
	private int id;
	private String name;
	
	public final static void study() {
		System.out.println("Dang hoc bai");
	}

	public Q3_Student(int id, String name) {
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
		return "Q3_Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
