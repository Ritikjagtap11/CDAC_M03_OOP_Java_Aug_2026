
public class SalesPerson extends Employee {
	
	double commision;
	

	SalesPerson(String name,String address,int age,String gender,double basicSalary, double commision)
	{
		super(name,address,age,gender,basicSalary);
		this.commision = commision;
	}


	public void displaySalesPerson()
	{
		System.out.println("Name: " +name);
		System.out.println("Address: " +address);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Commision: "+commision);
	}
	
}
