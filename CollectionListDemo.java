package program;

import java.util.*;

/**
 * Make a list using collection and print
 * 
 * @author Krushali
 */
public class CollectionListDemo {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(); // ArrayList
		arr.add("Mango"); // Add string values
		arr.add("Orange");
		arr.add("Kiwi");
		arr.add("Greps");
		arr.add(2, "Apple"); // Add String value at given position

		// print all values
		System.out.println("List is: " + arr);
	}

}
