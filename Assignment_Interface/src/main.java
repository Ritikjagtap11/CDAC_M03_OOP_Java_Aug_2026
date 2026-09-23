
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EquilateralTriangle eT = new EquilateralTriangle(5);
		System.out.println(eT.getNumSides() + " " + eT.getSideLength());
		
		Square sq = new Square(10);
		System.out.println(sq.getNumSides() + " " + sq.getSideLength());
		
		RegularPolygon[] polygons = {
				new EquilateralTriangle(5),
				new EquilateralTriangle(15),
				new Square(14),
				new Square(5)
		};
		
		System.out.println("Total side: " + RegularPolygon.totalSides(polygons));
		System.out.println("Perimeter: " + polygons[0].getPerimeter());
		System.out.println("Interior Angle: " + polygons[0].getInteriorAngle());
	}

}
