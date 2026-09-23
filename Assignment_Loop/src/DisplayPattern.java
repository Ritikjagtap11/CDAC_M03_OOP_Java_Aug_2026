
public class DisplayPattern {
	
	//print pattern following
	/*
	*
	**
	***
	****
	*****  
	*/
	public void pattern1() 
	{
		for(int iTmp=0; iTmp < 5; iTmp++) //row
		{
			for(int jTmp=0; jTmp < iTmp+1; jTmp++) //col
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	
	//print pattern following
		/*
		*****
		****
		***
		**
		*  
		*/
		public void pattern2() 
		{
			for(int iTmp=0; iTmp < 5; iTmp++) //row
			{
				for(int jTmp=0; jTmp < 5-iTmp; jTmp++) //col
				{
					System.out.print("* ");
				}
			System.out.println();
			}
		}
		
		
		
		public void pattern3() 
		{
			int num =1;
			for(int iTmp=1; iTmp <= 5; iTmp++) //row
			{
				for(int jTmp=1; jTmp <= iTmp; jTmp++) //col
				{
					System.out.print(num+" ");
					num++;
				}
				System.out.println();
			}
		}
		
		public void pattern4()
		{		
			for(int iTmp=0; iTmp < 6; iTmp++) //row
			{
				for(int jTmp=0; jTmp < iTmp + 1; jTmp++) //col
				{
					System.out.print(jTmp+1);
				}
			System.out.println();
			}
		}
		
		public void pattern5()
		{		
			for(int iTmp=1; iTmp <= 6; iTmp++) //row
			{
				for(int jTmp=1; jTmp <= (6-iTmp) + 1 ; jTmp++) //col
				{
					System.out.print(jTmp);
				}
			System.out.println();
			}
		}

}
