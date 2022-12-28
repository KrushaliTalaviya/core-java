package program;

import java.util.*;

/**
 * Practical-20 Write a program to add string values(“Hello”,”world”,”$yourname”
 * etc.) in the list and print all the values using an iterator.
 * 
 * @author Krushali
 */
public class ListandIterator {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(); // ArrayList
		System.out.println("Enter you Name: ");

		// Take a input from the user
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine(); // Input user name
		sc.close(); // close the scanner class
		
		arr.add(name); // add the value in the array
		arr.add("Hello");
		arr.add("world");
		arr.add("Java");

		// print the value using Iterator
		Iterator<String> array = arr.iterator();
		while (array.hasNext()) {
			System.out.println(array.next());
		}
	}

}
