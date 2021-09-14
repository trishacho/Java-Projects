public class ArrayRunner {

	public static void main(String[] args) {
		//fill an array with random integers from 1 through 100
		int x = 20;
		int[] arr = new int[x];
		
		//use a regular for-loop to alter/fill 
		//the array
		for (int i = 0; i<x; i++){
			int random = (int)(Math.random()*100+1);
			arr[i]= random;
		} 
		
		//call a static method to find the max
		//value of the array and print it out
		//call all other methods.
		System.out.println("The max is: " + ArrayUtil.findMax(arr));
		System.out.println("The min is: " + ArrayUtil.findMin(arr));
		System.out.println("The sum is: " + ArrayUtil.arrSum(arr));
		System.out.println("The average is: " + ArrayUtil.arrAverage(arr));
		System.out.println("find duplicate: "+ ArrayUtil.hasDuplicate(arr));
		System.out.println("find a value 5: "+ ArrayUtil.hasValue(arr, 5));
		
		//use a for-each loop to access and print the array
		//you may NOT use a for-each loop to alter the array
		System.out.println("\n **contents of the array**");
		for(int value:arr)
			System.out.print(value + " ");
		
		
		int []rev = ArrayUtil.reverse(arr);
		System.out.println("\n\n **contents of the reverse array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		rev = ArrayUtil.shift(arr, 'l', 3);
		System.out.println("\n\n **contents of the shift left 3 array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		
		rev = ArrayUtil.shift(arr, 'r', 5);
		System.out.println("\n\n **contents of the shift right 5 array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		rev = ArrayUtil.circulate(arr, 'l', 4);
		System.out.println("\n\n **contents of the circulate left 4 array**");
		for(int value:rev)
			System.out.print(value+ " ");
		
		rev = ArrayUtil.circulate(arr, 'r', 4);
		System.out.println("\n\n **contents of the circulate right 4 array**");
		for(int value:rev)
			System.out.print(value+ " ");
	}

}