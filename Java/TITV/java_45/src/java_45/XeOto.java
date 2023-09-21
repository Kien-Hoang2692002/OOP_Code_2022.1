package java_45;

public class XeOto extends PhuongTienDiChuyen{
	
	private String loaiNhienLieu ;
	
	public XeOto(HangSanXuat hangSanXuat, HangSanXuat tenQuocGia, String loaiNhienLieu) {
		super("Xe Oto", hangSanXuat, tenQuocGia);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 60;
	}

	
	
	
}
