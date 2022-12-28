package program;

import java.util.Scanner;

/**
 * practical no-3 Write a program to find the current month name from the given
 * number of the switch case.
 *
 * @author Krushali
 */
public class Switchcase {

	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number From 1 to 12");

		// take a choice from user between 1 to 12
		int choice = sc.nextInt();
		sc.close(); // close the scanner class

		// Take a variable for choice value
		String str = "";
		switch (choice) {

		case 1:
			str = "January";
			break;
		case 2:
			str = "February";
			break;
		case 3:
			str = "March";
			break;
		case 4:
			str = "April";
			break;
		case 5:
			str = "May";
			break;
		case 6:
			str = "June";
			break;
		case 7:
			str = "July";
			break;
		case 8:
			str = "August";
			break;
		case 9:
			str = "September";
			break;
		case 10:
			str = "October";
			break;
		case 11:
			str = "November";
			break;
		case 12:
			str = "December";
			break;
		default:
			System.out.println("Your choice is Invalid\nPlease Enter a Valid choice");
			return;
		}

		// print the choice eg. if choice is 1 then return January
		System.out.println("Your Month is " + str);
	}

}