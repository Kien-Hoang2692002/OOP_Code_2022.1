
// Hoàng Văn Kiên - 20205089
package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	
	private int numOfCurrentDVD = 0 ;
	// Thuộc tính chứa số DVD có sẵn trong cửa hàng
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>(); 

	// Phương thức thêm DVD vào cửa hàng	
	public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc... dvds) {
		itemsInStore.add(dvd1);
		numOfCurrentDVD++;
		System.out.println("The disc has been added");
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.add(disc);
			numOfCurrentDVD++;
			System.out.println("The disc has been added");
		}
	}
	
	public void addDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.add(dvd);
			numOfCurrentDVD++;
			System.out.println("The disc has been added");
		}
	}
	
	// Phương thức xóa DVD khỏi cửa hàng
	public void removeDVD(DigitalVideoDisc dvd, DigitalVideoDisc... dvds) {
		itemsInStore.remove(dvd);
		numOfCurrentDVD--;
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.remove(disc);
			numOfCurrentDVD--;
		}
		System.out.println("The disc has been removed");
	}
	
	public void removeDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.remove(dvd);
			numOfCurrentDVD--;
		}
		System.out.println("The disc has been removed");
	}
}
