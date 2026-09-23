
public interface RegularPolygon {
	
	public int getNumSides();
	public int getSideLength();
	
	
	static int totalSides(RegularPolygon[] polygons)
	{
		int sum = 0;
		
		for(int iTmp=0; iTmp < polygons.length; iTmp++) {
			sum+=polygons[0].getNumSides();
		}
		
		return sum;
		
	}
	
	default int getPerimeter(){	
		return getNumSides() * getSideLength();
	}
	
	default int getInteriorAngle() {
		int n = getNumSides();
	    return (int) (((n - 2) * Math.PI) / n);
	}
}
