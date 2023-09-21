package java_45;

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu ;

	public MayBay( HangSanXuat hangSanXuat, HangSanXuat tenQuocGia, String loaiNhienLieu) {
		super("May bay", hangSanXuat, tenQuocGia);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 500;
	}
	
	public void catCanh() {
		
	}
	
	public void haCanh() {
		
	}
	
	
	
}
