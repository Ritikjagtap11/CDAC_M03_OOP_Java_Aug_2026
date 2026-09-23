
public class Student {

		String name;
		int roll_no;
		String phone_no;
		String address;
		
		Student(String name,int roll_no,String phone_no,String address)
		{	
			this.name = name;
			this.roll_no = roll_no;
			this.phone_no = phone_no;
			this.address = address;
		}
		
		
		
		public void display() 
		{
			System.out.println("Roll_No: " + roll_no);
			System.out.println("Name: " + name);
			System.out.println("Phone_No: " + phone_no);
			System.out.println("Address: " + address);
			System.out.println();
		}
		
		
}
