package program;

/**
 * practical no-15 : Write a program to demonstrate all types of Inheritance
 * Multilevel Inheritance
 *
 * @author Krushali
 */
//create a super class
class First1 {
	void showfirst() {
		System.out.println("This is a first");
	}
}

//create a subclass of super class
class Second1 extends First1 {
	void showsecond() {
		System.out.println("This is a second");
	}
}

//create a subclass of subclass
class Third1 extends Second1 {
	void showthird() {
		System.out.println("This is a third");
	}
}

public class InheritanceMultileval {

	public static void main(String[] args) {
		Third1 t3 = new Third1();
		t3.showthird();
		t3.showsecond();
		t3.showfirst();
	}

}
