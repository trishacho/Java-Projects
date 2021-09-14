public class Coordinate 
{
	private int x; //private instance
	private int y; //variables
	public Coordinate()
	{
		x = y = 0;
	}
	public Coordinate(int x, int y)
	{
		this.x = x; //this.x = private instance variable, x = int x from constructor
		this.y = y;
	}
	public void setCoordinate(int x, int y) //mutator method //signature = first line = type, return type, name, parameters
	{
		this.x = x;
		this.y = y;
	}
	public int getX() //accessor method
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public void dilate(int scaleFactor) //mutator method
	{
		x*= scaleFactor;
		y*= scaleFactor;
	}
	public String toString() //overrides existing toString method in object class
	{
		return ("(" + x + ", " + y + ")");
	}
	public void reflectX()
	{
		y = y*(-1);
	}
	public void reflectY()
	{
		x = x*(-1);
	}
}
