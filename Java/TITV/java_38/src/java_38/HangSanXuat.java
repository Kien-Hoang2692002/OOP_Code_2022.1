package java_38;

public class HangSanXuat {
	private String tenHangSanXuat;
	private QuocGia quocgia;
	public HangSanXuat(String tenHangSanXuat, QuocGia quocgia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocgia = quocgia;
	}
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public QuocGia getQuocgia() {
		return quocgia;
	}
	public void setQuocgia(QuocGia quocgia) {
		this.quocgia = quocgia;
	}
	public String layTenQuocGia() {
		return this.quocgia.getTenQuocGia();
	}
	
	
}
