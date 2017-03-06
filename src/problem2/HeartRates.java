package problem2;

import java.time.LocalDate;
import java.util.Date;
import java.time.Period;

public class HeartRates {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private final int RHR=70;
	private final double LB=0.5;
	private final double UB=0.85;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	HeartRates(String firstName, String lastName, LocalDate dateOfBirth){
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
	}
	
	public Period getAge(LocalDate dateOfBirth){
		LocalDate today= LocalDate.now();
		return Period.between(dateOfBirth, today);
	}
	
	public int getMHR(int age){
		return 220-age;
	}
	
	public String printRangeOfTHR(int age){
		int AHR= (getMHR(age)-RHR);
		int LBTHR=(int)Math.round(AHR*LB)+RHR;
		int UBTHR=(int)Math.round(AHR*UB)+RHR;
		return "Target Heart Rate Range is between " + LBTHR + " and "+UBTHR;
	}
	
	public String toString(int age) {
		return "[" + firstName + ", " + lastName + ", " + "DOB: " + dateOfBirth + "] \nPerson's age: "+age+ ", Maximum Heart Rate(MHR): " + getMHR(age)+" and \n"+ printRangeOfTHR(age);
	}
}
