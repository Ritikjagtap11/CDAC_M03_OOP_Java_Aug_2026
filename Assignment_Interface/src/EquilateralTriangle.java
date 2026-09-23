
public class EquilateralTriangle implements RegularPolygon{
	
	int length=0;
	
	public EquilateralTriangle(int length) {
		super();
		this.length = length;
	}

	
	
	@Override
	public int getNumSides() {
		return 3;	
	}

	@Override
	public int getSideLength() {
		// TODO Auto-generated method stub
		return length;
	}
}
