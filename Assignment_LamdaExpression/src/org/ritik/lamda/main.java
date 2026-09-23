package org.ritik.lamda;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. sorting
//		String[] arr = {"Ritik","Vivek","Sachin","Ritesh"};
//		
//		Sort s = (el) -> java.util.Arrays.sort(el);
//		
//		s.Sort(arr);
//		
//		for(String str: arr) {
//			System.out.println(str);
//		}
		
		//2. Largest
//		int[] arr = {59,54,2,1,43,23};
//		
//		Largest num = (a) -> {
//			int max = a[0];
//			
//			for(int iTmp=0; iTmp < a.length;iTmp++) {
//				
//				if(a[iTmp] > max)
//					max = a[iTmp];
//			}
//			return max;
//		};
//		
//		System.out.println("Largest: "+num.largest(arr));
		
		//3. Smallest
//		int[] arr = {59,54,2,1,43,23};
//		
//		Smaller num = (a)->
//		{
//			int min = a[0];
//			
//			for(int iTmp=0; iTmp < a.length; iTmp++)
//			{
//				if(a[iTmp] < min)
//					min = a[iTmp];
//			}
//			
//			return min;
//		};
//		
//		System.out.println("Smallest: "+num.smallest(arr));
		
		//4. random 3 three
//		RandomNum r = ()-> (int)(Math.random()*900)+100;
//		System.out.println(r.randomNum());
		
		//5. Reverse array
//		int[] arr = {1,2,3,4,5,6};
//		
//		Reverse reverse = (a) ->  
//		{
//			for(int iTmp=a.length-1; iTmp>=0;iTmp--)
//			{
//				System.out.print(a[iTmp] + " ");
//			}
//		};
//		
//		reverse.Reverse(arr);
		
		//6. date 
//		Date d = () -> System.out.println(LocalDate.now()) ;
//		d.date();
		
		//7. checkPrime
//		IsPrime p = (e) -> {
//			boolean prime = true;
//			
//			if(e <= 1) 
//				return false;
//
//			for (int i = 2; i < e; i++) {
//                if (e % i == 0)
//                    return false;
//            }
//			
//			return true;
//			
//			
//		};
//		
//		if(p.isPrime(45))
//			System.out.println("Prime");
//		else
//			System.out.println("Not Prime");
		
		//8. concatenet string
//		ConcatnetStr str = (str1,str2) ->  System.out.println(str1+str2);
//		
//		str.concatnetStr("Ritik", "Vivek");
	}

}
