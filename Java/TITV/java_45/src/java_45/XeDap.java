package java_45;

public class XeDap extends PhuongTienDiChuyen{

	public XeDap( HangSanXuat hangSanXuat, HangSanXuat tenQuocGia) {
		super("Xe dap", hangSanXuat, tenQuocGia);
	}

	@Override
	public double layVanToc() {
		return 20;
	}
	
	
		
}
