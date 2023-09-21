package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	
	private int numOfCurrentDVD = 0 ;
	// Thuoc tinh mang chua tat ca cac gia tri trong mang
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>(); 

	// Phuong thuc them dia vao cua hang
	public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc... dvds) {
		itemsInStore.add(dvd1);
		numOfCurrentDVD++;
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.add(disc);
			numOfCurrentDVD++;
		}
	}
	
	public void addDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.add(dvd);
			numOfCurrentDVD++;
		}
	}
	
	// Phuong thuc xoa ca dia khoi cua hang
	public void removeDVD(DigitalVideoDisc dvd, DigitalVideoDisc... dvds) {
		itemsInStore.remove(dvd);
		numOfCurrentDVD--;
		for(DigitalVideoDisc disc: dvds) {
			itemsInStore.remove(disc);
			numOfCurrentDVD--;
		}
	}
	
	public void removeDVD(DigitalVideoDisc[] dvds) {
		for(DigitalVideoDisc dvd : dvds) {
			itemsInStore.remove(dvd);
			numOfCurrentDVD--;
		}
	}
}
