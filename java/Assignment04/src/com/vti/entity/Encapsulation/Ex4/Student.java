package com.vti.entity.Encapsulation.Ex4;

public class Student {
	private	int id;
	private	String name;
	private	String hometown;
	private	float score;
	
	// Tạo constructor
	public Student(String name, String hometown) {
		super();
		this.name = name;
		this.hometown = hometown;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public void PlusScore(float score) {
		this.score += score;
	}

	@Override
	public String toString() {
		String hocluc;
		if(score < 4) {
			hocluc = "Yeu";
		}else if(score >=4 && score <6){
			hocluc ="Trung binh";
		}else if(score >=6 && score <8) {
			hocluc = "Kha";
		}else {
			hocluc = "Gioi";
		}
		
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + ", hoc luc=" + hocluc + "]";
	}
	
	
	
	
	
	
	
}
