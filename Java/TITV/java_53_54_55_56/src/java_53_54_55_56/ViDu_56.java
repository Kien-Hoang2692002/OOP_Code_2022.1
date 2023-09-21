package java_53_54_55_56;

import java.util.Arrays;

public class ViDu_56 {
	public static void main(String[] args) {
		// hàm split là để cắt mảng
		String s = "Xin chào các bạn , tui là Kiên";
		
		String[] a = s.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		String[] b = s.split(",");
		
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chào, mình là Kiên.Mình là LTV";
		
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Hoàng Văn Kiên";
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Tên: " + d[d.length - 1]);
		
		
	}
}
