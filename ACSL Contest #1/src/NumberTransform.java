//Trisha Choudhary
//12/16/19
//Enloe HS
//ACSL Contest 1_Int_5

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; 

public class NumberTransform
{
	public static void main(String args[]) throws Exception 
	{
	    File file = new File("E:\\test.txt"); 
	    Scanner sc = new Scanner(file);
	    for(int i=0; i<5; i++)
	    {
			String number;
			String position;
			ArrayList <Integer> output = new ArrayList <Integer>();
			number = sc.nextLine();
			int space = number.indexOf(" ");
			position = number.substring(space+2);
			number = number.substring(0, space);
			int p = Integer.parseInt(position);
			String pDigitString = number.substring(number.length()-p, (number.length()-p)+1);
			int pDigit = Integer.parseInt(pDigitString);
			int sum = 0;
			for(int j=0; j<number.length()-p; j++)
			{
				String current = number.substring(j, j+1);
				int currentNumber = Integer.parseInt(current);
				sum = pDigit + currentNumber;
				if(sum >= 10)
				{
					sum = sum%10;
				}
				output.add(sum);
			}
			output.add(pDigit);
			for(int j=((number.length()-p)+1); j<number.length(); j++)
			{
				String current = number.substring(j, j+1);
				int currentNumber = Integer.parseInt(current);
				sum = Math.abs(pDigit - currentNumber);
				output.add(sum);
			}
			for(int j=0; j<output.size(); j++)
			{
				System.out.print(output.get(j));
			}
			System.out.println();
	    }
	}
}