
public class Engineer extends Employee {
	
	double overtime;
	
	
	Engineer(String name,String address,int age,String gender,double basicSalary, double overtime)
	{
		super(name,address,age,gender,basicSalary);
		this.overtime = overtime;
	}

//	public void displayEnginerr()
//	{
//		System.out.println("Name: " +name);
//		System.out.println("Address: " +address);
//		System.out.println("Age: " +age);
//		System.out.println("Gender: " +gender);
//		System.out.println("Basic Salary: "+basicSalary);
//		System.out.println("Overtime: "+overtime);
//	}

	@Override
	public String toString() {
		return "Engineer [overtime=" + overtime + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + ", basicSalary=" + basicSalary + "]";
	}
	
}
