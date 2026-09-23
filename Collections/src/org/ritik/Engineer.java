package org.ritik;

public class Engineer extends Employee {

	float overtime;

	public Engineer(String name, String address, int age, String gender, float basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}

	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}

	@Override
	public String toString() {
		return "Engineer [overtime=" + overtime + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + ", basicSalary=" + basicSalary + "]";
	}

}
