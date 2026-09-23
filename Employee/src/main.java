
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] Storage= new Employee[100];
		int iTmp =0;
		int count=1;
		
//		Employee emp = new Employee("Ritik","Dhule",24,"Male",50000);
//		emp.display();
		
//		for(int i=0;i<Storage.length;i++) 
//		{
//			Storage[i] = new Employee("Ritik","Dhule",24,"Male",50000);
//		}
//		
//		for(int i=0;i<Storage.length;i++) 
//		{
//			System.out.println(Storage[i].getName());
//		}
		
		
		
		System.out.println("-------EMPLOYEE MANAGEMENT SYSTEM--------");
		int choice;
		do {
			System.out.print("Enter your choice");
			choice = ConsoleInput.getInt();
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Sort");
			System.out.println("5. Load");
			System.out.println("6. exit");
			
			
			
			switch(choice)
			{
				case 1:
						System.out.print("Enter your choice to add employee: ");
						int choiceAdd = ConsoleInput.getInt();
						do {
						System.out.println("1. Add Employee");
						System.out.println("2. Add Manager");
						System.out.println("3. Add Engineer");
						System.out.println("4. Add Sales Person");
						System.out.println("5. exit");
						
						
							switch(choiceAdd)
							{
								case 1:
									Employee employee = new Employee();
									
									Storage[iTmp] = employee.addEmployee();
									iTmp++;
									count++;
									System.out.println("Employee added sussesfully");
									
									break;
								case 2:
									Manager manager = new Manager();
									
									Storage[iTmp] = manager.addManager();
									iTmp++;
									count++;
									System.out.println("Employee added sussesfully");
									
									break;
								case 3:
									Employee employee = new Employee();
									
									Storage[iTmp] = employee.addEmp();
									iTmp++;
									count++;
									System.out.println("Employee added sussesfully");
									
									break;
								case 4:
									Employee employee = new Employee();
									
									Storage[iTmp] = employee.addEmp();
									iTmp++;
									count++;
									System.out.println("Employee added sussesfully");
									
									break;
								case 5:
			
									System.out.println("Exited........");
									
									break;
							}
						}while(choiceAdd > 5);
						
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:System.out.println("Invalid Choice :)");
			
			}
			
		}while(choice > 6);
		
	}

}
