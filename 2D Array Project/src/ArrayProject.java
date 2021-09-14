public class ArrayProject
{
	public static boolean isItMagic(int[][] arr)
	{
		int rows = arr.length;
		int columns = arr[0].length;
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[0][i];
		}
		for(int i=1; i<arr.length; i++)
		{
			int sumOfRow = 0;
			for(int j = 0; j<arr[0].length; j++)
			{
				sumOfRow = sumOfRow + arr[i][j];
			}
			if(sumOfRow != sum)
			{
				return false;
			} 
		}
		for(int i=0; i<arr[0].length; i++)
		{
			int sumOfColumn = 0;
			for(int j=0; j<arr.length; j++)
			{
				sumOfColumn = sumOfColumn + arr[i][j];
			}
			if(sumOfColumn != sum)
			{
				return false;
			}
		}
		int sumOfMajorDiagonal = 0, sumOfMinorDiagonal = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j)
				{
					sumOfMajorDiagonal = sumOfMajorDiagonal + arr[i][j];
				}
				if((i+j) == (arr.length-1))
				{
					sumOfMinorDiagonal = sumOfMinorDiagonal + arr[i][j];
				}
			}
		}
		if(sumOfMajorDiagonal != sumOfMinorDiagonal)
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int[][] sq = {{1,2,3}, {4,5,6}, {7,9,8}};
		if(isItMagic(sq))
		{
			System.out.println("This is a magic square!");
		}
		else
		{
			System.out.println("This is not a magic square.");
		}
	}
}
