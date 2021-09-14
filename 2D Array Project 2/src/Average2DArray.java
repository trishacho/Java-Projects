public class Average2DArray 
{
	public static void Average(int [][] arr)
	{
		int row = arr.length;
		int column = arr[0].length;
		System.out.println("Old Array:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				int total = 0;
				int counter = 0;
				int avg = 0;
				total = total + arr[i][j];
				counter++;
				if(i!=0)
				{
					total = total + arr[i-1][j];
					counter++;
				}
				if(i!=row-1)
				{
					total = total + arr[i+1][j];
					counter++;
				}
				if(j!=0)
				{
					total = total + arr[i][j-1];
					counter++;
				}
				if(j!=column-1)
				{
					total = total + arr[i][j+1];
					counter++;
				}
				avg = (int) total/counter;
				arr[i][j] = avg;
			}
		}
		
		System.out.println("New Array:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		int [][] avg = {{7,8,10,-3}, {5,12,8,9}, {6,2,-5,4}};
		Average(avg);
	}
}
