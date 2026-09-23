
public class PrimeMembers extends Member 
{
		int joiningYear;
		double joiningFee;
		boolean isActive = false;
		
		PrimeMembers(String name, int age,String phone_no,String address,int joiningYear,double joiningFee,boolean isActive)
		{
			super(name,age,phone_no,address);
			this.joiningYear = joiningYear;
			this.joiningFee = joiningFee;
			this.isActive = isActive;
		}
		
		
//		
//		public int getJoiningYear() {
//			return joiningYear;
//		}
//		public void setJoiningYear(int joiningYear) {
//			this.joiningYear = joiningYear;
//		}
//		public double getJoiningFee() {
//			return joiningFee;
//		}
//		public void setJoiningFee(double joiningFee) {
//			this.joiningFee = joiningFee;
//		}
//		public boolean isActive() {
//			return isActive;
//		}
//		public void setActive(boolean isActive) {
//			this.isActive = isActive;
//		}
//		
		public void data()
		{	
			System.out.println("-------- Prime Member ---------");
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Phone No: " + phone_no);
			System.out.println("Address: " + address);
			printSalary();
			System.out.println("Joining Year: " + joiningYear);
			System.out.println("Joining Fee: " + joiningFee);
			System.out.println("Is Active: " + isActive);
		}
}
