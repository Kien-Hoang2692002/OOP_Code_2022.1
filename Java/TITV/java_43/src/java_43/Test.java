package java_43;

public class Test {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println("Min" + mm.timMin(5,5));
		System.out.println("Min " + mm.timMin(5.5,5));
		
		System.out.println("Tong : " + mm.tinhTong(5, 6));
		double arr[] = new double[] {1,2,3,4,5};
		
		System.out.println("Tong : " + mm.tinhTong(arr));
		
	}
}
