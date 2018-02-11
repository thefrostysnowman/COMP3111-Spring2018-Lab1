package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void main(String[] args) {
		//Array to sum
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		//Iterate through the array to calculate the summation
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		//Print out the formatted result
		System.out.println(String.format("Sum of numbers is %d", sum));
	}

}
