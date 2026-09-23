
public class DisplayNumber {
	
	//Odd numbers funtion between 1 to 1000
	public void odd()
	{
		System.out.println("Display All Odd Number between 1 to 1000");
		for(int Tmp=0;Tmp<1000;Tmp++)
		{	
			if(Tmp % 2 != 0)
				System.out.print(Tmp + " ");
		}		
		System.out.println();	
	}
	
	
	//Even numbers funtion between 1 to 500
	public void even()
	{
		System.out.println("Display All Even Number between 1 to 500");
		for(int Tmp=0;Tmp<500;Tmp++)
		{	
			if(Tmp % 2 == 0)
				System.out.print(Tmp + " ");
		}
		System.out.println();
	}
	
	//Every 7th numbers funtion between 1 to 200
	public void every7th()
	{
		System.out.println("Display Every 7th Number between 1 to 200");
		for(int Tmp=0;Tmp<200;Tmp++)
		{	
			if(Tmp % 7 == 0)
				System.out.print(Tmp + " ");
		}
		System.out.println();
	}
	
}
