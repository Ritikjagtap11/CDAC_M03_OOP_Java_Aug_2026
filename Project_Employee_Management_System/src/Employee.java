import java.io.Serializable;

public class Employee implements Serializable{

	String name;
	String address;
	int age;
	String gender;
	double basicSalary;
	
	
	Employee(String name,String address,int age,String gender,double basicSalary)
	{
		this.name= name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	};
	

	public void displayEmployee()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Basic Salary: "+basicSalary);
	}
	
}
