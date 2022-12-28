package program;

/**
 * practical no-19 : Write a program to find the index of an array element.
 * 
 * @author Krushali
 */

public class ArrayElementFind {

	// serching method in the array
	public static int array_find(int array[], int t) {
		// if array is null
		if (array == null) {
			return -1;
		}

		// find the length of array
		int len = array.length;
		int i = 0;

		// serching in the array
		while (i < len) {

			// if i element is equal to find number then return i
			if (array[i] == t) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 8, 9 };
		// find the index of 8
		System.out.println("Index position of 8 is: " + array_find(a, 8));
	}

}
