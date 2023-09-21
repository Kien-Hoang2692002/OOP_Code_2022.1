package hust.soict.dsai.lab01;

// 2.2.6 - Hoang Van Kien - 20205089
import java.util.Scanner;
public class GiaiHePhuongTrinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a1,a2,b1,b2,c1,c2;
		// Nhập phương trình 
	    System.out.println("Nhap he so a1x + b1y = c1, a2x + b2y =c2") ;
	    System.out.println("Nhap a1 = "); 
	    a1 = sc.nextDouble();
	    System.out.print("Nhap b1 = "); 
	    b1 = sc.nextDouble();
	    System.out.print("Nhap c1 = "); 
	    c1=sc.nextDouble();
	    System.out.print("Nhap a2 = "); 
	    a2=sc.nextDouble();
	    System.out.print("Nhap b2 = "); 
	    b2=sc.nextDouble();
	    System.out.print("Nhap c2 = "); 
	    c2=sc.nextDouble();    
	    //Giải hệ phương trình bằng định thức
	    double D = a1*b2-a2*b1;
        double Dx = c1*b2-c2*b1;
        double Dy = a1*c2-a2*c1;
        if(D==0 && Dx == 0 && Dy == 0) 
        	System.out.println("He phuong trinh co vo so nghiem\n");
        else if((D==0 && Dx!= 0) || (D==0 && Dy!= 0)) 
        	System.out.println("He phuong trinh vo nghiem");
        else System.out.println("x: " + Math.ceil((Dx/D) * 1000)/1000 + " y: " 
        	+ Math.ceil((Dy/D) * 1000)/1000 + "\n");
	    
	}
	
}
