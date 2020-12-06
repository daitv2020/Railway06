package Entity;

import Backend.ScannerUtils;

public class Position {
	public short id;
	public String name;
	ScannerUtils sc = new ScannerUtils();

	public Position() {
		super();
		id = inputId();
		name = inputName();
	}

	public Position(short id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public short inputId() {
		System.out.println("Nhap id: ");
		return this.id = (short) sc.inputInt("Moi nhap lai id");
	}
	
	
	public String inputName() {
		System.out.println("Nhap position's name");
		return this.name = sc.inputString("Vui long nhap lai ten vi tri");
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

}
