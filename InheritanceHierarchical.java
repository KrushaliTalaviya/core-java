package program;

/**
 * practical no-15 : Write a program to demonstrate all types of Inheritance
 * Hierarchical Inheritance
 *
 * @author Krushali
 */
//create a super class
class Firstmain {
	void showfirst() {
		System.out.println("This is a super class");
	}
}

//create a sub class 1 of super class
class First1st extends Firstmain {
	void showfirst1() {
		System.out.println("This is a subclass one of super class");
	}
}

//create a sub class 2 of super class
class First2nd extends Firstmain {
	void showfirst2() {
		System.out.println("This is a subclass two of super class");
	}
}

public class InheritanceHierarchical {

	public static void main(String[] args) {

		// create a object of subclass 2
		First2nd f1 = new First2nd();
		f1.showfirst();
		f1.showfirst2();
		// f1.showfirst1(); //show error
	}

}
