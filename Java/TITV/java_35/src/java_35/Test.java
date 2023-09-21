package java_35;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,5,2021);
		Ngay ngay2 = new Ngay(15,9,2025);
		Ngay ngay3 = new Ngay(15,9,2025);
		
		TacGia tacGia1 = new TacGia("K", ngay1);
		TacGia tacGia2 = new TacGia("N", ngay2);
		TacGia tacGia3 = new TacGia("M", ngay3);
		
		Sach sach1 = new Sach("C",500,2020, tacGia1);
		Sach sach2 = new Sach("Java",100,2025, tacGia2);
		Sach sach3 = new Sach("Python",900,2025, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("So NXB s1 va s3: " + sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("So NXB s2 va s3: " + sach2.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("S1 giam 10%: "+sach1.giaSauKhiGiam(10));
	
	}
}
