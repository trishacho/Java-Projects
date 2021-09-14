import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchRunner 
{
	static int counter = 0;
	public static void BubbleSort(ArrayList <LetterCounter> output)
	{
		for(int i=0; i<output.size(); i++)
		{
			for(int j=i+1; j<output.size(); j++)
			{
				if(output.get(i).compareTo(output.get(j)) == 1)
				{
					LetterCounter temp = new LetterCounter(output.get(i).getCounter(), output.get(i).getLetter());
					output.get(i).set(output.get(j));
					output.get(j).set(temp);
				}
			}
		}
	}
	
	public static boolean BinarySearch(char input, ArrayList <LetterCounter> output)
	{
		LetterCounter check = new LetterCounter(1, input);
		int left = 0;
		int right = output.size() - 1;
		while(left <= right)
		{
			int middle = left + (right-left) / 2;
			if(output.get(middle).compareTo(check) == 0)
			{
				counter++;
				return true;
			}
			if(output.get(middle).compareTo(check) == -1)
			{
				counter++;
				left = middle + 1;
			}
			else
			{
				counter++;
				right = middle - 1;
			}
		}
		return false; 
	}
	
	public static void main(String args[])
	{
		ArrayList <LetterCounter> output = new ArrayList <LetterCounter>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = keyboard.nextLine(); 
		word = word.toLowerCase();
		word = word.replaceAll("\\s", "");
		System.out.println("Enter a letter.");
		char find = keyboard.nextLine().charAt(0);
		LetterCounter first = new LetterCounter(1, word.charAt(0));
		output.add(first);
		for(int i=1; i<word.length(); i++)
		{
			int j = 0;
			boolean different = true;
			while(j < output.size() && different == true)
			{
				if(word.charAt(i) == output.get(j).getLetter())
				{
					different = false;
					output.get(j).setCounter(1);
				}
				j++;
			}
			if(different == true)
			{
				LetterCounter newTerm = new LetterCounter(1, word.charAt(i));
				output.add(newTerm);
			}
		}
		System.out.println("Before bubble sort: " + output.toString());
		BubbleSort(output);
		System.out.println("After bubble sort: " + output.toString());
		if(BinarySearch(find, output) == false)
		{
			System.out.println("Not found.");
		}
		else
		{
			System.out.println("Letter: " + find);
			System.out.println("Number of compares: " + counter);
		}
	}
}
