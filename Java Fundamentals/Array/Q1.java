import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {19, 14, 20, 18, 2};
		int sum = 0;
		
		System.out.println("Array: "+Arrays.toString(array)); 						//print Array
		
		for(int i = 0; i < array.length; i++) {										//sum
			sum = sum + array[i];
		}
		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/array.length);											//average
		System.out.println("The average of the array is: "+avg);	
	}

}