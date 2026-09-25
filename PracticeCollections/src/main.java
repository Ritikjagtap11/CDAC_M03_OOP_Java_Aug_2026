import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(56);
		list.add(324);
		list.add(1);
		list.add(0);
//		
//		list.forEach(System.out::println);
//		for(Integer el: list) {
//			System.out.println("el: " + el);
//		}
//		
//		list.remove(Integer.valueOf(1));
		
//		int n = 1;
//		for(int iTmp=0; iTmp < list.size(); iTmp++) {
//			if(n == list.get(iTmp)) {
//				System.out.println("Found  " + list.get(iTmp)+ " at Index " + iTmp );
//				break;
//			}
//		}
		
//		list.sort((a,b) -> Integer.compare(b, a));
		
	
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
			System.out.println("Iterator -> " + itr.next());

	}

}
