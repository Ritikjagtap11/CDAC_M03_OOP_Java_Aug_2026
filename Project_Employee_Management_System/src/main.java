import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;

public class main {

	public static void main(String[] args) {

		Employee[] employeeArr = new Employee[100];
		File path = new File("C:\\Java\\Employee_Management_System\\src\\Employee.txt");

		// For the Add Category

		final int ADD_MANAGER = 1;

		final int ADD_ENGINEER = 2;

		final int ADD_SALES_PERSON = 3;

		// For the Display Category

		final int DISPLAY_MANAGER = 1;

		final int DISPLAY_ENGINEER = 2;

		final int DISPLAY_SALES_PERSON = 3;

		final int DISPLAY_ALL_EMPLOYEE = 4;

		// For the Sort Category

		final int SORT_MANAGER = 1;

		final int SORT_ENGINEER = 2;

		final int SORT_SALES_PERSON = 3;

		final int SORT_ALPHABETICAL_ORDER_ASECNDING = 4;

		final int SORT_ALPHABETICAL_ORDER_DESECNDING = 5;

		int count = 0; // count of EmployeeArr index

		int choice; // Menu choices

		System.out.println("------- EMPLOYEE MANAGEMENT SYSTEM --------");

		do {

			System.out.println("-----------------------------------");
			System.out.println("1. Add");
			System.out.println("2. Save");
			System.out.println("3. Display");
			System.out.println("4. Delete");
			System.out.println("5. Sort");
			System.out.println("6. Load");
			System.out.println("7. Exit");
			System.out.println("-----------------------------------");

			System.out.println("Enter your choice");
			choice = ConsoleInput.getInt();

			switch(choice) {

			case 1:

				int choiceForAdd = 1;

				do {

					System.out.println("-----------------------------------");
					System.out.println("1. Add Manager");
					System.out.println("2. Add Engineer");
					System.out.println("3. Add Sales Person");
					System.out.println("4. Exit");
					System.out.println("-----------------------------------");

					System.out.println("Enter your choice to add employee: ");
					choiceForAdd = ConsoleInput.getInt();

					if(choiceForAdd == ADD_MANAGER) {

						System.out.print("Enter name: ");
						String name = ConsoleInput.getString();

						System.out.print("Enter address: ");
						String address = ConsoleInput.getString();

						System.out.print("Enter Age: ");
						int age = ConsoleInput.getInt();

						System.out.print("Enter Gender: ");
						String gender = ConsoleInput.getString();

						System.out.print("Enter Basic Salary: ");
						double basicSalary = ConsoleInput.getDouble();

						System.out.print("Enter house rent allowance: ");
						double hra = ConsoleInput.getDouble();

						employeeArr[count++] = new Manager(
								name, address, age, gender, basicSalary, hra);

						System.out.println("Manager employee added successfully");
						System.out.println("-----------------------------------");

					}

					else if(choiceForAdd == ADD_ENGINEER) {

						System.out.print("Enter name: ");
						String name = ConsoleInput.getString();

						System.out.print("Enter address: ");
						String address = ConsoleInput.getString();

						System.out.print("Enter Age: ");
						int age = ConsoleInput.getInt();

						System.out.print("Enter Gender: ");
						String gender = ConsoleInput.getString();

						System.out.print("Enter Basic Salary: ");
						double basicSalary = ConsoleInput.getDouble();

						System.out.print("Enter Overtime: ");
						double overtime = ConsoleInput.getDouble();

						employeeArr[count++] = new Engineer(
								name, address, age, gender, basicSalary, overtime);

						System.out.println("Engineer employee added successfully");
						System.out.println("-----------------------------------");

					}

					else if(choiceForAdd == ADD_SALES_PERSON) {

						System.out.print("Enter name: ");
						String name = ConsoleInput.getString();

						System.out.print("Enter address: ");
						String address = ConsoleInput.getString();

						System.out.print("Enter Age: ");
						int age = ConsoleInput.getInt();

						System.out.print("Enter Gender: ");
						String gender = ConsoleInput.getString();

						System.out.print("Enter Basic Salary: ");
						double basicSalary = ConsoleInput.getDouble();

						System.out.print("Enter Commision: ");
						double commision = ConsoleInput.getDouble();

						employeeArr[count++] = new SalesPerson(
								name, address, age, gender, basicSalary, commision);

						System.out.println("Sales Person employee added successfully");
						System.out.println("-----------------------------------");

					}

					else if(choiceForAdd == 4) {

						System.out.println("Exited from Add menu");
						System.out.println("-----------------------------------");

					}

					else {

						System.out.println("Invalid Choice");

					}

				} while(choiceForAdd != 4);

				break;


			case 2:

				FileOutputStream filestream = null;
				ObjectOutputStream objectstream = null;

				try {

					filestream = new FileOutputStream(path);
					objectstream = new ObjectOutputStream(filestream);

					for(Employee objEmployee: employeeArr) {

						if(objEmployee != null) {
							objectstream.writeObject(objEmployee);
						}
					}

					System.out.println("Data Saved Successfully");

				} catch (FileNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					e.printStackTrace();

				}

				finally {

					try {

						if(objectstream != null)
							objectstream.close();

						if(filestream != null)
							filestream.close();

					} catch (IOException e) {

						e.printStackTrace();

					}
				}

				break;


			case 3:

				int choiceForDisplay;

				do {

					System.out.println("-----------------------------------");
					System.out.println("1. Manager details");
					System.out.println("2. Engineer details");
					System.out.println("3. Sales Person details");
					System.out.println("4. All details");
					System.out.println("5. Exit");
					System.out.println("-----------------------------------");

					System.out.print("Enter your choice to display details: ");
					choiceForDisplay = ConsoleInput.getInt();

					if(choiceForDisplay == DISPLAY_MANAGER) {

						System.out.println("Manager Details");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof Manager) {

								Manager manager = (Manager) employeeArr[iTmp];

								manager.displayManager();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForDisplay == DISPLAY_ENGINEER) {

						System.out.println("Engineer Details");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof Engineer) {

								Engineer engineer = (Engineer) employeeArr[iTmp];

								engineer.displayEnginerr();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForDisplay == DISPLAY_SALES_PERSON) {

						System.out.println("Sales Person Details");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof SalesPerson) {

								SalesPerson salesperson =
										(SalesPerson) employeeArr[iTmp];

								salesperson.displaySalesPerson();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForDisplay == DISPLAY_ALL_EMPLOYEE) {

						System.out.println("All Details");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof Manager) {

								Manager manager =
										(Manager) employeeArr[iTmp];

								manager.displayManager();

								System.out.println("-----------------------------------");

							}

							else if(employeeArr[iTmp] instanceof Engineer) {

								Engineer engineer =
										(Engineer) employeeArr[iTmp];

								engineer.displayEnginerr();

								System.out.println("-----------------------------------");

							}

							else if(employeeArr[iTmp] instanceof SalesPerson) {

								SalesPerson salesperson =
										(SalesPerson) employeeArr[iTmp];

								salesperson.displaySalesPerson();

								System.out.println("-----------------------------------");

							}

							else {

								employeeArr[iTmp].displayEmployee();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForDisplay == 5) {

						System.out.println("Exited from Display menu");
						System.out.println("-----------------------------------");

					}

					else {

						System.out.println("Invalid Choice for display");

					}

				} while(choiceForDisplay != 5);

				break;


			case 4:

				System.out.println("Not implemented");
				System.out.println("-----------------------------------");

				break;


			case 5:

				int choiceForSort;

				do {

					System.out.println("-----------------------------------");
					System.out.println("1. All Manager");
					System.out.println("2. All Engineer");
					System.out.println("3. All Sales Person");
					System.out.println("4. All Employee Alphabetic order ascending");
					System.out.println("5. All Employee Alphabetic order descending");
					System.out.println("6. Exit");
					System.out.println("-----------------------------------");

					System.out.print("Enter your choice to sort: ");
					choiceForSort = ConsoleInput.getInt();

					if(choiceForSort == SORT_MANAGER) {

						System.out.println("Sorted by manager");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof Manager) {

								Manager manager =
										(Manager) employeeArr[iTmp];

								manager.displayManager();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForSort == SORT_ENGINEER) {

						System.out.println("Sorted by Engineer");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof Engineer) {

								Engineer engineer =
										(Engineer) employeeArr[iTmp];

								engineer.displayEnginerr();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForSort == SORT_SALES_PERSON) {

						System.out.println("Sorted by Sales Person");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count; iTmp++) {

							if(employeeArr[iTmp] instanceof SalesPerson) {

								SalesPerson salesperson =
										(SalesPerson) employeeArr[iTmp];

								salesperson.displaySalesPerson();

								System.out.println("-----------------------------------");

							}
						}
					}

					else if(choiceForSort == SORT_ALPHABETICAL_ORDER_ASECNDING) {

						System.out.println("Sorted by alphabetical order ascending");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count - 1; iTmp++) {

							for(int jTmp = iTmp + 1; jTmp < count; jTmp++) {

								if(employeeArr[iTmp].name.compareTo(
										employeeArr[jTmp].name) > 0) {

									Employee temp = employeeArr[iTmp];

									employeeArr[iTmp] = employeeArr[jTmp];

									employeeArr[jTmp] = temp;

								}
							}
						}

					}

					else if(choiceForSort == SORT_ALPHABETICAL_ORDER_DESECNDING) {

						System.out.println("Sorted by alphabetical order descending");
						System.out.println("-----------------------------------");

						for(int iTmp = 0; iTmp < count - 1; iTmp++) {

							for(int jTmp = iTmp + 1; jTmp < count; jTmp++) {

								if(employeeArr[iTmp].name.compareTo(
										employeeArr[jTmp].name) < 0) {

									Employee temp = employeeArr[iTmp];

									employeeArr[iTmp] = employeeArr[jTmp];

									employeeArr[jTmp] = temp;

								}
							}
						}

					}

					else if(choiceForSort == 6) {

						System.out.println("Exited from Sort menu");
						System.out.println("-----------------------------------");
						break;

					}

					else {

						System.out.println("Invalid Choice");

					}

				} while(choiceForSort != 6);

				break;


			case 6:

				FileInputStream filestreamLoad = null;
				ObjectInputStream objectstreamLoad = null;

				try {

					filestreamLoad = new FileInputStream(path);
					objectstreamLoad = new ObjectInputStream(filestreamLoad);

					int index = 0;

					try {

						while(true) {

							Object data = objectstreamLoad.readObject();

							employeeArr[index] = (Employee)data;

							index++;
						}

					} catch(EOFException e) {

						count = index;

						System.out.println("Data Loaded Successfully");

					} catch(ClassNotFoundException e) {

						e.printStackTrace();

					}

				} catch(FileNotFoundException e) {

					e.printStackTrace();

				} catch(IOException e) {

					e.printStackTrace();

				}

				finally {

					try {

						if(objectstreamLoad != null)
							objectstreamLoad.close();

						if(filestreamLoad != null)
							filestreamLoad.close();

					} catch(IOException e) {

						e.printStackTrace();

					}
				}

				System.out.println("-----------------------------------");

				break;


			case 7:

				System.out.println("Exited from main menu");
				System.out.println("-----------------------------------");

				break;


			default:

				System.out.println("Invalid Choice :)");
				System.out.println("-----------------------------------");

			}

		} while(choice != 7);

	}

}