import java.io.File;
import java.util.Scanner;

public class ComplexArrRunner 
{
	public static void bubbleSort(ComplexArr []arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].compareTo(arr[j]) == 1)
				{
					ComplexArr temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{	
		ComplexArr [] x = new ComplexArr[10];
		ComplexArr [] y = new ComplexArr[10];
		File file = new File("D:\\test.txt");
		Scanner sc = new Scanner(file);
		String input;
		int n = 0;
		while(sc.hasNextLine())
		{
			input = sc.nextLine();
			Scanner secondScan = new Scanner(input);
			secondScan.useDelimiter(" ");
			while(secondScan.hasNext())
			{
				String realStr = secondScan.next();
				double realDouble = Double.valueOf(realStr);
				String imaginaryStr = secondScan.next();
				double imaginaryDouble = Double.valueOf(imaginaryStr);
				x[n] = new ComplexArr(realDouble, imaginaryDouble);
				n++;
			}
		}
		System.out.println("Array Before Sort: ");
		for(int i=0; i<x.length; i++)
			System.out.println(x[i]);
		bubbleSort(x);
		System.out.println();
		System.out.println("Array After Sort: ");
		for(int i=0; i<x.length; i++)
			System.out.println(x[i]);
			
		
	}
}