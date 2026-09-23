
public class ArrayOperation 
{
	
	//Input of an arr
	public void ArrInput(int[] arr) 
	{
		System.out.println("Enter a "+arr.length+" Element of an Array: ");
		for(int iTmp=0; iTmp < arr.length; iTmp++) 
		{			
			arr[iTmp] = ConsoleInput.getInt();
		}
	}
	
	//Display of an arr
	public void ArrDisplay(int[] arr) 
	{
		for(int iTmp=0; iTmp < arr.length; iTmp++) 
		{			
			System.out.print(arr[iTmp] + " ");
		}
	}
	
	//Sort of an arr Ascending order
	public void ArrSort(int[] arr) 
	{
		
		for(int iTmp= 0; iTmp < arr.length-1; iTmp++) 
		{						
			for(int jTmp = iTmp + 1; jTmp < arr.length; jTmp++)   
			{																									 
				if(arr[iTmp] > arr[jTmp]) 
				{
					int temp = arr[iTmp];
					arr[iTmp] = arr[jTmp];
					arr[jTmp] = temp;
				}
				
			}
		}
		
	}
	
	//Sum of an arr elements
	public int ArrSum(int[] arr) 
	{
		int sum=0;
		for(int iTmp=0; iTmp < arr.length; iTmp++) 
		{
			sum+=arr[iTmp];
		}
		
		return sum;
	}
	
	//Avg of an arr
	public float ArrAvg(int[] arr) 
	{
		return ArrSum(arr) / arr.length;
	}
	
	//Create Copy of an arr
	public void ArrCopy(int[] arr) 
	{
		int[] arrCopy = new int[arr.length];
		
		for(int iTmp=0; iTmp < arr.length; iTmp++) {
			arrCopy[iTmp] = arr[iTmp];
		}
		
		
		ArrDisplay(arrCopy);
	}
	
	//Max element of an arr
	public int ArrMax(int[] arr) 
	{
		int max=arr[0];
		
		for(int iTmp=0; iTmp < arr.length; iTmp++) 
		{
			if(arr[iTmp] > max)
				max = arr[iTmp];
		}
		
		return max;
	}
	
	//Min element of an arr
	public int ArrMin(int[] arr) 
	{
		int min=arr[0];
		
		for(int iTmp=0; iTmp < arr.length; iTmp++) 
		{
			if(arr[iTmp] < min)
				min = arr[iTmp];
		}
		
		return min;
	}
	
	//Reverse element of an arr
	public void ArrReverse(int[] arr) 
	{	
		for(int iTmp=arr.length-1; iTmp >= 0; iTmp--) 
		{
			System.out.print(arr[iTmp] + " ");
		}	
		
	}
	
	//Find duplicate element of an arr
		public void ArrFindDuplicate(int[] arr) 
		{	
			for(int iTmp=0; iTmp < arr.length; iTmp++) 
			{	
				for(int jTmp=iTmp+1; jTmp < arr.length; jTmp++)
				{
						if(arr[iTmp] == arr[jTmp]) 
						{
							System.out.print(arr[iTmp] + " ");
						}
				}	
			}		
		}
		
		//Find duplicate element of an arr
				public void ArrCommonElement(int[] arr1, int[]arr2) 
				{	
					boolean Isfound = false;
					
					if(arr1.length < arr2.length) 
					{
						for(int iTmp=0; iTmp < arr1.length; iTmp++) 
						{		
									if(arr1[iTmp] == arr2[iTmp]) 
									{
										System.out.print(arr1[iTmp] + " ");
										Isfound = true;
									}
									
						}
					}
					else if(arr1.length > arr2.length) 
					{
						for(int iTmp=0; iTmp < arr2.length; iTmp++) 
						{		
									if(arr1[iTmp] == arr2[iTmp]) 
									{
										System.out.print(arr1[iTmp] + " ");
										Isfound = true;
									}
						}
					}
					else
					{
						for(int iTmp=0; iTmp < arr1.length; iTmp++) 
						{		
									if(arr1[iTmp] == arr2[iTmp]) 
									{
										System.out.print(arr1[iTmp] + " ");
										Isfound = true;
									}
						}
					}
					
					if(Isfound != true)
						System.out.println("Not Found");
				}
	
	
}
