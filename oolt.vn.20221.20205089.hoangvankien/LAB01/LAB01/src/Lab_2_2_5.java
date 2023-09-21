//Write a program to calculate sum, difference, product, 
//and quotient of 2 double numbers which are entered by users.
// Hoang Van Kien - 20205089

import java.util.Scanner;
public class Lab_2_2_5 {
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input 1st integer: ");
	        int firstInt = in.nextInt();
	        System.out.print("Input 2nd integer: ");
	        int secondInt = in.nextInt();

	        System.out.println("Sum " + (firstInt + secondInt) );
	        System.out.println("Difference " + (firstInt - secondInt) );
	        System.out.println("Product " + (firstInt * secondInt) );
	        System.out.println("Quotient " + ((double)firstInt/secondInt) );
	        
	    }
}
