
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ritik";
//		str = str + "Jagtap";
//		System.out.println(str);
		
		StringBuffer objStr = new StringBuffer(str);
		objStr.append("Jagtap");
		System.out.println(objStr);
		
		for(int iTmp=0;iTmp<objStr.length();iTmp++) {
			
			char ch = 'g';
			if(ch == objStr.charAt(iTmp))
				System.out.println("Found " + ch + " at index : " + iTmp);
			
			
		}
		
	
			
		
	}

}
