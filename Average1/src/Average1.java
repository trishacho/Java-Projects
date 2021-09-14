//Trisha Choudhary
//Period 2B, 9/13/19
import java.util.*;
public class Average1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter an integer.");
	    int input = keyboard.nextInt();
	    int total = 0, n = 1;
	    total = total + input;
	    System.out.println("Enter another integer? Y or N.");
	    char reply = keyboard.next().charAt(0);
	    int flag = 0;
	    while(reply == 'Y' && flag == 0)
	    {
	      input = keyboard.nextInt();
	      total = total + input;
	      n++;
	      System.out.println("Enter another integer? Y or N.");
	      reply = keyboard.next().charAt(0);
	      if(reply == 'N')
	      {
	        flag = 1;
	      }
	    }
	    double average = (double) total/n;
	    System.out.println("Average = " + average);
	  }
}
