package java_59_Enum;

public class Test {
	
	public static void main(String[] args) {
		ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toán Lí Hóa");
		ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Văn Sử Địa");
		ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Sinh");
		ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday, "Công dân ");
		
		System.out.println(tkb_t5);
		
		int x = Month.Thang_1.soNgay();
		System.out.println(x);
	}
}
