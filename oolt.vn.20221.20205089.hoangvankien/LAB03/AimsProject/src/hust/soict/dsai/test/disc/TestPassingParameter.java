package hust.soict.dsai.test.disc;
// Hoàng VĂn Kiên - 20205089

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		// Call method swap
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Call method changeTitle
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
	}
	
	public static void swap(Object o1 , Object o2) {
		Object tmp = o1;
		o1 = o2 ;
		o2 = tmp;
	}
	
	public static void swap1(DigitalVideoDisc dvd1 , DigitalVideoDisc dvd2) {
		
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
