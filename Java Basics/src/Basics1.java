import java.util.*;
public class Basics1 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 10;
		System.out.println(a+b);
		System.out.println ((double)b/a);

		System.out.println(3/4);
		System.out.println(3.0/4);
		System.out.println(3/4.0);
		System.out.println((int)3.0/4);
		System.out.println((double)3/4);
		System.out.println((double)(3/4));

		System.out.println(a==b);

		String first = "Aksara";
		String last = "Bayyapu";
		String space = " ";
		System.out.println(first + space + last);

		final double PI = 3.14;
		System.out.println (PI);

		char symbol = '7';
		System.out.println(symbol);
		System.out.println((int)symbol);

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter an integer");
		int n1 = keyboard.nextInt();

		System.out.println("Please enter a floating point number");
		double d1 = keyboard.nextDouble();

		System.out.println("please enter one word");
		String s1 = keyboard.next();

		//all is well up until this point.
		//why doesn't this work???
		//look up the behavior behind nextline and why we have to do it twice
		System.out.println("Please enter a sentence");
		String s2 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		System.out.println(n1 + space + d1 + space + s1 + space + s2);

		//using escape sequence to print out quotes
		System.out.println("\"hi\"");
		double z = 5.0/10;
		System.out.println(z);
		System.exit(0);
	}
}