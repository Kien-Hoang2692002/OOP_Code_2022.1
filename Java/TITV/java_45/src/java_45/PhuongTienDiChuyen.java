package java_45;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat;
	protected HangSanXuat tenQuocGia;
	
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat, HangSanXuat tenQuocGia) {
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
		this.tenQuocGia = tenQuocGia;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public HangSanXuat getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(HangSanXuat tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	public String layTenQuocGia() {
		return this.hangSanXuat.getTenQuocGia();
	}
	
	public void batDau() {
		System.out.println("Bat dau....");
	}
	
	public void tangToc() {
		System.out.println("Tang toc....");
	}
	
	public void dungLai() {
		System.out.println("Dung lai");
	}
	
	public abstract double layVanToc();
	
}
