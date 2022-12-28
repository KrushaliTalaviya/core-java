package program;

/**
 * practical no-5 Write a program to demonstrate the example of the ‘for’ loop.
 * print the pattern. * ** *** **** *****
 *
 * @author Krushali
 */
public class Pattern {

	public static void main(String[] args) {

		// declare the variables for loop
		int i, j;

		// outer loop for rows
		for (i = 1; i <= 5; i++) {

			// inner loop for columns
			for (j = 1; j <= i; j++) {

				// print starts
				System.out.print(" * ");
			}

			// throws the cursor in new line after printing each line
			System.out.print("\n");
		}

	}

}
