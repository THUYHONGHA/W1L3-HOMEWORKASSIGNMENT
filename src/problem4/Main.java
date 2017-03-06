package problem4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var1 = 0;
		double var2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter C for Circle \nEnter R for Rectangle \nEnter T for Triangle");
		String choice = scan.next();
		String cont = "Y";
		while (cont.equalsIgnoreCase("Y")) {
			switch (choice) {
			case "C":
			case "c":
				System.out.println("Enter the radius of the Circle: ");
				var1 = scan.nextDouble();
				Circle c = new Circle(var1);
				System.out.println("The area of the Circle is: " + c.computeArea());
				break;
			case "R":
			case "r":
				System.out.println("Enter the width of the Rectangle: ");
				var1 = scan.nextDouble();
				System.out.println("Enter the height of the Rectangle: ");
				var2 = scan.nextDouble();
				Rectangle r = new Rectangle(var1, var2);
				System.out.println("The area of the Rectangle is: " + r.computeArea());
				break;
			case "T":
			case "t":
				System.out.println("Enter the base of the Triangle: ");
				var1 = scan.nextDouble();
				System.out.println("Enter the height of the Triangle: ");
				var2 = scan.nextDouble();
				Triangle t = new Triangle(var1, var2);
				System.out.println("The area of the Triangle is: " + t.computeArea());
				break;

			default:
				System.out.println("Enter C for Circle \nEnter R for Rectangle \nEnter T for Triangle");
				choice=scan.next();
				break;
			}
			System.out.println("Do you want to continue? (Y/N) ");
			cont = scan.next();
			if (cont.equalsIgnoreCase("Y")) {
				System.out.println("Enter C for Circle \nEnter R for Rectangle \nEnter T for Triangle");
				choice = scan.next();
			}

		}
		scan.close();
	}

}
