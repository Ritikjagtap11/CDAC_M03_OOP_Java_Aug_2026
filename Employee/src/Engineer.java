
public class Engineer extends Employee {
	
	double overtime;
	
	Engineer(String name,String address,int age,String gender,double basicSalary, double overtime)
	{
		super(name,address,age,gender,basicSalary);
		this.overtime = overtime;
	}
}
