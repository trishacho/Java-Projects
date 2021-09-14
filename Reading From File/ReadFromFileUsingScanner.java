//Trisha Choudhary
//Period 2B, 9/23/19
import java.io.File;
import java.util.Scanner;

public class ReadFromFileUsingScanner 
{ 	 
	public static void main(String[] args) throws Exception 
	{ 
	    // pass the path to the file as a parameter 
	    File file = new File("E:\\test.txt"); 
		//File file = new File("E:\\test.txt");
	    Scanner sc = new Scanner(file); 
	    int input, total = 0, n = 0;
	    while(sc.hasNextInt())
	    {
	    	input = sc.nextInt();
	    	total = total + input;
	    	n++;
	    }
	    double average = (double) total/n;
	    System.out.println("Average = " + average);
	  }
} 