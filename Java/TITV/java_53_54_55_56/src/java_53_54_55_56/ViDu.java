package java_53_54_55_56;

import java.util.Arrays;

public class ViDu {
	
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0 ;
		for( int i = x.length-1 ; i>=0 ;i-- ) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		/*
		// Bài 53
		// Kiểu nguyên thủy
		
		int[] mang1 = {1,2,3};
		// copy mảng toán tử gán =
		
		int[] mang1_a = mang1 ;
		mang1_a[0] = 100 ;
		
		System.out.println("Mảng 1: " + Arrays.toString(mang1));
		System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));
	
		// Dùng hàm clone()
		
		int[] mang1_b = mang1.clone() ;
		mang1_b[0] = 50 ;
		
		System.out.println("Mảng 1: " + Arrays.toString(mang1));
		System.out.println("Mảng 1_a: " + Arrays.toString(mang1_b));
		
		// Dùng hàm System.arraycopy
		
		int[] mang1_c = new int[mang1.length] ;
		System.arraycopy(mang1 , 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 90;
		System.out.println("Mảng 1_a: " + Arrays.toString(mang1_c));
		
		String[] mang_doi_tuong = {"TITV" , ".vn"};
		
		*/
		
		int[] a = new int[] {1,8,2,2,6,4,3,-1,9,-2};
		int[] b = new int[15] ;
		
		// Hàm sắp xếp
		System.out.println("a ban đầu " + Arrays.toString(a));
		Arrays.sort(a); //sắp xếp từ nhỏ đến lớn 
		System.out.println("a sắp xếp tăng "+ Arrays.toString(a));
		a = ViDu.reverse(a);
		
		// Hàm tìm kiếm 
		// binarySearch chỉ làm được khi đã sắp xếp tăng
		
		System.out.println(Arrays.binarySearch(a,4));
		System.out.println(Arrays.binarySearch(a,5));
		
		// Hàm điền giá trị 
		Arrays.fill(b,5);
		System.out.println("b: " + Arrays.toString(b));
			
		

		
		
		
	
		
		
		
		
	}
}
