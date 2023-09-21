//6.5 Write a Java program to sort a numeric array, 
//and calculate the sum and average value of array elements.
//Hoang Van Kien - 20205089
import java.util.Arrays;

public class Lab01_65 {
	public static void main(String[] args) {
		int[] a = new int[] {2,1,3,4,5};
		
		int sum = 0;
		double avg = 0  ;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			avg = (double) sum/a.length ;
		}
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}
}
