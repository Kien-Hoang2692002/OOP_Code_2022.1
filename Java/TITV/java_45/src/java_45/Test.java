package java_45;

public class Test {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Hang 1", "Viet Nam");
		HangSanXuat hsx2 = new HangSanXuat("Hang 2", "USA");
		HangSanXuat hsx3 = new HangSanXuat("Hang 3", "Nhat Ban");
		
		MayBay p1 = new MayBay(hsx2, hsx3, "Xang");
		PhuongTienDiChuyen p2 = new XeOto(hsx2, hsx3, "Dau");
		PhuongTienDiChuyen p3 = new XeDap(hsx2, hsx3);
		
		System.out.println(p1.layTenHangSanXuat());
		System.out.println(p1.layTenQuocGia());
		
		p2.batDau();
		p3.dungLai();
		
		System.out.println("Lay van toc:");
		System.out.println(p1.layVanToc());
		System.out.println(p2.layVanToc());
		System.out.println(p3.layVanToc());
		
		p1.catCanh();
	
	}
}
