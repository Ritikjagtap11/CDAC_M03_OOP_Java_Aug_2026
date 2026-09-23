
public class Employee {
	
	String name;
	int yearOfJoining;
	String address;
	private double salary;
	private int numberOfHrs;
	
	
	Employee(){} // default con
	
	Employee(String name, int yearOfJoining, String address) // para con
	{
		this.name = name;
		this.yearOfJoining =  yearOfJoining;
		this.address = address;
	}
	
	public void display()
	{
				System.out.println(name + "\t" + yearOfJoining + "\t\t" + address);
	}
	
	
	public void getInfo(double salary, int numberOfHrs)
	{
		this.salary = salary;
		this.numberOfHrs = numberOfHrs;
	}
	
	
	public double addSal()
	{
		if(salary < 500)
			salary += 10;
		
		return salary;
	}
	
	public double addWork() 
	{
		if(numberOfHrs > 6)
			salary+=5;
		
		return salary;
	}
	
	
}
