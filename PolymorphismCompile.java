package program;

/**
 * practical no-16 : Write a program to demonstrate two types of polymorphism
 * like compile-time and runtime polymorphism
 * 
 * compile-time polymorphism(overloading)
 * 
 * @author Krushali
 */
class Multiplication {

	// create a method for multiplication in integer
	int multi(int num1, int num2) {
		return num1 * num2;
	}

	// overloading method for multiplication in integer-double
	double multi(int num1, double num2) {
		return num1 * num2;
	}

	// overloading method for multiplication in double-double
	double multi(double num1, double num2) {
		return num1 * num2;
	}
}

public class PolymorphismCompile {

	public static void main(String[] args) {
		Multiplication multipl = new Multiplication();
		double result;
		result = multipl.multi(10, 10);
		System.out.println("Your integer-interger multiplication is: " + result);
		result = multipl.multi(10, 10.5);
		System.out.println("Your integer-double multiplication is: " + result);
		result = multipl.multi(10.5, 10.5);
		System.out.println("Yout double-double multiplication is: " + result);
	}

}
