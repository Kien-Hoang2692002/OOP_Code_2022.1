package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt 
 * cược số tiền ít hơn hoặc bằng số tiền họ đang có
 * Luật chơi:
 * Có 3 viên xúc xắc. Mỗi viên từ 1 đến 6
 * Mỗi lần lắc sẽ ra 1 kết quả. Kết quá = xx1 + xx2 + xx3
 * 1.Nếu tổng = 3 hoặc 18 => Cái ăn hết , người chơi thua.
 * 2.Nếu tổng =(4->10) <->Xỉu => Nếu người chơi đặt xỉu thì người chơi thắng , ngược lại thì thua
 * 3.Nếu tổng =(11->17) <->Tài => Nếu người chơi đặt tài thì người chơi thắng , ngược lại thì thua
 */

public class TaiXiu {
	public static void main(String[] args) {
		
		double taiKhoanNguoiChoi = 5000000.99 ;
		Scanner sc = new Scanner(System.in);

		//Locale lc = new Locale("vi", "VN");
		//NumberFormat numf = NumberFormat.getInstance(lc);
		
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		
		int luaChon = 0;
		
		do {
			System.out.println("---Mời bạn lựa chọn---");
			System.out.println("Chọn (1) để tiếp tục chơi");
			System.out.println("Chọn phím bất kỳ để thoát");
			luaChon = sc.nextInt();
			if( luaChon ==  1) {
				System.out.println("BẮT ĐẦU CHƠI");
				
				// Đặt cược
				System.out.println("Tài khoản của bạn la:" + numf.format(taiKhoanNguoiChoi)+ " Bạn muốn cược bao nhiêu?");
				double datCuoc = 0 ;
				do {
					System.out.println("Đặt cược (0<=Số tiền cực <="+ numf.format(taiKhoanNguoiChoi)+":");
					datCuoc =  sc.nextDouble();
				}while(datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
				
				// Chọn tài xỉu
				int luaChonTaiXiu = 0 ;
				do {
					System.out.println("Chọn (1) là Tài");
					System.out.println("Chọn (2) là Xỉu");
					luaChonTaiXiu = sc.nextInt();
				}while(luaChonTaiXiu!=1 && luaChonTaiXiu!=2);
				
				// Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(6) + 1 ;
				int giaTri2 = xucXac2.nextInt(6) + 1 ;
				int giaTri3 = xucXac3.nextInt(6) + 1 ;
				int tong = giaTri1 + giaTri2 + giaTri3 ;
				
				// Tính toán kết quả
				System.out.println("Kết quả: " + giaTri1+"-"+ giaTri2 +"-"+giaTri3);
				if(tong== 3 ||  tong == 18) {
					taiKhoanNguoiChoi -= datCuoc ;
					System.out.println("Tổng là: "+tong+"=>Nhà cái ăn hết, bạn đã thua!");
					System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi) );
				}else if( tong >= 4 & tong <= 10) {
					System.out.println("Tổng là: "+tong+"=>Xỉu");
					if(luaChonTaiXiu == 2) {
						System.out.println("Bạn đã thắng cược!");
						taiKhoanNguoiChoi += datCuoc ;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi) );
					}else {
						System.out.println("Bạn đã thua cược!");
						taiKhoanNguoiChoi -= datCuoc ;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi) );
					}
					
				}else {
					System.out.println("Tổng là: "+tong+"=>Tài");
					if(luaChonTaiXiu == 1) {
						System.out.println("Bạn đã thắng cược!");
						taiKhoanNguoiChoi += datCuoc ;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi) );
					}else {
						System.out.println("Bạn đã thua cược!");
						taiKhoanNguoiChoi -= datCuoc ;
						System.out.println("Tài khoản của bạn là: "+numf.format(taiKhoanNguoiChoi) );
					}
				}
				
			}else if(luaChon != 1) {
				System.out.println("Bạn đã thoát!");
			}
			
		}while(luaChon == 1);
		
	}
}
