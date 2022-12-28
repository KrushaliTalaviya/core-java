package program;

/**
 * practical no-18 : Write a program to handle exceptions using try, catch,
 * finally, throw, and throws keywords.
 * 
 * using Try-Catch-Finally
 * 
 * @author Krushali
 */
public class TryCatchFinally {

	public static void main(String[] args) {
		// below code throw the exception
		try {
			int data = 50 / 0;
			System.out.println(data);
		}

		// catch block will be executed
		catch (Exception e) {
			System.out.println(e);
		}

		// finally block will be always executed if exception occurs or not
		finally {
			System.out.println("This code is executed");
		}
	}

}
