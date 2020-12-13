package Entity_Ex2;

import java.time.LocalDate;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private float score;

	public Student() {
		super();
	}
	

	public Student(String name) {
		super();
		this.name = name;
	}


	public Student(int id, String name, LocalDate dateOfBirth, float score) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.score = score;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", score=" + score + "]";
	}


	@Override
	public int compareTo(Student other) {
		if(name.compareTo(other.name) >0 ) {
			return 1;
		}else if (name.compareTo(other.name) <0 ) {
			return -1;
		}
		return 0;
	}
	

	

}
