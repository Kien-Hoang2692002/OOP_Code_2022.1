import java.util.Scanner;

// 6.6 Write a Java program to add two matrices of the same size.
// HoangVanKien-20205089
public class Lab01_66 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m ; // Khai báo hàng
		int n ; // Khai báo cột
		
		// Nhập số hàng , số cột
		System.out.println("Nhập hàng:");
		m = sc.nextInt();
		System.out.println("Nhập cột:");
		n = sc.nextInt();
		
		// Khai báo hai ma trận cùng kích thước
		int array1[][] = new int[m][n];
		int array2[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		// Nhập giá trị cho 2 ma trận
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		
		// In ma trận 
		System.out.println("Array1: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array1[i][j]+"\t");
			}
			System.out.println();
		}
		 
		System.out.println("Array2: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
		
		// Tinh tong 2 ma tran
		for ( int i = 0 ; i < m ; i++ ) {
			for ( int j = 0 ; j < n ; j++ )
	             sum[i][j] = array1[i][j] + array2[i][j]; 
		}
	         
	      System.out.println("Sum:");
	 
	      for ( int i = 0 ; i < m ; i++ )
	      {
	         for ( int j = 0 ; j < n ; j++ )
	            System.out.print(sum[i][j]+"\t");
	 
	         System.out.println();
	      }
		
	}
}
