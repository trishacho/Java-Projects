import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Veitch 
{
	int [][] arr = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
	public void booleanConvert(String separatedStr)
	{
		int [][] tempArr = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		int counter = 0;
		String temp;
		int combinations = 0;
		while(counter < separatedStr.length())
		{
			if(separatedStr.charAt(counter) == '~')
			{
				temp = separatedStr.substring(counter, counter+2);
				combinations++;
				if(temp.equals("~A"))
				{
					for(int i=0; i<4; i++)
					{
						for(int j=2; j<4; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("~B"))
				{
					for(int i=2; i<4; i++)
					{
						for(int j=0; j<4; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("~C"))
				{
					for(int i=0; i<4; i++)
					{
						for(int j=0; j<4; j++)
						{
							if(j==0 || j==3)
								tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("~D"))
				{
					for(int i=0; i<4; i++)
					{
						for(int j=0; j<4; j++)
						{
							if(i==0 || i==3)
								tempArr[i][j]++;
						}
					}
				}
				counter = counter + 2;
			}
			else
			{
				temp = separatedStr.substring(counter, counter+1);
				combinations++;
				if(temp.equals("A"))
				{
					for(int i=0; i<4; i++)
					{
						for(int j=0; j<2; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("B"))
				{
					for(int i=0; i<2; i++)
					{
						for(int j=0; j<4; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("C"))
				{
					for(int i=0; i<4; i++)
					{
						for(int j=1; j<3; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				if(temp.equals("D"))
				{
					for(int i=1; i<3; i++)
					{
						for(int j=0; j<4; j++)
						{
							tempArr[i][j]++;
						}
					}
				}
				counter++;
			}
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				if(tempArr[i][j] == combinations)
				{
					arr[i][j] = 1;
				}
			}
		}
	}
	
	public void printArr()
	{
		int sumRow1 = 0;
		int sumRow2 = 0;
		int sumRow3 = 0;
		int sumRow4 = 0;
		sumRow1 = (arr[0][0]*8) + (arr[0][1]*4) + (arr[0][2]*2) + arr[0][3];
		sumRow2 = (arr[1][0]*8) + (arr[1][1]*4) + (arr[1][2]*2) + arr[1][3];
		sumRow3 = (arr[2][0]*8) + (arr[2][1]*4) + (arr[2][2]*2) + arr[2][3];
		sumRow4 = (arr[3][0]*8) + (arr[3][1]*4) + (arr[3][2]*2) + arr[3][3];
		String row1 = Integer.toHexString(sumRow1).toUpperCase();
		String row2 = Integer.toHexString(sumRow2).toUpperCase();
		String row3 = Integer.toHexString(sumRow3).toUpperCase();
		String row4 = Integer.toHexString(sumRow4).toUpperCase();
		System.out.println(row1 + row2 + row3 + row4);
	}
	
	public static void main(String args[]) throws Exception
	{
		File file = new File("D:\\test.txt"); 
	    Scanner sc = new Scanner(file);
		for(int i=0; i<5; i++)
		{
			String input;
			input = sc.nextLine();
			StringTokenizer splitString = new StringTokenizer(input, "+");
			ArrayList <String> separateStrings = new ArrayList<String>();
			Veitch v = new Veitch();
			while(splitString.hasMoreTokens())
			{
				separateStrings.add(splitString.nextToken());
			}
			for(int k=0; k<separateStrings.size(); k++)
			{
				v.booleanConvert(separateStrings.get(k));
			}
			v.printArr();
		}
	}
}