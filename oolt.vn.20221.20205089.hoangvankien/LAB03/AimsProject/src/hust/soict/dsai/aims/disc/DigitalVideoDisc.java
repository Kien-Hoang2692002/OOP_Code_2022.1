package hust.soict.dsai.aims.disc;
// HoÃ ng VÄƒn KiÃªn - 20205089

public class DigitalVideoDisc {
	private String title ; // Thuá»™c tÃ­nh tiÃªu Ä‘á»?
	private String category; // Thuá»™c tÃ­nh thá»ƒ loáº¡i
	private String director ; // Thuá»™c tÃ­nh Ä‘áº¡o diá»…n
	private int length ; // Thuá»™c tÃ­nh Ä‘á»™ dÃ i DVD
	private float cost ; // Thuá»™c tÃ­nh giÃ¡ tiá»?n DVD
	
	private static int nbDigitalVideoDiscs = 0; // Class attribute biến static
	int id = 0 ; // Instance attribute
	
	// Phương thức khởi tạo theo id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	// Contructor theo title
	public DigitalVideoDisc(String title) {
		this.title = title;
		// Mỗi lần gọi hàm contructor thì biến nbDigitalVideoDisc tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}
	
	// Contructor theo category, title and cost
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		// Mỗi lần gọi hàm contructor thì biến nbDigitalVideoDisc tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}
	
	// Contructo theo director, category, title and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		// Mỗi lần gọi hàm contructor thì biến nbDigitalVideoDisc tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}
	
	// Contructor theo all attributes: title, category, director, length and cost
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		// Mỗi lần gọi hàm contructor thì biến nbDigitalVideoDisc tăng lên 1;
		id = nbDigitalVideoDiscs++;
	}
	
	// PhÆ°Æ¡ng thá»©c gettter vÃ  setter cá»§a title 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	// PhÆ°Æ¡ng thá»©c gettter vÃ  setter cá»§a category
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	// PhÆ°Æ¡ng thá»©c gettter vÃ  setter cá»§a director
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	// PhÆ°Æ¡ng thá»©c gettter vÃ  setter cá»§a length
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	// PhÆ°Æ¡ng thá»©c gettter vÃ  setter cá»§a cost
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return (id+1) + ".DVD - [" + title + "] - [" + category + "] - [" + director + "] - ["
				+ length + "] : [" + cost + "$]";
	}
	
	
	
	
}
