package program;

/**
 * practical no-12 Write a program to demonstrate static methods, variables, and blocks.
 *
 * @author Krushali
 */
public class KeywordStatic {
	
	static int marks=96; //declare static variable
	static String name="krushali"; //declare static string
	
	//declare static function
	static void printvalue(String sub) {
		
		System.out.println("Marks is: "+marks);
		System.out.println("Name is: "+name);
		System.out.println("Subject is:"+sub);
		
	}
	
	//static block
	static {
		System.out.println("This is a static block");
	}

	public static void main(String[] args) {
		printvalue("maths");
	}

}
