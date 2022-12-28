package program;

/**
 * practical no-18 : Write a program to handle exceptions using try, catch,
 * finally, throw, and throws keywords.
 * 
 * using Try-Catch
 * 
 * @author Krushali
 */
public class TryCatch {

	public static void main(String[] args) {
		// below code throw the exception
		try {
			int data = 50 / 0;
			System.out.println(data);
		}

		// catch will be executed
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
