//static methods to work on an array of integers
public final class ArrayUtil 
{
	//return max value of array
	public static int findMax (int []arr)
	{
		int max = arr[0];
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	//return minimum value of array
	public static int findMin (int []arr)
	{
		int min = arr[0];
		for(int i=0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	//return the sum of the array
	public static int arrSum(int []arr)
	{
		int sum = 0;
		for(int i=0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	//return the average of the elements of the array
	public static double arrAverage(int[] arr)
	{
		double avg = 0.0;
		avg = (double) arrSum(arr)/arr.length;
		return avg;
	}
	
	//look for a specific value in an array. return true if the value exists in the array.
	public static boolean hasValue(int[]arr, int value)
	{
		boolean isInArray = false;
		for(int i=0; i < arr.length; i++)
		{
			if(value == arr[i])
				isInArray = true;
		}
		return isInArray;
	}
	
	//determines if duplicate values exist in the array
	public static boolean hasDuplicate(int[] arr)
	{
		boolean duplicateInArray = false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					duplicateInArray = true;
				}
			}
		}
		return duplicateInArray;
	}
	
	//return an array with reverse order 
	public static int[] reverse(int []arr)
	{
		int [] temp = new int[arr.length];
		for(int i=arr.length-1; i >= 0; i--)
		{
			temp[arr.length - i - 1] = arr[i]; 
		}
		return temp;
	}
	
	//return an array with elements shifted left or right for a certain number of spaces.
	//precondition: the number of spaces will be less
	//than or equal to the number of elements in the array.
	//direction = 'l' for left and 'r' for right
	public static int[] shift(int[]arr, char direction, int spaces)
	{
		int []temp = new int [arr.length];
		if(direction == 'l')
		{
			for(int i=0; i<arr.length-spaces; i++)
			{
				temp[i] = arr[i+spaces];
			}
			for(int i=arr.length-spaces; i<arr.length; i++)
			{
				temp[i] = 0;
			}
		}
		else if(direction == 'r')
		{
			for(int i=0; i<spaces; i++)
			{
				temp[i] = 0;
			}
			for(int i=spaces; i<arr.length; i++)
			{
				temp[i] = arr[i-spaces];
			}
		}
		return temp;
	}
	
	public static int[] circulate(int[]arr, char direction, int spaces)
	{
		int []temp = new int[arr.length];
		if(direction == 'l')
		{
			for(int i=0; i<arr.length-spaces; i++)
			{
				temp[i] = arr[i+spaces];
			}
			for(int i=arr.length-spaces; i<arr.length; i++)
			{
				temp[i] = arr[i-(arr.length-spaces)];
			}
		}
		else if(direction == 'r')
		{
			for(int i=0; i<spaces; i++)
			{
				temp[i] = arr[i+(arr.length-spaces)];
			}
			for(int i=spaces; i<arr.length; i++)
			{
				temp[i] = arr[i-spaces];
			}
		}
		return temp;
	}
}