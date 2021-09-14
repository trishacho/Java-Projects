import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 
{
	public static void main(String args[])
	{
		System.out.println("Enter two integer values.");
		int int1;
		int int2;
		Scanner sc = new Scanner(System.in);
		int1 = sc.nextInt();
		int2 = sc.nextInt();
		double d = (double) int1/int2;
		List <Character> output = new ArrayList<Character>();
		String decimal = Double.toString(d);
		output.add(decimal.charAt(2));
		output.add(decimal.charAt(3));
		for(int i=4; i<decimal.length(); i++)
		{
			int j = 0;
			boolean different = true;
			while(j < output.size() && different == true)
			{
				if(decimal.charAt(i) == output.get(j))
				{
					different = false;
					i = decimal.length();
				}
				j++;
			}
			if(different == true)
			{
				output.add(decimal.charAt(i));
			}
		}
		System.out.print("0.");
		for(int i=0; i<output.size(); i++)
		{
			System.out.print(output.get(i));
		}
		System.out.println();
		System.out.print("Number of digits: " + output.size());
	}
}
