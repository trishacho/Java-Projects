//Trisha Choudhary
//April 8th, 2020
//Int 5
//Enloe HS
//Contest #4

import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class Patolli
{
   public static boolean prime(int num)
   { 
	   if(num <= 1)
	   {
		   return false;
	   }
	   for(int i=2; i<num; i++)
	   {
		   if(num % i == 0)
		   {
			   return false;
		   }
	   }
	   return true;
   }
   
   public static boolean perfectSquare(int num)
   {
	   if(num <= 4)
	   {
		   return false;
	   }
	   else
	   {
		   double sqrt = Math.sqrt(num);
		   return((sqrt - Math.floor(sqrt)) == 0);
	   }
   }
   
   public static boolean specialRule(int pos1, int pos2)
   {
	   if(pos1 <= 6 && pos2 >= 8 || pos1 <= 11 && pos2 >= 13 || pos1 <= 16 && pos2 >= 18 || pos1 <= 21 && pos2 >= 23 || 
		  pos1 <= 26 && pos2 >= 28 || pos1 <= 35 && pos2 >= 37 || pos1 <= 40 && pos2 >= 42 || pos1 <= 45 && pos2 >= 47 ||
		  pos1 <= 49 && pos2 >= 51)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }

   public static void main(String[] args) throws Exception
   {
	   File file = new File("D:\\int.txt"); 
	   Scanner sc = new Scanner(file);
	   for(int j=0; j<5; j++)
	   {
		   String input;
		   input = sc.nextLine();
		   StringTokenizer tokenizer = new StringTokenizer(input);

		   int pos1B, pos2B, pos3B, pos1A, pos2A, pos3A;
		   pos1B = Integer.valueOf(tokenizer.nextToken());
		   pos2B = Integer.valueOf(tokenizer.nextToken());
		   pos3B = Integer.valueOf(tokenizer.nextToken());
		   pos1A = Integer.valueOf(tokenizer.nextToken());
		   pos2A = Integer.valueOf(tokenizer.nextToken());
		   pos3A = Integer.valueOf(tokenizer.nextToken());
		   
		   int numberOfRolls = 0;
		   numberOfRolls = Integer.parseInt(tokenizer.nextToken());
		   
		   int roll = 0;	   
		   for(int i=0; i<numberOfRolls; i++)
		   {
			   roll = Integer.parseInt(tokenizer.nextToken());
			   if(pos1A < pos2A && pos1A < pos3A)
			   {
				   pos1A = pos1A + roll;
				   if(pos1A == pos2A || pos1A == pos3A || pos1A == pos1B || pos1A == pos2B || pos1A == pos3B || pos1A > 52)
				   {					   
					   pos1A = pos1A - roll;
				   }
				   else if(prime(pos1A))
				   {
					   boolean done = false;
					   for(int k=pos1A; k<=(pos1A+6); k++)
					   {
						   if(k > 51)
						   {
							   break;
						   }
						   if(k == pos2A || k == pos3A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos1A = k - 1;
							   break;
						   }
					   }
					   if(done == false)
						   pos1A = pos1A + 6;
				   }
				   else if(perfectSquare(pos1A))
				   {
					   boolean done = false;
					   for(int k=pos1A; k>=pos1A-6; k--)
					   {
						   if(k == pos2A || k == pos3A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos1A = k + 1;
							   break;
						   } 
					   }
					   if(done == false)
						   pos1A = pos1A - 6;
				   }
				   else if(specialRule(pos1A - roll, pos1A))
				   {
					   for(int k=pos1A; k>=(pos1A-roll); k--)
					   {
						   if(k != pos2A && k != pos3A && k != pos1B && k != pos2B && k != pos3B)
						   {
							   if(k % roll == 0 || k == (pos1A - roll))
							   {
								   	pos1A = k;
								   	break;
							   }
						   }
					   }
				   }
			   }
			   else if(pos2A < pos1A && pos2A < pos3A)
			   {
				   pos2A = pos2A + roll;
				   if(pos2A == pos1A || pos2A == pos3A || pos2A == pos1B || pos2A == pos2B || pos2A == pos3B || pos2A > 52)
				   {
					   pos2A = pos2A - roll;
				   }
				   else if(prime(pos2A))
				   {
					   boolean done = false;
					   for(int k=pos2A; k<=pos2A + 6; k++)
					   {
						   if(k > 51)
						   {
							   break;
						   }
						   if(k == pos1A || k == pos3A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos2A = k - 1;
							   break;
						   }
					   }
					   if(done == false)
						   pos2A = pos2A + 6;
				   }
				   else if(perfectSquare(pos2A))
				   {
					   boolean done = false;
					   for(int k=pos2A; k>=pos2A - 6; k--)
					   {
						   if(k == pos1A || k == pos3A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos2A = k + 1;
							   break;
						   }
					   }
					   if(done == false)
						   pos2A = pos2A - 6;
				   }
				   else if(specialRule(pos2A - roll, pos2A))
				   {
					   for(int k=pos2A; k>=(pos2A-roll); k--)
					   {
						   if(k != pos1A && k != pos3A && k != pos1B && k != pos2B && k != pos3B)
						   {
							   if(k % roll == 0 || k == (pos2A - roll))
							   {
								   	pos2A = k;
								   	break;
							   }
						   }
					   }
				   }
			   }
			   else if(pos3A < pos1A && pos3A < pos2A)
			   {
				   pos3A = pos3A + roll;
				   if(pos3A == pos1A || pos3A == pos2A || pos3A == pos1B || pos3A == pos2B || pos3A == pos3B || pos3A > 52)
				   {
					   pos3A = pos3A - roll;
				   }
				   else if(prime(pos3A))
				   {
					   boolean done = false;
					   for(int k=pos3A; k<=pos3A + 6; k++)
					   {
						   if(k > 51)
						   {
							   break;
						   }
						   if(k == pos1A || k == pos2A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos3A = k - 1;
							   break;
						   }
					   }
					   if(done == false)
						   pos3A = pos3A + 6;
				   }
				   else if(perfectSquare(pos3A))
				   {
					   boolean done = false;
					   for(int k=pos3A; k>=pos3A - 6; k--)
					   {
						   if(k == pos1A || k == pos2A || k == pos1B || k == pos2B || k == pos3B)
						   {
							   done = true;
							   pos3A = k + 1;
							   break;
						   }
					   }
					   if(done == false)
						   pos3A = pos3A - 6;
				   }
				   else if(specialRule(pos3A - roll, pos3A))
				   {
					   for(int k=pos3A; k>=(pos3A-roll); k--)
					   {
						   if(k != pos1A && k != pos2A && k != pos1B && k != pos2B && k != pos3B)
						   {
							   if(k % roll == 0 || k == (pos3A - roll))
							   {
								   	pos3A = k;
								   	break;
							   }
						   }
					   }
				   }
			   }
		   }
		   int [] arr = {pos1A, pos2A, pos3A};
		   Arrays.sort(arr);
		   for(int i=0; i<arr.length; i++)
		   {
			   if(arr[i] != 52)
			   {	
				   System.out.print(arr[i] + " ");
			   }
		   }
		   System.out.println();
		   
		   if(pos1A == 52 && pos2A == 52 && pos3A == 52)
			   System.out.println("GAME OVER");
	   }
   }
}