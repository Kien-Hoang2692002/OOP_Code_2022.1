package java_16;

import java.util.Scanner;

public class Vidu {
	public static void main(String[] args) {
		double a , b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a : ");
		a = sc.nextDouble();
		System.out.println("Nhap b : ");
		b = sc.nextDouble();
		
		// Ham tri tuyet doi 
		System.out.println("|a| = " + Math.abs(a));
		//Ham tim min
		System.out.println("min(a,b)" + Math.min(a, b));
		// Ham tim ceil
		System.out.println("ceil(a) = " + Math.ceil(a));
		// Ham floor 
		System.out.println("floor(a) = " + Math.floor(a));
		// Ham sqrt
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		// Ham pow
		System.out.println("a^b = " + Math.pow(a,b));
		
		// Tinh dien tich va chu vi hinh tron
		double r;
		System.out.println("Nhap ban kinh r : ");
		r = sc.nextDouble();
		System.out.println("Dien tich = " + (2*Math.PI*r));
		System.out.println("Dien tich = " + (Math.PI*r*r));	
		
		//Giai pt bac nhat cx + d = 0
		System.out.println("Nhap c = ");
		double c = sc.nextDouble();
		System.out.println("Nhap d = ");
		double d = sc.nextDouble();
		
		if( c == 0 ) {
			if( d == 0 ) {
				System.out.println("Pt vo so nghiem");
			}else {
				System.out.println("Pt vo nghiem");
			}
		}else {
			System.out.println("x = " + (-d/c)) ;
		}
		
		//Kiem tra thu trong tuan
		System.out.println("Nhap n = ");
		int n =sc.nextInt();
		
		switch (n) {
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
		default:
			System.out.println("Nhap du lieu sai");
		}
		// Bai Tap tim so ngay trong thang
		System.out.println("Nhap vao thang: ");
		int thang =sc.nextInt();
		
		System.out.println("Nhap vao nam: ");
		int nam =sc.nextInt();
		
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println(thang + " : 31 days");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println(thang + " :30 days");
			break;
		}
		case 2:
			if( (nam%4 == 0 && nam%100 != 0) || (nam%400 == 0))
					{
				System.out.println(thang + " :29 days");
					}
			else {
				System.out.println(thang + " :28 days");
			}
			break;

		default:
			System.out.println("Nhap sai");
		}
	}
}













