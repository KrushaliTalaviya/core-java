package program;

/**
 * practical no-9 Create a practical to compare two variables of Wrapper class
 * using Wrapper classes.
 *
 * @author Krushali
 */
public class Wrapperclass {

	public static void main(String[] args) {
		// take a value in wrapper class for Integer,character
		Integer value1 = Integer.valueOf(100);
		Integer value3 = Integer.valueOf(100);
		String char1 = String.valueOf('J');

		// declare a variable
		int value2 = 5;
		String char2 = "k";

		System.out.println("Value of Integer Object is: " + value1);
		System.out.println("Value of Character Object is: " + char1);

		// compare the value of wrapper class
		System.out.println(value1 == value2);
		System.out.println(value1 == value3);
		System.out.println(char1 == char2);
	}

}
