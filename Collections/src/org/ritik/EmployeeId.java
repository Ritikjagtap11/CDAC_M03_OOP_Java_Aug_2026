package org.ritik;

public class EmployeeId {

	int id;

	
	
	public EmployeeId(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeId [id=" + id + "]";
	}
	
	
}
