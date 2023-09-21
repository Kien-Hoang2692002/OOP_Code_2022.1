package java_21;

import java.util.Iterator;
import java.util.Scanner;

public class java_21 {
	public static void main(String[] args) {
		// for
		for ( int i = 2 ; i <= 9 ; i++)
		{	
			System.out.println("Bang nhan " + i);
			for( int j = 1 ; j <= 10 ; j++) 
			{
				System.out.println(i +" x " + j + " = " + (i*j));
			}
			System.out.println("======");
		}
		//while 
		int x = 1 ;
		Scanner sc = new Scanner(System.in);
		while( x!= 0) {
			System.out.println("Nhap 0 de thoat");
			x = sc.nextInt();
		}
		
		int i = 0;
		while( true ) {
			System.out.println(i);
			i++;
			if(i == 3) break ;
		}
		
		// Chuyen thap phan sang nhi phan
		System.out.println("Nhap so nguyen n");
		int n = sc.nextInt();
		
		String nhiPhan = "";
		while(n > 0) {
			nhiPhan = (n%2) + nhiPhan;
			n /= 2 ;
		}
		System.out.println("So he nhi phan la " + nhiPhan);
		
		// do ... while
		int m ;
		do {
			System.out.println("Nhap vao m > 0");
			m = sc.nextInt();
		} while (m <= 0);
		// break // continue //return 
		
		// try ... catch .. finally : xu li ngoai le
		int k = 0;
		try {
			System.out.println("Nhap so nguyen k: ");
			k = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		}finally {
			System.out.println("Finally!!");
		}
		System.out.println("Gia tri nhap :" + k);
		System.out.println("Ket thuc!");
		
		// Mảng trong java
		double[] mang1; //Khai báo mảng 
		double mang2[];
		double sum = 0;
		
		mang1 = new double[10];
		mang2 = new double[]{ 1,2,3,4,5};
		
		for( int j = 0 ; j < mang1.length ;j++) {
			System.out.println("Nhap phan tu thu "+j+":");
			mang1[j] = sc.nextDouble();
		}
		for (int j = 0; j < mang1.length; j++) {
			sum += mang1[j];
		}
		System.out.println("Sum = " + sum);
		
	}
}









