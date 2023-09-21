package java_49;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi:");
		s = sc.nextLine();
		
		//Ham length()  ==> Lay do dai chuoi
		System.out.println(s.length());
		
		int doDai = s.length();
		
		// Hàm charAt(vị trí) ==> lấy ra 1 kí tự tại ví trí
		for( int i = 0 ; i < doDai ; i++) {
			System.out.println("Vị trí "+i+" là: "+s.charAt(i) );
		}
		
		// Hàm getChars(vị trí bắt đầu , vị trí kết thúc ,
		// mảng lưu dữ liệu , vị trí bắt đầu lưu của mảng)
		char[] arrayChar = new char[10];
		s.getChars(2, 4, arrayChar, 0);
		
		for( int i = 0 ; i<arrayChar.length ; i++) {
			System.out.println("Mảng giá trị "+i+" là:" + arrayChar[i]);
		}
		// Hàm getBytes ==> có 3 cách lấy ra giá trị của các kí tự trong mảng
		byte[] arrayByte = s.getBytes();
		for (byte b : arrayByte) {
			System.out.println(b);
			}
		System.out.println("BAI 50");
		// Bài 50
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		
		// Ham equals =>so sánh 2 chuỗi(phân biệt hoa thường)
		System.out.println("s1 equals s2:" + s1.equals(s2));
		System.out.println("s1 equals s2:" + s1.equals(s3));
		
		// Hàm equalsIgnoreCase => so sánh 2 chuỗi(ko phân biệt hoa thường)
		System.out.println("s1 equals s2:" + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equals s3:" + s1.equalsIgnoreCase(s3));
		
		// Hàm compareTo => so sanh > < = 
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv4));
		
		 // Hàm compareToIgnoreCase => ko phân biệt hoa thường
	
		// Hàm regionMatches => so sánh một đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		
		boolean check = r1.regionMatches(2,r2,0,4);
		System.out.println(check);
	
		// Hàm startWith => hàm kiểm tra chuỗi bắt đầu bằng...
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
		// Hàm endsWith => hàm kiểm tra chuoi kết thúc bằng ...
		String tenFile = "iloveyou.JPG";
		String tenFile2 = "hocJava.PDF";
		
		if( tenFile.endsWith(".JPG")) {
			System.out.println("File nay la hinh anh");
		}else if(tenFile.endsWith("PDF")) {
			System.out.println("File nay la PDF");
		}
		
		if( tenFile2.endsWith(".JPG")) {
			System.out.println("File nay la hinh anh");
		}else if(tenFile2.endsWith("PDF")) {
			System.out.println("File nay la PDF");
		}
		
		// Bài 51 : Các hàm tìm kiếm chuỗi
		String s_1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s_2 = "Xin chào";
		String s_3 ="Xin chào 123";
		char c1 = 'ô';
		
		// Hàm indexOf
		System.out.println(s_1.indexOf(s_2));
		System.out.println(s_1.indexOf(s_3));
	
		// Sử dụng vị trí bắt đầu 
		System.out.println(s_1.indexOf(s_2,2));
		System.out.println(s_1.indexOf(c1));
		// Hàm lastIndexOf => tìm kiếm từ phải sang trái
		System.out.println(s_1.lastIndexOf(s_2));
	
		// Bài 52
		String s_11 = "tItv";
		String s_22 = ".Vn";
		String s_33 = s_11 + s_22 ;
		// Hàm concat => nối chuỗi
		String s_44 = s_11.concat(s_22);
		System.out.println("s_33= " +s_33);
		System.out.println("s_44= " + s_44);
		
		// Hàm replace => thay thế
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "TITV");
		System.out.println(s5);
		System.out.println(s6);
		
		// toLowerCase : chuyển viết thường
		// toUpperCase : chuyển viết hoa
		System.out.println(s_11.toLowerCase());
		System.out.println(s_11.toUpperCase());
		
		// Hàm trim() => xóa khoảng trắng dư thừa ở đầu và cuối chuỗi
		String s9 = "    Xin   chào     ";
		System.out.println(s9.trim());
		
		//substring => cắt chuỗi con
		String s10 = "Xin chào các bạn, mình là";
		String s11 = s10.substring(10);
		String s12 = s10.substring(2,5);
		System.out.println(s11);
		System.out.println(s12);
		
		
		

		
	
	}
}
