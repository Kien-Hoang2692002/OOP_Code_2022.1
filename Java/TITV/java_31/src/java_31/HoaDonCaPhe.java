package java_31;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten,double gia,double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;
	}
	
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong ;
	}
	
	public boolean kiemTraKhoiLuongLonHon(double kl) {
		return this.khoiLuong > kl;
	}
	
	public boolean kiemTraTongTien500k() {
		return this.tinhTongTien() > 500 ;
	}
	
	public double giamGia(double x) {
		if(this.kiemTraTongTien500k()) {
			return (this.tinhTongTien())*x/100.0;
		}
		else {
			return 0;
		}
	}
	
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
	
	
}
