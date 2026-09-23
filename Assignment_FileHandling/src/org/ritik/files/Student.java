package org.ritik.files;
import java.io.Serializable;
public class Student implements Serializable {
		
	String name;
	float marks;
	int roll_no;
	
	public Student(String name, float marks, int roll_no) {
		this.name = name;
		this.marks = marks;
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	
	
}
