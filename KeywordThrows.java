package program;

/**
 * practical no-18 : Write a program to handle exceptions using try, catch,
 * finally, throw, and throws keywords.
 * 
 * throws keyword
 * 
 * @author Krushali
 */
public class KeywordThrows {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
	}

}
