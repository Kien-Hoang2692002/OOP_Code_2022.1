package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

// Hoàng Văn Kiên - 20205089

public class TestPassingParameter {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		// Gọi hàm swap
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		
		// Gọi hàm swap1
		swap1(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Gọi hàm swap2
		swap2(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
//		 Gọi hàm changTitle
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + cinderellaDVD.getTitle());
	}
	
	// Hàm đổi tiêu đề 2 bộ phim
	public static void swap(Object o1 , Object o2) {
		Object tmp = o1;
		o1 = o2 ;
		o2 = tmp;
	}
	// Hàm đổi tiêu đề 2 bộ phim
	public static void swap1(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tmp);
	}
	
	public static void swap2(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2) {
		DigitalVideoDisc tmp = dvd1;
		dvd1 = dvd2;
		dvd2 = tmp;
	}
	// Hàm đổi tiêu đề 2 bộ phim
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
