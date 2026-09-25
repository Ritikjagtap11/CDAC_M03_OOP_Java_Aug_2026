import java.time.LocalDate;

public class Result {
	
	int studentId;
	String studentName;
    String studentSubjectName;
    float  studentMarks;
    GradeGenric studentGrade;
    LocalDate studentDate;
    
    public Result() {}
    
	public Result(int studentId, String studentName, String studentSubjectName,float  studentMarks,
			GradeGenric studentGrade, LocalDate studentDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSubjectName = studentSubjectName;
		this.studentMarks = studentMarks;
		this.studentGrade = studentGrade;
		this.studentDate = studentDate;
	}
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSubjectName() {
		return studentSubjectName;
	}

	public void setStudentSubjectName(String studentSubjectName) {
		this.studentSubjectName = studentSubjectName;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	

	public GradeGenric getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(GradeGenric studentGrade) {
		this.studentGrade = studentGrade;
	}

	public LocalDate getStudentDate() {
		return studentDate;
	}

	public void setStudentDate(LocalDate studentDate) {
		this.studentDate = studentDate;
	}

	@Override
	public String toString() {
		return "Result [studentId=" + studentId + ", studentName=" + studentName + ", studentSubjectName="
				+ studentSubjectName + ", studentMarks=" + studentMarks + ", studentGrade=" + studentGrade
				+ ", studentDate=" + studentDate + "]";
	}


	
	
	
	
    
	
}
