package program;

/**
 * practical no-7 Write a program to demonstrate the example of constructor and
 * Parameterized constructor. Pass two integer parameters and apply any
 * mathematical formula
 *
 * @author Krushali
 */
class sum {
	int num1, num2, sum;

	// create a parameterized constructor
	sum(int a, int b) {
		num1 = a;
		num2 = b;
	}

	// sum of the value and return the sum
	int sumnum1num2() {
		sum = num1 + num2;
		return sum;
	}
}

public class Constructor {

	public static void main(String[] args) {
		// create a object of parameterized constructor
		sum s = new sum(10, 15);

		// call the function and its return a sum
		int result = s.sumnum1num2();

		// print the sum
		System.out.println("Result is: " + result);
	}

}
