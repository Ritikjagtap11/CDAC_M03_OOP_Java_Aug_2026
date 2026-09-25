
public class Student {

	int Id;
	String name;
	int age;
	Department dept;
	
	public Student(int id, String name,int age,Department dept) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}



	
	
	
}
