
public class Student {

	String n;
	int r;
	

	Student(String name,int roll_no){
		n = name;
		r = roll_no;
	}
	
	public void display()
	{
		System.out.println("Name: " + n);
		System.out.println("Roll_No: " + r);
	}
	
	
}
