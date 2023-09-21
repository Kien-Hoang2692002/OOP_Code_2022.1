package java_37;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,01, 2000);
		Ngay ngay2 = new Ngay(19,7,2002);
		Ngay ngay3 = new Ngay(19,7,2002);

		Lop lop1 = new Lop("DH01", "CNTT");
		Lop lop2 = new Lop("DH02", "KHMT");
		Lop lop3 = new Lop("DH03", "KTMT");
		
		SinhVien sv1 = new SinhVien("1","A" , ngay1, 9, lop1);
		SinhVien sv2 = new SinhVien("2","B" , ngay2, 4, lop2);
		SinhVien sv3 = new SinhVien("3","C" , ngay3, 6, lop3);
		
		System.out.println("ten Khoa");
		System.out.println("SV1: " + sv1.layTenKhoa());
		System.out.println("SV2: " + sv2.layTenKhoa());
		System.out.println("SV3: " + sv3.layTenKhoa());
		
		System.out.println("Kiem tra thi dat:");
		System.out.println("SV1: " + sv1.kiemTraThiDat());
		System.out.println("SV2: " + sv2.kiemTraThiDat());
		System.out.println("SV3: " + sv3.kiemTraThiDat());
		
		System.out.println("Kiem tra ngay sinh");
		System.out.println("sv1 && sv2 " +  sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("sv1 && sv3 " +  sv1.kiemTraCungNgaySinh(sv3));
		System.out.println("sv3 && sv2 " +  sv2.kiemTraCungNgaySinh(sv3));
	}
}
