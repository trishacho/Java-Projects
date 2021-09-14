import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; 

public class SamenessFactor 
{
	public static void main(String args[]) throws Exception
	{
		File file = new File("D:\\test.txt"); 
	    Scanner sc = new Scanner(file);
	    for(int j=0; j<5; j++)
	    {
	    	String input;
			String one;
			String two;
			ArrayList <Character> String1 = new ArrayList <Character>();
			ArrayList <Character> String2 = new ArrayList <Character>();
			input = sc.nextLine();
			input = input.toUpperCase();
			int space = input.indexOf(" ");
			one = input.substring(0, space);
			two = input.substring(space+1, input.length());
			for(int i=0; i<one.length(); i++)
			{
				String1.add(one.charAt(i));
			}
			for(int i=0; i<two.length(); i++)
			{
				String2.add(two.charAt(i));
			}
			System.out.println("Top: " + String1.toString());
			System.out.println("Bottom: " + String2.toString());
			int k=0;
			while(k<String1.size() && k<String2.size())
			{
				if(String1.get(k) == String2.get(k))
				{
					String1.remove(k);
					String2.remove(k);
					k=0;
				}
				else
				{
					k++;
					if(k == String1.size() || k == String2.size())
					{
						int x = 0; 
						while(x < String1.size() && x < String2.size())
						{
							ArrayList <Character> remove1 = new ArrayList <Character>();
							ArrayList <Character> remove2 = new ArrayList <Character>();
							for(int i=0; i<String1.size(); i++)
							{
								remove1.add(String1.get(i));
							}
							remove1.remove(x);
							for(int i=0; i<String2.size(); i++)
							{
								remove2.add(String2.get(i));
							}
							remove2.remove(x);
							if(x+1 < String1.size() && remove1.get(x) == String2.get(x))
							{
								if(x+1 < String2.size() && remove2.get(x) == String1.get(x))
								{
									String2.remove(x);
									k=0; 
									x=String2.size();
								}
								else
								{
									String1.remove(x);
									k=0;
									x=String1.size();
								}
							}
							else if(x+1 < String2.size() && remove2.get(x) == String1.get(x))
							{
								String2.remove(x);
								k=0; 
								x=String2.size();
							}
							else
							{
								x++;
							}
						}
					}
				}
			}
			int minSize = Math.min(String1.size(), String2.size());
			int total = 0;
			for(int i=0; i<minSize; i++)
			{
				total = total + ((int) String1.get(i) - (int) String2.get(i));
			}
			if(String1.size() < String2.size())
			{
				for(int i=minSize; i<String2.size(); i++)
				{
					total = total + 1;
				}
			}
			else
			{
				for(int i=minSize; i<String1.size(); i++)
				{
					total = total + 1;
				}
			}
			System.out.println("ACSL Sameness Factor: " + total);
			System.out.println();
	    }
	}
}
