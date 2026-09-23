
public class Employee {

	String name;
	String address;
	int age;
	String gender;
	double basicSalary;
	
	Employee() {};
	
	Employee(String name,String address,int age,String gender,double basicSalary)
	{
		this.name= name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	};
	
	public Employee addEmployee()
	{
		System.out.print("Enter name: ");
		name = ConsoleInput.getString();
		System.out.print("Enter address: ");
		address = ConsoleInput.getString();
		System.out.print("Enter Age: ");
		age = ConsoleInput.getInt();
		System.out.print("Enter Gender: ");
		gender = ConsoleInput.getString();
		System.out.print("Enter Basic Salary: ");
		basicSalary = ConsoleInput.getDouble();
		
		Employee employee = new Employee(name,address,age,gender,basicSalary);
		
		return employee;
	}

	public void displayEmployee()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Basic Salary: "+basicSalary);
	}
	
}
