//6.3 Write a program to display a triangle with a height of n stars (*),
//n is entered by users.
// Hoang Van Kien - 20205089
import java.util.Scanner;
public class Lab01_6 {
	 public static void printTriangle(int n)
	    {
	      // Vong lap in 
	        for (int i=0; i<n; i++)
	        {       
	            for (int j=n-i; j>1; j--)
	            {
	               // In khoang trang
	                System.out.print(" ");
	            }
	            for (int j=0; j<=i; j++ )
	            {
	                // In dau *
	                System.out.print("* ");
	            }
	  
	            System.out.println();
	        }
	    }
	     
	    public static void main(String args[])
	    {	
	    	Scanner sc = new Scanner(System.in);
	        int n ;
	        System.out.println("Nhap n: ");
	        n = sc.nextInt();
	        printTriangle(n);
	    }
}

