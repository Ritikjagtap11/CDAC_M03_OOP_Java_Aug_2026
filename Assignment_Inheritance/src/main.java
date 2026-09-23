
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.
//		Parent parent = new Parent();
//		parent.display();
//		
//		Child child = new Child();
//		child.display();
		
//		A. Upcasting
//		Parent parent = new Parent();
//		Child child = new Child();
//		parent = child;
//		System.out.print(parent);
		
//		B. Downcasting
//		Parent parent = new Child();
//		Child xchild = (Child)parent;
//		xchild.display();
		
		
		
		//2.
		Member member;
		
		
		System.out.print("Name: ");
		String name = ConsoleInput.getString();
		
		System.out.print("Age: ");
		int age = ConsoleInput.getInt();
		
		System.out.print("Phone number: ");
		String phone_no = ConsoleInput.getString();
		
		System.out.print("Address: ");
		String address = ConsoleInput.getString();
		
		member =new Member(name,age,phone_no,address);
		
		System.out.print("Salary: ");
		member.setSalary(ConsoleInput.getFloat());
		
//		member.data();
		
		PrimeMembers primeMember; 
		
		System.out.print("Joining Year: ");
		int setJoiningYear = ConsoleInput.getInt();
		
		System.out.print("Joining Fee: ");
		float setJoiningFee = ConsoleInput.getFloat();
		
		System.out.print("Is Active: ");
		boolean setActive = ConsoleInput.getBoolean();
		
		primeMember =  new PrimeMembers(name,age,phone_no,address,setJoiningYear,setJoiningFee,setActive);
		
		primeMember.data();
		
//		//3.
//		Rectangle rectangle = new Rectangle(5,8);
//		System.out.println("Rectangle Area: " + rectangle.area());
//		System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
//		
//		Square square = new Square(4);
//		System.out.println("Square Area: " + square.area());
//		System.out.println("Square Perimeter: " + square.perimeter());
		
		//4.
//		
//		Shape shape = new Shape();
//		RectangleShape rectShape = new RectangleShape();
//		CircleShape cirshape = new CircleShape();
//		SquareShape sqrshape = new SquareShape();
//		
//		shape.shapePrint();
//		rectShape.rectangleShapePrint();
//		cirshape.circleShapePrint();
//		sqrshape.squrRectPrint();
	}

}
