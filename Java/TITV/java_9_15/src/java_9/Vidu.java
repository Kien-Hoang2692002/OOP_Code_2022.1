package java_9;

import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		 
		
		System.out.println("Nhap ten: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhap ma sinh vien: ");
		long maSinhVien = sc.nextLong();
		
		System.out.println("Nhap diem thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("=========");
		System.out.println("Ho va ten: " + hoVaTen);
		System.out.println("Ma sinh vien: " + maSinhVien);
		System.out.println("Diem thi: " + diemThi);
		
		// EP KIEU
		int a = 100;
		int b = 2 ;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		float c = a; // Ep kieu ngam dinh
		float d = (float)b; // Ep kieu tuong minh
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//Ep kieu doi tuong
		int x = new Integer(32);
		System.out.println("x=" + x);
		*/
		
		// Khai bao bien
		int a , b ;
		// Nhap du lieu
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = " );
		a = sc.nextInt();
		System.out.println("Nhap b = " );
		b = sc.nextInt();
		System.out.println("====");
		
		int tong = a + b ;
		System.out.println("a + b = " + tong);
		float thuong = (float)a/b ;
		System.out.println("a/b = " + thuong);
		
		System.out.println(a + "==" + b + ":" + (a==b));
		System.out.println(a + "!=" + b + ":" + (a!=b));
		System.out.println(a + "<" + b + ":" + (a<b));
		System.out.println(a + ">=" + b + ":" + (a>=b));
		System.out.println(a + "<" + b + ":" + (a<b));
		System.out.println(a + "<=" + b + ":" + (a<=b));
		System.out.println("==========");
		System.out.println("Ca hai la so chan:" + (a%2 == 0 && b%2==0));
		System.out.println("Co it nhat mot so chan:" + (a%2 == 0 || b%2==0));	
	// Toan tu dieu kien java_15
		System.out.println("==========");
		
		String ketQua = (a%2 == 0)?"chan":"le";
		System.out.println("a la so " + ketQua);
	
	}
}














