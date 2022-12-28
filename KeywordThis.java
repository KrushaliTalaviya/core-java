package program;

/**
 * practical no-11 Write a program to use this keyword
 *
 * @author Krushali
 */
class This {

	// declare the variable
	int value1 = 10;

	void show() {

		// using this keyword we can print here value1
		this.value1 = 100;
		System.out.println("value is: " + value1);

	}
}

public class KeywordThis {

	public static void main(String[] args) {
		This this1 = new This();
		this1.show(); /* call the function */

		// throw the error because this keyword is use only current class
		// this.value1=200;
		// System.out.println("value is: "+value1);
	}

}
