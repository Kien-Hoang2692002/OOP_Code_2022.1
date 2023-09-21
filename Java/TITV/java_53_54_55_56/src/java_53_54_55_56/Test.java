package java_53_54_55_56;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150,"Tran Van Thanh","Lop 1", 9);
		SinhVien sv2 = new SinhVien(100,"Nguyen Thi Thanh Hoa","Lop 2", 8);
		SinhVien sv3 = new SinhVien(190,"Nguyen Van A","Lop 2", 8);
		SinhVien sv4 = new SinhVien(180,"Nguyen Van Binh","Lop 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv2));
		
		System.out.println(sv1.compareTo1(sv2));
		System.out.println(sv3.compareTo1(sv2));
		
		System.out.println("=====55====");
		
		SinhVien[] a_sv = new SinhVien[]{sv1,sv2,sv3};
		
		System.out.println("Ban đầu: "+ Arrays.toString(a_sv));
		
		//Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau sắp xếp: "+ Arrays.toString(a_sv));
		
		// Hàm tìm kiếm 
		System.out.println("Tìm An:"+ Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm Binh:"+ Arrays.binarySearch(a_sv, sv4));
		
		
		
		
	}
}
