import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCounterRunner 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string.");
		String input = keyboard.nextLine(); 
		input = input.toLowerCase();
		input = input.replaceAll("\\s", "");
		List <LetterCounter> output = new ArrayList<LetterCounter>();
		LetterCounter first = new LetterCounter(1, input.charAt(0));
		output.add(first);
		for(int i=1; i<input.length(); i++)
		{
			int j = 0;
			boolean different = true;
			while(j < output.size() && different == true)
			{
				if(input.charAt(i) == output.get(j).getLetter())
				{
					different = false;
					output.get(j).setCounter(1);
				}
				j++;
			}
			if(different == true)
			{
				LetterCounter newTerm = new LetterCounter(1, input.charAt(i));
				output.add(newTerm);
			}
		}
		System.out.println(output.toString());
	}
}
