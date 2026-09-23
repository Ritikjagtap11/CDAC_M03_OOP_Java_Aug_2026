
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.ritik.consoleinput.ConsoleInput;

public class main {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<>();

		// Add Category
		final int ADD_MANAGER = 1;
		final int ADD_ENGINEER = 2;
		final int ADD_SALES_PERSON = 3;

		// Sort Category
		final int SORT_MANAGER = 1;
		final int SORT_ENGINEER = 2;
		final int SORT_SALES_PERSON = 3;
		final int SORT_ALPHABETICAL_ORDER_ASCENDING = 4;
		final int SORT_ALPHABETICAL_ORDER_DESCENDING = 5;

		int choice;

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
			System.out.print("Enter your choice: ");

			choice = ConsoleInput.getInt();

			switch (choice) {

			// ---------------------------------------------------------
			// ADD
			// ---------------------------------------------------------
			case 1:

				int choiceForAdd;

				do {

					System.out.println("-----------------------------------");
					System.out.println("1. Add Manager");
					System.out.println("2. Add Engineer");
					System.out.println("3. Add Sales Person");
					System.out.println("4. Exit");
					System.out.println("-----------------------------------");
					System.out.print("Enter your choice to add employee: ");

					choiceForAdd = ConsoleInput.getInt();

					if (choiceForAdd == ADD_MANAGER) {

						System.out.println("-----------------------------------");

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

						System.out.print("Enter House Rent Allowance: ");
						double hra = ConsoleInput.getDouble();

						Manager objManager = new Manager(name, address, age, gender, basicSalary, hra);

						employeeList.add(objManager);

						System.out.println("-----------------------------------");
						System.out.println("Manager employee added successfully");
					}

					else if (choiceForAdd == ADD_ENGINEER) {

						System.out.println("-----------------------------------");

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

						Engineer objEngineer = new Engineer(name, address, age, gender, basicSalary, overtime);

						employeeList.add(objEngineer);

						System.out.println("-----------------------------------");
						System.out.println("Engineer employee added successfully");
					}

					else if (choiceForAdd == ADD_SALES_PERSON) {

						System.out.println("-----------------------------------");

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

						System.out.print("Enter Commission: ");
						double commission = ConsoleInput.getDouble();

						SalesPerson objSalesPerson = new SalesPerson(name, address, age, gender, basicSalary,
								commission);

						employeeList.add(objSalesPerson);

						System.out.println("-----------------------------------");
						System.out.println("Sales Person employee added successfully");
					}

					else if (choiceForAdd == 4) {

						System.out.println("-----------------------------------");
						System.out.println("Exited from Add menu");
					}

					else {

						System.out.println("-----------------------------------");
						System.out.println("Invalid Choice");
					}

				} while (choiceForAdd != 4);

				break;

			// ---------------------------------------------------------
			// SAVE
			// ---------------------------------------------------------
			case 2:

				FileOutputStream filestream = null;
				ObjectOutputStream objectstream = null;

				try {

					filestream = new FileOutputStream("C:\\Java\\Employee_Management_System\\src\\Employee.txt");

					objectstream = new ObjectOutputStream(filestream);

					Iterator<Employee> iteratorEmployeeList = employeeList.iterator();

					while (iteratorEmployeeList.hasNext()) {

						objectstream.writeObject(iteratorEmployeeList.next());
					}

					System.out.println("-----------------------------------");
					System.out.println("Data Saved Successfully");

				} catch (FileNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					e.printStackTrace();

				} finally {

					try {

						if (objectstream != null)
							objectstream.close();

						if (filestream != null)
							filestream.close();

					} catch (IOException e) {

						e.printStackTrace();
					}
				}

				System.out.println("-----------------------------------");
				break;

			// ---------------------------------------------------------
			// DISPLAY
			// ---------------------------------------------------------
			case 3:

				System.out.println("-----------------------------------");
				System.out.println("All Employee Details");
				System.out.println("-----------------------------------");

				Iterator<Employee> iteratorEmployeeList = employeeList.iterator();

				if (iteratorEmployeeList.next() instanceof Manager objManager) {

					System.out.println(objManager);// Java automatically call objManager.toString();
					System.out.println("-----------------------------------");

				} else if (iteratorEmployeeList.next() instanceof Engineer objEngineer) {

					System.out.println(objEngineer);// Java automatically call objManager.toString();
					System.out.println("-----------------------------------");
					
				} else if (iteratorEmployeeList.next() instanceof SalesPerson objSalesPerson) {

					System.out.println(objSalesPerson);// Java automatically call objManager.toString();
					System.out.println("-----------------------------------");
				}
				break;

			// ---------------------------------------------------------
			// DELETE
			// ---------------------------------------------------------
			case 4:

				System.out.println("-----------------------------------");
				System.out.println("Delete operation not implemented");
				System.out.println("-----------------------------------");

				break;

			// ---------------------------------------------------------
			// SORT
			// ---------------------------------------------------------
			case 5:

				int choiceForSort;

				do {

					System.out.println("-----------------------------------");
					System.out.println("1. All Manager");
					System.out.println("2. All Engineer");
					System.out.println("3. All Sales Person");
					System.out.println("4. All Employee Alphabetic Order Ascending");
					System.out.println("5. All Employee Alphabetic Order Descending");
					System.out.println("6. Exit");
					System.out.println("-----------------------------------");
					System.out.print("Enter your choice to sort: ");

					choiceForSort = ConsoleInput.getInt();

					// -------------------------------------------------
					// MANAGER
					// -------------------------------------------------
					if (choiceForSort == SORT_MANAGER) {

						System.out.println("-----------------------------------");
						System.out.println("Manager Employees");
						System.out.println("-----------------------------------");

						Iterator<Employee> iteratorSortManager = employeeList.iterator();

						while (iteratorSortManager.hasNext()) {

							Employee employee = iteratorSortManager.next();

							if (employee instanceof Manager objManager) {

								System.out.println(objManager);
								System.out.println("-----------------------------------");
							}
						}
					}

					// -------------------------------------------------
					// ENGINEER
					// -------------------------------------------------
					else if (choiceForSort == SORT_ENGINEER) {

						System.out.println("-----------------------------------");
						System.out.println("Engineer Employees");
						System.out.println("-----------------------------------");

						Iterator<Employee> iteratorSortEngineer = employeeList.iterator();

						while (iteratorSortEngineer.hasNext()) {

							Employee employee = iteratorSortEngineer.next();

							if (employee instanceof Engineer objEngineer) {

								System.out.println(objEngineer);
								System.out.println("-----------------------------------");
							}
						}
					}

					// -------------------------------------------------
					// SALES PERSON
					// -------------------------------------------------
					else if (choiceForSort == SORT_SALES_PERSON) {

						System.out.println("-----------------------------------");
						System.out.println("Sales Person Employees");
						System.out.println("-----------------------------------");

						Iterator<Employee> iteratorSortSalesPerson = employeeList.iterator();

						while (iteratorSortSalesPerson.hasNext()) {

							Employee employee = iteratorSortSalesPerson.next();

							if (employee instanceof SalesPerson objSalesPerson) {

								System.out.println(objSalesPerson);
								System.out.println("-----------------------------------");
							}
						}
					}

					// -------------------------------------------------
					// ASCENDING
					// -------------------------------------------------
					else if (choiceForSort == SORT_ALPHABETICAL_ORDER_ASCENDING) {

						System.out.println("-----------------------------------");
						System.out.println("Employees - Alphabetical Order Ascending");
						System.out.println("-----------------------------------");

						Iterator<Employee> iteratorSortAscending = employeeList.iterator();

						while (iteratorSortAscending.hasNext()) {
						    Employee emp1 = iteratorSortAscending.next();

						    if (iteratorSortAscending.hasNext()) {
						        Employee emp2 = iteratorSortAscending.next();

						        if (emp1.name.compareTo(emp2.name) > 0) {
						            // Swap
						            int index1 = employeeList.indexOf(emp1);
						            int index2 = employeeList.indexOf(emp2);

						            employeeList.set(index1, emp2);
						            employeeList.set(index2, emp1);
						        }
						    }
						}
						System.out.println("-----------------------------------");

					}

					// -------------------------------------------------
					// DESCENDING
					// -------------------------------------------------
					else if (choiceForSort == SORT_ALPHABETICAL_ORDER_DESCENDING) {

						System.out.println("-----------------------------------");
						System.out.println("Employees - Alphabetical Order Descending");
						System.out.println("-----------------------------------");

						Iterator<Employee> iteratorSortDescending = employeeList.iterator();

						while (iteratorSortDescending.hasNext()) {
						    Employee emp1 = iteratorSortDescending.next();

						    if (iteratorSortDescending.hasNext()) {
						        Employee emp2 = iteratorSortDescending.next();

						        if (emp1.name.compareTo(emp2.name) < 0) {
						            // Swap
						            int index1 = employeeList.indexOf(emp1);
						            int index2 = employeeList.indexOf(emp2);

						            employeeList.set(index1, emp2);
						            employeeList.set(index2, emp1);
						        }
						    }
						}
						System.out.println("-----------------------------------");

					}

					else if (choiceForSort == 6) {

						System.out.println("-----------------------------------");
						System.out.println("Exited from Sort menu");
					}

					else {

						System.out.println("-----------------------------------");
						System.out.println("Invalid Choice");
					}

				} while (choiceForSort != 6);

				break;

			// ---------------------------------------------------------
			// LOAD
			// ---------------------------------------------------------
			case 6:

				FileInputStream filestreamLoad = null;
				ObjectInputStream objectstreamLoad = null;

				try {

					filestreamLoad = new FileInputStream("C:\\Java\\Employee_Management_System\\src\\Employee.txt");

					objectstreamLoad = new ObjectInputStream(filestreamLoad);

					employeeList.clear();

					while (true) {

						try {

							Employee employee = (Employee) objectstreamLoad.readObject();

							employeeList.add(employee);

						} catch (EOFException e) {

							break;
						}
					}

					System.out.println("-----------------------------------");
					System.out.println("Data Loaded Successfully");
					System.out.println("Total Employees Loaded: " + employeeList.size());

				} catch (FileNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					e.printStackTrace();

				} catch (ClassNotFoundException e) {

					e.printStackTrace();

				} finally {

					try {

						if (objectstreamLoad != null)
							objectstreamLoad.close();

						if (filestreamLoad != null)
							filestreamLoad.close();

					} catch (IOException e) {

						e.printStackTrace();
					}
				}

				System.out.println("-----------------------------------");
				break;

			// ---------------------------------------------------------
			// EXIT
			// ---------------------------------------------------------
			case 7:

				System.out.println("-----------------------------------");
				System.out.println("Exited from main menu");
				System.out.println("-----------------------------------");

				break;

			default:

				System.out.println("-----------------------------------");
				System.out.println("Invalid Choice :)");
				System.out.println("-----------------------------------");
			}

		} while (choice != 7);
	}
}
