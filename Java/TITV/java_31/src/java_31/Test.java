package java_31;

public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("7 Up", 100, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Up", 100, 6);
		System.out.println("Tong tien: " +hd.tinhTongTien());
		
		System.out.println("Kiem tra khoi luong lon hon > 2kg: " + hd.kiemTraKhoiLuongLonHon(2));
	
		System.out.println("Kiem tra tong tien > 500 :" + hd.kiemTraTongTien500k());
	
		System.out.println("Giam gia: " + hd.giamGia(10));
		System.out.println("Giam gia: " + hd2.giamGia(10));
	
		System.out.println("Sau giam gia: " + hd.giaSauKhiGiam(10));
		System.out.println("Sau giam gia: " + hd2.giaSauKhiGiam(10));
	}
}
