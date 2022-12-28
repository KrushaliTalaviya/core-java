package program;

/**
 * practical no-15 : Write a program to demonstrate all types of Inheritance
 * Single Inheritance
 *
 * @author Krushali
 */
//super class
class First {
	void cat() {
		System.out.println("This is a Cat.");
	}
}

//subclass of superclass
class Second extends First {
	void dog() {
		System.out.println("This is a Dog.");
	}
}

public class InheritanceSingle {

	public static void main(String[] args) {

		// create a object of subclass
		Second s2 = new Second();
		s2.dog();
		s2.cat();
	}

}
