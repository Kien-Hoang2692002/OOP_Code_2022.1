package java_30_32_33;

public class Main {
	public static void main(String[] args) {
//     30
//		int d ;
//		MyDate md = new MyDate(25, 2, 2029);
//		md.printDate();
//		md.printMonth();
//		md.printYear();
//		md.printDate();
		
		//33
		MyDate md1 = new MyDate(15,5,2025);
		MyDate md2 = new MyDate(11,1,2021);
		MyDate md3 = new MyDate(15,5,2025);
		
		System.out.println(md1); //  15/5/2025
		System.out.println(md2); 
		System.out.println(md3);
		
		///34
		System.out.println("md1 so sanh md2:" + md1.equals(md2));
		System.out.println("md1 so sanh md3: " + md1.equals(md3));
		
		System.out.println("HashCode md1: " + md1.hashCode());
		System.out.println("HashCode md2: " + md2.hashCode());
		System.out.println("HashCode md3: " + md3.hashCode());
		
		
/*	32	
        MyDate md = new MyDate(31,1,2021);
		System.out.println("Day: " + md.getDay());
		
		md.setDay(30);
		System.out.println("Day: " + md.getDay());
		
		System.out.println("Month: " + md.getMonth());
		md.setMonth(13);
		System.out.println("Month: " + md.getMonth());
		md.setMonth(5);
		System.out.println("Month: " + md.getMonth());
		
		System.out.println("Month: " + md.getYear());

 */
}
}
