package org.ritik;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub

		if (o1.getName().compareTo(o2.getName()) == 0)
			if (o1.getAge() == o2.getAge())
				return 1;
			else
				return -1;
		else if (o1.getName().compareTo(o2.getName()) >= 0)// ascending
			return 1;
		else
			return -1;
	}

}
