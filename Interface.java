package program;

/**
 * practical no-17 : : Write a program to demonstrate the interface.
 * 
 * using Multiple Interface
 * 
 * @author Krushali
 */
//create a multiple interface
interface Animals {

	// create a method cat
	void cat();
}

interface Car {

	// create a method bmw
	void bmw();
}

interface World extends Car, Animals {

	// create a method earth
	void earth();
}

//implementation of inheritance methods
class Superclass implements Animals, Car, World {
	public void cat() {
		System.out.println("This is a cat");
	}

	public void bmw() {
		System.out.println("This is a BMW");
	}

	public void earth() {
		System.out.println("This is a Earth");
	}

}

public class Interface {

	public static void main(String[] args) {
		// create a object of class which implement interface
		Superclass sp1 = new Superclass();

		// call the methods
		sp1.cat();
		sp1.bmw();
		sp1.earth();
	}

}
