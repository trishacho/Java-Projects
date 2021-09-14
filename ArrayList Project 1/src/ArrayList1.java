import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string.");
		String input = keyboard.nextLine(); 
		input = input.toLowerCase();
		input = input.replaceAll("\\s", "");
		List <Character> output = new ArrayList<Character>();
		output.add(input.charAt(0));
		for(int i=1; i<input.length(); i++)
		{
			int j = 0;
			boolean different = true;
			while(j < output.size() && different == true)
			{
				if(input.charAt(i) == output.get(j))
				{
					different = false;
				}
				j++;
			}
			if(different == true)
			{
				output.add(input.charAt(i));
			}
		}
		List <Integer> count = new ArrayList<Integer>();
		for(int i=0; i<output.size(); i++)
		{
			int counter = 0;
			for(int j=0; j<input.length(); j++)
			{
				if(output.get(i) == input.charAt(j))
					counter++;
			}
			count.add(counter);
		}
		System.out.println(output.toString());
		System.out.println(count.toString());
	}
}
