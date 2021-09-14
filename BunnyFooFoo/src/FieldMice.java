public class FieldMice 
{
	private int x;
	private String name;
	public FieldMice()
	{
		x = 0;
		name = "";
	}
	public FieldMice(int y, String n) 
	{
		x = y;
		name = n; 
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setX(int y)
	{
		x = y;
	}
	public String getName()
	{
		return name;
	}
	public int getX()
	{
		return x;
	}
	public boolean equals(FieldMice m)
	{
		if (this.x == m.getX() && this.name == m.getName())
			return true;
		else 
			return false;
	}
	public String toString()
	{
		return name + " " + x;
	}
}