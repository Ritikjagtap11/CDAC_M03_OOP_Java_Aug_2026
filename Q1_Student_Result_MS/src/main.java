import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInput consoleInput = new ConsoleInput();

		
		Result objResult = new Result();
		
		List<Result> listResult = new ArrayList<>();
		
		System.out.print("Enter a number of student to be add: ");
		int noOfStudent = consoleInput.getInt();
		
		for(int iTmp =0; iTmp < noOfStudent; iTmp++) {
			
			System.out.print("Enter Student Name: ");
			String studentName = consoleInput.getString();
			System.out.print("Enter Student Subject Name: ");
			String subjectName = consoleInput.getString();
			System.out.print("Enter Student Subject Mark: ");
			float subjectMark = consoleInput.getFloat();
			
			objResult.setStudentMarks(subjectMark);
			listResult.add(new Result((int)getIdRandom(),studentName,subjectName,subjectMark,getGrade(objResult),LocalDate.now()));
				
		}
		
		listResult.forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Fliter by specifice Grade of student ");
		listResult.stream()
				  .filter((obj)-> obj.getStudentGrade().DISTINCTION.equals(obj.getStudentGrade().DISTINCTION))
				  .forEach(System.out::println);
		
		System.out.println("---------------------------------------");
		System.out.println("Averege of student as per subject");
		List<Result> listAvg = listResult.stream()
				  .filter((o1) -> o1.getStudentSubjectName().equals("History"))
				  .sorted((o1,o2) -> Float.compare(o1.getStudentMarks(),o1.getStudentMarks()))
				  .toList();
		
		for(Result list: listAvg) {
			System.out.println("Avg");
			
		}
		
		System.out.println("---------------------------------------");
		
		Optional<Result> maxMarks = listResult.stream()
				  .max((o1,o2)->Float.compare(o1.getStudentMarks(), o2.getStudentMarks()));
		System.out.println("Maximum marks : " + maxMarks);
		        
		
		System.out.println("---------------------------------------");
		System.out.println("Sorting descending order by Marks");
		listResult.stream()
				 .sorted((o1,o2)->Float.compare(o2.getStudentMarks(), o1.getStudentMarks()))
				 .forEach(System.out::println);
		
	}

	private static GradeGenric getGrade(Result objResult) {
		if(objResult.getStudentMarks() >= 75.00)
			return GradeGenric.DISTINCTION;
		else if(objResult.getStudentMarks() >= 60.00)
			return GradeGenric.FIRST_CLASS;
		else if(objResult.getStudentMarks() >= 50.00)
			return GradeGenric.SECOND_CLASS;
		else if(objResult.getStudentMarks() >= 40.00)
			return GradeGenric.PASS;
		else
			return GradeGenric.FAIL;
	}

	private static double getIdRandom() {
		double id = Math.random()*100;
		return id;
	}

	

}
