import java.util.Scanner;

//6.4 Write a program to display the number of days of a month, which is entered by users (both month and year). 
//If it is an invalid month/year, ask the user to enter again.
// HoangVanKien-20205089
public class Lab01_64 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Khai báo tháng năm 
		int year  ; 
		String month ;
		
		// Khai báo mặc định số ngày trong tháng;
		int numberOfDaysOfAMonth = 0 ;
		
		// Nhập năm và tháng
		System.out.println("Nhập tháng: ");
		month = sc.nextLine();
		System.out.println("Nhập năm: ");
		year = sc.nextInt();
		
		
		// Kiểm tra số ngày trong tháng
		switch (month) {
		// Tháng 1
		case "1":
		case "January":
		case "Jan.":
		case "Jan" :
		// Tháng 3
		case "3":
		case "March":
		case "Mar.":
		case "Mar" :
		// Tháng 5
		case "5":
		case "May":
		// Tháng 7
		case "7":
		case "July":
		case "Jul":
		// Tháng 8
		case "8":
		case "August":
		case "Aug.":
		case "Aug":
		// Tháng 10
		case "10":
		case "October":
		case "Oct.":
		case "Oct":
		// Tháng 12	
		case "12":
		case "December":
		case "Dec.":
		case "Dec":
			numberOfDaysOfAMonth = 31 ;
			break;
		// Tháng 4
		case "4":
		case "April":
		case "Apr.":
		case "Apr":
		// Tháng 6
		case "6":
		case "June":
		case "Jun":
		// Tháng 9
		case "9":
		case "September":
		case "Sept.":
		case "Sep":
		// Tháng 11
		case "11":
		case "November":
		case "Nov.":
		case "Nov":
			numberOfDaysOfAMonth = 30 ;
			break ;
		// Tháng 2
		case "2":
		case "February":
		case "Feb.":
		case "Feb":
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                numberOfDaysOfAMonth = 29;
            } else {
            	numberOfDaysOfAMonth = 28 ;
            }
            break;
		
		default:
			System.out.println("Nhập sai rồi bạn ơi!");
			break;
		}
		// In 
		System.out.println("Tháng " + month + " năm " + year + " có " + numberOfDaysOfAMonth + " ngày." );
		
		
	}
}
