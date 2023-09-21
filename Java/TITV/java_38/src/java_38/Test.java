package java_38;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 8, 2025);
		Ngay ngay2 = new Ngay(5, 3, 2025);
		Ngay ngay3 = new Ngay(6, 9, 2025);
		
		QuocGia qg1 = new QuocGia("VN", "Việt Nam");
		QuocGia qg2 = new QuocGia("USA", "My");
		
		HangSanXuat hsx1 = new HangSanXuat("Macbook", qg2);
		HangSanXuat hsx2 = new HangSanXuat("IP", qg1);
		
		MayTinh mt1 = new MayTinh(hsx2, ngay1, 2500, 12);
		MayTinh mt2 = new MayTinh(hsx1, ngay1, 2000, 1.5);
		
		System.out.println("So sanh gia");
		System.out.println("m1 va m2 " + mt1.kiemTraGiaThapHon(mt2));

		System.out.println("Ten quoc gia");
		System.out.println("MT1 :" + mt1.layTenQuocGia());
		System.out.println("MT2 :" + mt2.layTenQuocGia());
	}
}
