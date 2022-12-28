package program;

import java.util.Scanner;

/**
 * practical no-8 Apply EMI Calculator in Java - Java program to calculate EMI
 * using Class, Object, Variables, Operators, and DataTypes.
 *
 * @author Krushali
 */
public class Emicalc {

	public static void main(String[] args) {

		// Scanner class to take user input.
		Scanner sc = new Scanner(System.in);

		// take a amount value of amount
		System.out.println("Enter a Principal:");
		double amount = sc.nextFloat();

		// take a rate per year
		System.out.println("Enter a rate:");
		double rate = sc.nextFloat();

		// take a time in to the year
		System.out.println("Enter a Time in year:");
		double time = sc.nextFloat();

		// close scanner class
		sc.close();
		rate = rate / (12 * 100); /* one month interest */
		time = time * 12; /* one month period */

		double EMI = (amount * rate * Math.pow(rate + 1, time)) / (Math.pow(rate + 1, time) - 1);
		System.out.println("EMI value is: " + EMI);

	}

}
