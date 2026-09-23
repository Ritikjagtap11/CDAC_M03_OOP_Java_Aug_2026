package org.ritik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		
		//1. added colour
		list.add("Yellow");
		list.add("Red");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		list.add("Purpal");
//		
//		
//		//2. added at position 1
//		list.add(0, "Green");
//		
//		//3. retrive specificed
//		System.out.println("Retrive : " + list.get(4));
//		
//		//4. update
//		list.set(2, "Ritik");
//		
//		//5. remove
//		list.remove(2);
//		
//		//6. search
//		String search ="Red";
//		if(list.contains(search)) 
//			System.out.println(search + ": is present");
//		else
//			System.out.println(search + ": is not found");
//		
		//7. sort
//		Collections.sort(list);
		
		//8. copy the list
//		ArrayList<String> copyList = new ArrayList<>();
//		copyList.add(null);
//		copyList.add(null);
//		copyList.add(null);
//		copyList.add(null);
//		copyList.add(null);
//		copyList.add(null);
		
//		Collections.copy(copyList,list);
//		
//		System.out.println("Copy List----------------------");
//		Iterator<String> itrCopyList = copyList.iterator();
//		while(itrCopyList.hasNext()) {
//			System.out.println(itrCopyList.next());
//		}
		
		//9. shuffle
//		Collections.shuffle(list);
		
		//10. reverse
//		Collections.reverse(list);
//		
//		System.out.println("List----------------------");
//		Iterator<String> itrList = list.iterator();
//		while(itrList.hasNext()) {
//			System.out.println(itrList.next());
//		}
		
	
		//11. TreeSet		
		TreeSet<String> listTree = new TreeSet<>();
		 listTree.add("Yellow");
		 listTree.add("White");
		 listTree.add("Red");
	
//		 //1. print
//		Iterator<String> itrTree = listTree.iterator();
//		while(itrTree.hasNext())
//		System.out.println(itrTree.next());
//		
//		//2. set 
//		TreeSet<String> listTree2 = new TreeSet<>();
//		
//		for(int iTmp=0;iTmp<listTree.size();iTmp++) {
//			listTree2.addAll(listTree);
//		}
//		
//		Iterator<String> itrTree2 = listTree2.iterator();
//		while(itrTree2.hasNext())
//		System.out.println(itrTree2.next());
		
		//3. reverse
//		 listTree.descendingSet();
		 
		 //4. first & last element of set
//		 System.out.println(listTree.first());
//		 System.out.println(listTree.last());
		 
		 //5. grether than or equal to givent elment
//		System.out.println(listTree.ceiling("White"));
		 
		Iterator<String> itrTree = listTree.iterator();
		while(itrTree.hasNext())
		System.out.println(itrTree.next());

	}

}
