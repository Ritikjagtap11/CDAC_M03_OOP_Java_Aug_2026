
public class Traingle {
	
	int side1;
	int side2;
	int side3;
	
	Traingle(int side1, int side2, int side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public int perimeter() {
		return side1+side2+side3;
	}
	
	public int area() {
		return (side1*side2)/2;
	}
	
}
