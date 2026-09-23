
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOperation Operation = new ArrayOperation();
		
//		//size of array
//		System.out.print("Enter a size of an Array: ");
//		int size = ConsoleInput.getInt();
//		
//		//Input of array element
//		int[] arr = new int[size];
//		Operation.ArrInput(arr);
//		
//		//Print array
//		System.out.println("\nArray: ");
//		Operation.ArrDisplay(arr);
//		+
//		//Array Sort 
//		System.out.println("\n\nSort Array: ");
//		Operation.ArrSort(arr);
//		//After sorting print
//		Operation.ArrDisplay(arr);
//		
//		//sum of array element
//		System.out.println("\n\nSum of an array elements: " + Operation.ArrSum(arr));
//		
//		//sum of array element
//		System.out.println("\nAvg of an array elements: " + Operation.ArrAvg(arr));
//		
//		//created copy of an arr
//		System.out.println("\nCopy of an Array: ");
//		Operation.ArrCopy(arr);
//		
//		//max element of an arr
//		System.out.println("\n\nMax element of an array: " + Operation.ArrMax(arr));
//		
//		//min element of an arr
//		System.out.println("\nMin element of an array: " + Operation.ArrMin(arr));
//		
//		//Reverse element of arr
//		System.out.println("\nReverse Array: ");
//		Operation.ArrReverse(arr);
//		
//		//Find duplicate element of arr
//		System.out.println("\n\nDuplicate Element of an Array: ");
//		Operation.ArrFindDuplicate(arr);
		
		
//		//complexNumber Compute
//		int[] ArrcomplexNum = new int[5];
//		ComplexNumber complexnumber = new ComplexNumber();
//		
//		for(int iTmp=0; iTmp < ArrcomplexNum.length; iTmp++) 
//		{
//			System.out.print("Enter number1: ");
//			int number1 = ConsoleInput.getInt();
//			complexnumber.setNumber1(number1);
//			
//			System.out.print("Enter number2: ");
//			int number2 = ConsoleInput.getInt();
//			complexnumber.setNumber2(number1);
//			
//			System.out.println("Result: " + complexnumber.computeComplexNumber());
//			System.out.println("----------------------------------------");
//		}
		
		//common element of any arr
		System.out.print("Enter a size of an Array1: ");
		int[] arr1 = new int[ConsoleInput.getInt()];
		Operation.ArrInput(arr1);
		System.out.print("Array1: ");
		Operation.ArrDisplay(arr1);
		
		System.out.println();
		
		System.out.print("Enter a size of an Array2: ");
		int[] arr2 = new int[ConsoleInput.getInt()];
		Operation.ArrInput(arr2);
		System.out.print("Array2: ");
		Operation.ArrDisplay(arr2);
		
		System.out.println();
		
		Operation.ArrCommonElement(arr1, arr2);
		
		
	}

}
