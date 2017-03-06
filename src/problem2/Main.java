package problem2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fName = "Hong";
		String lName = "Ha";
		LocalDate dOB= LocalDate.parse("1982-08-30");
		HeartRates hr= new HeartRates(fName, lName, dOB);
		int age= hr.getAge(dOB).getYears();
		System.out.println(hr.toString(age));
		
	}

}
