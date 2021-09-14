//Trisha Choudhary
//Period 2B, 9/13/19
public class FunctionTables
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.printf("%13s%13s%17s%9s%13s\n", "Number", "Square", "Square Root", "Cube", "Fourth Root");
		for(int i=1; i<=20; i++)
		{
			int a = i;
			double b = Math.pow(i, 2);
			double c = Math.pow(i, (0.5));
			double d = Math.pow(i, 3);
			double e = Math.pow(i, (0.25));
			System.out.printf("%13d%13.0f%17.4f%9.0f%13.4f\n", a, b, c, d, e);
		}
		System.out.println();
	}
}
