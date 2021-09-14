public class Triangle
{
	private Coordinate a;
	private Coordinate b;
	private Coordinate c;
	public Triangle()
	{
		a = new Coordinate(0,0);
		b = new Coordinate(0,0);
		c = new Coordinate(0,0);
	}
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		a = new Coordinate(x1, y1);
		b = new Coordinate(x2, y2);
		c = new Coordinate(x3, y3);
	}
	public void dilate(int scaleFactor)
	{
		a.dilate(scaleFactor);
		b.dilate(scaleFactor);
		c.dilate(scaleFactor);
	}
	public String toString()
	{
		String first = a.toString();
		String second = b.toString();
		String third = c.toString();
		return("A " + first + "B " + second + "C " + third);
	}
	public void reflectX()
	{
		a.reflectX();
		b.reflectX();
		c.reflectX();
	}
	public void reflectY()
	{
		a.reflectY();
		b.reflectY();
		c.reflectY();
	}
	public double distance(int x1, int y1, int x2, int y2)
	{
		double distance = Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
		return distance;
	}
	public double area()
	{
		double sideA = distance(a.getX(), a.getY(), b.getX(), b.getY());
		double sideB = distance(b.getX(), b.getY(), c.getX(), c.getY());
		double sideC = distance(a.getX(), a.getY(), c.getX(), c.getY());
		double s = (sideA + sideB + sideC)*(0.5);
		double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		return area;
	}
	public double perimeter()
	{
		double sideA = distance(a.getX(), a.getY(), b.getX(), b.getY());
		double sideB = distance(b.getX(), b.getY(), c.getX(), c.getY());
		double sideC = distance(a.getX(), a.getY(), c.getX(), c.getY());
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}
}