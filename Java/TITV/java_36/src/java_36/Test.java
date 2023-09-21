package java_36;

public class Test {
	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(15,05,2022);
		NgayChieu ngay2 = new NgayChieu(31,01,2025);
		NgayChieu ngay3 = new NgayChieu(16,02,2030);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A","VN");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B","My");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C","Ba Lan");
		
		BoPhim boPhim1 = new BoPhim("A",2020, hangSanXuat1,65000, ngay1);
		BoPhim boPhim2 = new BoPhim("B",2021, hangSanXuat2,100000, ngay2);
		BoPhim boPhim3 = new BoPhim("C",2022, hangSanXuat3,115000, ngay3);

		System.out.println("So sanh gia 1 va 2: "+ boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("So sanh gia 3 va 2: "+ boPhim3.kiemTraGiaVeReHon(boPhim2));
	
		System.out.println("Ten hsx phim3 : "+ boPhim3.layTenHangSanXuatPhim());
	
		System.out.println("Phim1 giam 10% : " + boPhim1.giaSauKhuyenMai(10));
		System.out.println("Phim2 giam 20% : " + boPhim2.giaSauKhuyenMai(20));
	}
}
