
public class Manager extends Employee {
	
	double hra;
	

	
	Manager(String name,String address,int age,String gender,double basicSalary,double hra)
	{
		super(name,address,age,gender,basicSalary);
		this.hra = hra;
	}

	public void displayManager()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("House Rent Allowance: "+hra);
	}
	
	
}
