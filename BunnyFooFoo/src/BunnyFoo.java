public class BunnyFoo 
{
	private int x;
	private String name;
	public BunnyFoo()
	{
		x = 0;
		name = "";
	}
	public BunnyFoo(int y, String n)
	{
		x = y;
		name = n;
	}
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setX(int y)
	{
		x = y;
	}
	public int getX()
	{
		return this.x;
	}
	
	public String toString()
	{
		return name + " " + x;
	}
	public boolean equals(BunnyFoo m)
	{
		if (this.x == m.getX() && this.name == m.getName())
			return true;
		else 
			return false;
	}
}