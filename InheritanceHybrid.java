package program;

/**
 * practical no-15 : Write a program to demonstrate all types of Inheritance
 * Hybrid Inheritance
 *
 * @author Krushali
 */
//create super class
class FirstMain1 {
	void showmain() {
		System.out.println("This is a first-main");
	}
}

//create a sub class 1 of super class
class FirstSub1 extends FirstMain1 {
	void showsub1() {
		System.out.println("This is a sub 1 of first main");
	}
}

//create a sub class 2 of super class
class FirstSub2 extends FirstMain1 {
	void showsub2() {
		System.out.println("This is a sub 2 of first main");
	}
}

//create a sub class of sub class 1
class FirstSubSub1 extends FirstSub1 {
	void showsubsub1() {
		System.out.println("This is a sub of sub 1");
	}
}

//create a sub class of sub class 2
class FirstSubSub2 extends FirstSub2 {
	void showsubsub2() {
		System.out.println("This is a sub of sub 2");
	}
}

public class InheritanceHybrid {

	public static void main(String[] args) {

		// create a object of left side last subclass
		FirstSubSub1 first = new FirstSubSub1();

		// create a object of right side last subclass
		FirstSubSub2 second = new FirstSubSub2();
		first.showsubsub1();
		first.showsub1();
		first.showmain();
		second.showsubsub2();
		second.showsub2();
		second.showmain();
	}

}
