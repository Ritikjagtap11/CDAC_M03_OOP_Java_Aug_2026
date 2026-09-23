package org.ritik;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<EmployeeId>{


	@Override
	public int compare(EmployeeId o1, EmployeeId o2) {
		// TODO Auto-generated method stub
		if(o1.id == o2.id)
			return 0;
		else if(o1.id >= o2.id)
			return 1;
		else
			return -1;
	}

	
}
