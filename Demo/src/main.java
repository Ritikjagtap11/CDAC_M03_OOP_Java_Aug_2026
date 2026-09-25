import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();

		list.add(new Student(120,"kitesh",23,Department.COMPUTER));
		list.add(new Student(100,"Rachana",34,Department.CIVIL));
		list.add(new Student(32,"kahul",44,Department.ELECTRICAL));
		
//		for(Student obj: list) {
//			System.out.println(obj.toString());
//		}
		
		list.stream()
			.sorted((obj1,obj2)-> Integer.compare(obj1.age, obj2.age))
			.sorted((obj1,obj2)-> Integer.compare(obj1.Id, obj2.Id))
			.filter((obj)-> obj.name.startsWith("k"))
			.forEach(System.out::println);
		
		//(a,b) -> Float.compare(a,b) _> b,a
		//---- -> Double.compare(a,b)-
		// (a,b) _> a.comparTO(b)
		
		//(a,b) -> a.name.compareTo(b.name);
		
		
			
		
		
		
		
		

		

	}

}
