package org.ritik;

public class Employee {

	protected String name;
	protected String address;
	protected int age;
	protected String gender;
	protected float basicSalary;

	public Employee(String name, String address, int age, String gender, float basicSalary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender
				+ ", basicSalary=" + basicSalary + "]";
	}

}
