package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void main(String[] args) {
		//Array to sum
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//Result Storage
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		//Iterate through the array to calculate results
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];						// Increment sum by current value
			if (arr[i] < min) { min = arr[i]; }	// Update min if current value is smaller than stored min
			if (arr[i] > max) { max = arr[i]; }	// Update max if current value is smaller than stored max
		}
		
		//Print out the formatted result
		System.out.println(String.format("Sum of numbers is %d", sum));
		System.out.println(String.format("Min = %d; Max = %d", min, max));
	}

}
