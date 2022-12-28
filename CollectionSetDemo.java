package program;

import java.util.HashSet;

/**
 * create a set using collection and print
 * 
 * @author Krushali
 */
public class CollectionSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>(); // create a HashSet
		hashset.add("One"); // add the string value
		hashset.add("Two");
		hashset.add("Three");
		hashset.add("Four");
		hashset.add("Five");

		// print the value of HashSet
		System.out.println("Contents is: " + hashset);
	}

}
