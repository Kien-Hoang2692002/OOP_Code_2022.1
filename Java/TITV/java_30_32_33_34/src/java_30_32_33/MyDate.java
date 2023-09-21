package java_30_32_33;

import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		if( day >= 1 && day <= 31) {
		this.day = day;
		}else {
			this.day = 1;
		}
		if( month >= 1 && month <= 12) {
		this.month = month;
		}else {
			this.month = 1;
		}
		if(year >= 1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}
	// 34. equals && hashCode
	
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	// 33. toString	
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
//	@Override //auto
//	public String toString() {
//		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
//	}

	////32 setter && getter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if( day >= 1 && day <= 31) {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if( month >= 1 && month <= 12) {
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >= 1) this.year = year;
	}


  ///30
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	
	public void printMonth() {
		System.out.println("Month: " + this.month);
	}
	
	public void printYear() {
		System.out.println("Year: " + this.year);
	}
	
	public void printDate() {
		System.out.println("Date: "+ this.day +"-"+this.month +"-"+this.year);
	}
	
	
}
