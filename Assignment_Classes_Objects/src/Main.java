
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//StudentInfo
//		Student s1 = new Student("John",2,"8261846266","Dhule");
//		Student s2 = new Student("Sham",1,"8261846266","Amalner");
//		s1.display();
//		s2.display();
		
		//Perimeter of Traingle
//		Traingle traingle = new Traingle(3,4,5);
//		System.out.println("Area of Traingle is: " + traingle.area());
//		System.out.println("Perimeter of Traingle is: " + traingle.perimeter());
		
		//Complex number
//		Complex complex =  new Complex();
//		System.out.print("Enter real no: ");
//		complex.setReal(ConsoleInput.getInt());
//		System.out.print("Enter img no: ");
//		complex.setImg(ConsoleInput.getInt());
//		complex.display();
		
		//Employee Information
//		Employee e1 = new Employee("Robert",1994,"64C- WallsStreat");
//		Employee e2 = new Employee("Sham",2000,"68D- WallsStreat");
//		Employee e3 = new Employee("John",1999,"26B- WallsStreat");
//		
//		System.out.println("Name\tYear of joining\tAddress");
//
//		e1.display();
//		e2.display();
//		e3.display();
		
		//Methods - Info, addSal, addWork 
		Employee e = new Employee();
		e.getInfo(60000,8);
		
		System.out.println("Add Salary: " + e.addSal());
		System.out.println("Add Salary with working Hrs: " + e.addWork());
		
		
		
		
	}

}
