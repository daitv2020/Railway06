package Entity;
public class Position {
	public short id;
	public String name;
	
	
	
	
	public Position() {
		super();
	}




	public Position(short id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
