import java.util.function.Supplier;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s = ()-> {
			String otp;
			char[] vowelArr = {'A','E','I','O','U'};
			int idxRandom = (int) (Math.random()*vowelArr.length);
			int digit4 =(int) (Math.random()*9000) + 1000;
			
			otp = "" + vowelArr[idxRandom] + digit4;
			
			return otp;
		};
		
		System.out.println(s.get());

	}

}
