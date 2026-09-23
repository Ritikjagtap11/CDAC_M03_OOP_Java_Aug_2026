
public class Square extends Rectangle
{

	int side;
	
	Square(int side)
	{
		super(side,side);
		this.side = side;
	}
	
	public int area() 
	{
		return side*side;
	}
	
	public int perimeter() 
	{
		return 4*side;
	}
}
