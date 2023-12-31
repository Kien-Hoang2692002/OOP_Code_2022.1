package java_35;

public class Sach {
	private String tenSach;
	private double giaBan;
	private int namXuatban;
	private TacGia tacGia;
	
	public Sach(String tenSach, double giaBan, int namXuatban, TacGia tacGia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatban = namXuatban;
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getNamXuatban() {
		return namXuatban;
	}

	public void setNamXuatban(int namXuatban) {
		this.namXuatban = namXuatban;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	
	public void inTenSach() {
		System.out.println(this.tenSach);
	}
	
	public boolean kiemTraCungNamXuatBan(Sach sachKhac) {
		return this.namXuatban == sachKhac.namXuatban ;
	}
	
	public double giaSauKhiGiam(double x) { 
		return this.giaBan*(1-x/100.0);
	}
	
}











