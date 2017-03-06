package problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MyDate {

	private int date;
	private int month;
	private int year;	
	private String sMonth;
	LocalDate ld;
	public static final String DATE_PATTERN1="MM/dd/yyyy";
	public static final String DATE_PATTERN2="MMMM dd, yyyy";
	public static final String DATE_PATTERN3="D yyyy";
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getsMonth() {
		return sMonth;
	}

	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}


	//In the first case the constructor should receive three integer values.
	MyDate(int date, int month, int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	//In the second case it should receive a String and two integer values.
	MyDate(String sMonth, int date, int year){
		this.date=date;
		this.sMonth=sMonth;
		this.year=year;
	}
	
	//In the third case it should receive two integer values, the first of which represents the day number in the year
	MyDate(int date, int year){
		this.date=date;		
		this.year=year;
	}
	
	public String displayDateFormat1 (String d){				
		ld=LocalDate.parse(d, DateTimeFormatter.ofPattern("M/d/yyyy"));
		return "MM/dd/yyyy:\t"+ ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN1))+"\nMonth dd, yyyy:\t"+  ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN2))+ "\nDDD yyyy:\t"+ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN3));	
		
	}
	
	public String displayDateFormat2 (String d){				
		ld=LocalDate.parse(d, DateTimeFormatter.ofPattern("MMMM d, yyyy"));		
		return "MM/dd/yyyy:\t"+ ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN1))+"\nMonth dd, yyyy:\t"+  ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN2))+ "\nDDD yyyy:\t"+ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN3));
		
	}
	
	public String displayDateFormat3 (String d){				
		ld=LocalDate.parse(d, DateTimeFormatter.ofPattern("D yyyy"));
		return "MM/dd/yyyy:\t"+ ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN1))+"\nMonth dd, yyyy:\t"+  ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN2))+ "\nDDD yyyy:\t"+ld.format(DateTimeFormatter.ofPattern(DATE_PATTERN3));	
		
	}
	
	
	
}
