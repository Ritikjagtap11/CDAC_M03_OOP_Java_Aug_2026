
public class Manager extends Employee {
	
	double hra;
	
	Manager () {};
	
	Manager(String name,String address,int age,String gender,double basicSalary,double hra)
	{
		super(name,address,age,gender,basicSalary);
		this.hra = hra;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public Manager addManager()
	{
		addEmployee();
		System.out.print("Enter house rent allowance: ");
		double hra = ConsoleInput.getDouble();
		
		Manager manager = new Manager(name,address,age,gender,basicSalary,hra);
		
		return manager;
	}

	public void displayManager()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("House Rent Allowance: "+basicSalary);
	}
	
	
}
