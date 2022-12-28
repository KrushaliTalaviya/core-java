package program;

/**
 * practical no-6 Write a program to demonstrate the example of a
 * break/Continue. skip the number 3 break from the number 8
 *
 * @author Krushali
 */
public class BreakContinue {

	public static void main(String[] args) {
		// take a variable num
		int num;

		// for loop from 1 to 10
		for (num = 1; num <= 10; num++) {

			// skip the number using continue
			if (num == 3) {
				continue;
			}

			// break the loop using break
			if (num == 8) {
				break;
			}
			System.out.println(num);
		}
	}

}
