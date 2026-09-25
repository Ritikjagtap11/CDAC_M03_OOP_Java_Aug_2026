
public class main {


	   public static void main(String[] args) {
		   
		   int age = 16;
		   
		   checkAge(age);
		   
		   
	   }

	   private static void checkAge(int age) {
		try {
			if(age < 18) {
				   throw new InvalidAgeException("Not adult");
			   }
			   System.out.println("Adult");
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

//	   private static void checkAge(int age) throws InvalidAgeException {
//		try {
//			if(age < 18)
//				   throw new InvalidAgeException("Age must be 18 or above");
//			   else
//				   System.out.println("Eligible");
//		} catch (InvalidAgeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	   }
}
