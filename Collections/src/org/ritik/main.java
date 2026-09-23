package org.ritik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
//		
//		list.add("first");
//		list.add("secound");
//		list.add("third");
//		
//		Iterator iterator = list.iterator();
//		
//		while(iterator.hasNext())
//		{
//			String data = (String)iterator.next();
//			System.out.println(data);
//		}

//		ArrayList<String> list = new ArrayList<>();
//		list.add("Ritik");
//		list.add("Vivek");
//		
//		Iterator<String> iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//		LinkedList<String> list = new LinkedList<>();
//		list.add("first");
//		list.add("Secound");
//		list.add("third");
//		
//		list.add(1, "NewData");
//		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(23);
//		list.add(0);
//		list.add(1);
//		list.add(100);
//		
//		Collections.sort(list);
//		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		ArrayList<Employee> employeeList = new ArrayList<>();

		Engineer e1 = new Engineer("Ritik", "Dhule", 21, "male", 35000.00f, 5000);
		Engineer e2 = new Engineer("Sachin", "Amalner", 24, "male", 45000.00f, 3000);
		Engineer e3 = new Engineer("Vivek", "Nandurbar", 24, "male", 35000.00f, 2000);

		employeeList.add(e3);
		employeeList.add(e1);
		employeeList.add(e2);

		Collections.sort(employeeList, new EmployeeNameComparator());

		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

//		HashSet<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(4);
//		set.add(5);
//		
////		Collections.sort(set);
//		
//		Iterator<Integer> setItr = set.iterator();
//		while(setItr.hasNext())
//			System.out.println(setItr.next());

//		
//		SortedSet<Integer> sortList = new SortedSet<>();
//		sortList.add(1);
//		sortList.add(2);
//		sortList.add(3);
//		sortList.add(4);
//		sortList.add(4);
//		sortList.add(5);
//		
//		//		Collections.sort(set);
//		
//		Iterator<Integer> sortSetItr = sortList.iterator();
//		while(sortSetItr.hasNext())
//			System.out.println(sortSetItr.next());

//		TreeSet<Employee> employeeList = new TreeSet<>(new EmployeeNameComparator());
//		
//		Engineer e1 = new Engineer("Ritik","Dhule",21,"male",35000.00f,5000);
//		Engineer e2 = new Engineer("Sachin","Amalner",24,"male",45000.00f,3000);
//		Engineer e3 = new Engineer("Vivek","Nandurbar",24,"male",35000.00f,2000);
//		
//		employeeList.add(e3);
//		employeeList.add(e1);
//		employeeList.add(e2);
//	
//		Iterator<Employee> itr = employeeList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		Map<Integer,String> map = new HashMap<>();
//		
//		map.put(1, "Ritik");
//		map.put(2, "Vivek");
//		map.put(3, "Sachin");

//		System.out.println("Get all values");
//		Iterator<String> itr = map.values().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		System.out.println("Get all key");
//		Iterator<Integer> itr = map.keySet().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		System.out.println("Get all key:Values");
//		Set<Entry<Integer,String>> allEntries = map.entrySet();
//		
//		Iterator<Entry<Integer,String>> itrSet = allEntries.iterator();
//		while(itrSet.hasNext()) {
//			System.out.println(itrSet.next());
//		}

			// Map<EmployeeId,Employee> map = new TreeMap<>(new EmployeeIdComparator());

//		Engineer e1 = new Engineer("Ritik","Dhule",21,"male",35000.00f,5000);
//		Engineer e2 = new Engineer("Sachin","Amalner",24,"male",45000.00f,3000);
//		Engineer e3 = new Engineer("Vivek","Nandurbar",24,"male",35000.00f,2000);
//		
//		map.put(new EmployeeId(1001), e1);
//		map.put(new EmployeeId(1002), e2);
//		map.put(new EmployeeId(1003), e3);
////		
//		Iterator<Employee> valueItr = map.values().iterator();
//		while(valueItr.hasNext())
//			System.out.println(valueItr.next());

//		Iterator<EmployeeId> keyItr =map.keySet().iterator();
//		while(keyItr.hasNext())
//			System.out.println(keyItr.next());

//		Set<Entry<EmployeeId,Employee>> allEntries = map.entrySet();
//		
//		Iterator<Entry<EmployeeId,Employee>> keyValueItr = allEntries.iterator();
//		while(keyValueItr.hasNext()) {
//			Entry<EmployeeId,Employee> entry = keyValueItr.next();
//			System.out.println("Key:" + entry.getKey());
//			System.out.println("Value:" + entry.getValue());
//			System.out.println("*********");
//		}

		}

	}
}
