package problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int month=0;
		int date=0;
		int year=0;
		String sMonth;
		String outputDate = "";		
		String sDate="";
		LocalDate ld;
			
		/*a.Output the date in multiple formats, such as
		MM/DD/YYYY
		June 14, 2016
		DDD YYYY */
//		System.out.println("Please enter a date as dd-MMM-yyyy: ");
//		inputDate1=scan.next();
//		ld=LocalDate.parse(inputDate1, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
//		inputDate1=ld.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
//		inputDate2=ld.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
//		inputDate3=ld.format(DateTimeFormatter.ofPattern("DDD yyyy"));
//		System.out.println("MM/dd/yyyy: "+inputDate1+ "\nMMM dd, yyyy: "+ inputDate2+ "\nDDD yyyy: "+inputDate3);
		
		//c.Get the choices from the user as follows and supply input through console.
		String cont="Y";
		try{
			while(cont.equalsIgnoreCase("Y")){
				System.out.println("Enter 1 for format: MM/dd/yyyy \nEnter 2 for format: Month dd, yyyy \nEnter 3 for format: DDD yyyy \nEnter 4 to exit \nChoose your Choice :");
				String choice=scan.next();
				switch (choice) {
				case "1":
					System.out.println("Choice 1: Please enter a date following format MM/dd/yyyy");
					System.out.println("Enter Month: ");
					month=scan.nextInt();
					System.out.println("Enter Date: ");
					date=scan.nextInt();
					System.out.println("Enter Year: ");
					year=scan.nextInt();									
					sDate=month+"/"+date+"/"+year;
					MyDate md1=new MyDate(date, month, year);		
					outputDate=md1.displayDateFormat1(sDate);									
					break;
				case "2":
					System.out.println("Choice 2: Please enter a date following format Month dd, yyyy");
					System.out.println("Enter Month in text: ");
					sMonth=scan.next();
					System.out.println("Enter Date: ");
					date=scan.nextInt();
					System.out.println("Enter Year: ");
					year=scan.nextInt();				
					sDate=sMonth+" "+date+ ", "+year;
					MyDate md2=new MyDate(sMonth, date, year);					
					outputDate=md2.displayDateFormat2(sDate);					
					break;
				case "3":
					System.out.println("Choice 3: Please enter a date following format DDD yyyy");				
					System.out.println("Enter Day of Year: ");
					date=scan.nextInt();
					System.out.println("Enter Year: ");
					year=scan.nextInt();
					sDate=date+" "+year;
					MyDate md3=new MyDate(date, year);
					outputDate=md3.displayDateFormat3(sDate);//LocalDate.parse(inputDate3, DateTimeFormatter.ofPattern("D yyyy"));
					
					break;

				case "4":
				default:	
					System.out.println("Thank you for your choice!");
					cont="N";
					break;
				}	
				
				if(choice!="4"){
					if (cont.equalsIgnoreCase("N")){
						break;						
					}
					System.out.println(outputDate);	
					System.out.println("Do you want to continue? (Y/N)");
					cont=scan.next();
					
				}
				
				
			}
		}
			catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
		
		
	
	
	
	}
}
