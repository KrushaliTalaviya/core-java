package program;

/**
 * practical no-10 : Create programs of all the string methods like charAt(),
 * concat(), equals() etc.
 * tolowerCase(),toupperCase(),trim(),startsWith(),endsWith(),charAt()
 * length(),valueOf(),replace(),concat(),equals()
 *
 * @author Krushali
 */
public class StringMethods {

	public static void main(String[] args) {
		// Declare variable
		String str1 = "  Java  ";
		String str2 = str1.toUpperCase(); /* Convert UpperCase */
		System.out.println("In uppercase: " + str2);

		// convert upperCase to lowerCase
		str1 = str2.toLowerCase();
		System.out.println("In lowercase: " + str1);

		// trim in str1
		str1 = str1.trim();
		System.out.println("Using trim method:" + str1);

		// startsWith string method
		System.out.println(str1.startsWith("Ja"));
		System.out.println(str1.startsWith("ja"));

		// endsWith string method
		System.out.println(str1.endsWith("va"));
		System.out.println(str1.endsWith("VAS"));

		// CharAt() string method in java which find the number in the given position
		System.out.println("In 2nd position: " + str1.charAt(2));

		// length of string
		System.out.println("Length of string is: " + str1.length());

		// valueOf string method
		int value = 10;
		String str3 = String.valueOf(value);
		System.out.println(str3 + 10);

		// replace string method
		str1 = str1.replace("java", "Core-java");
		System.out.println("java is replace with Core-java: " + str1);

		// concat() string method
		str1 = str1.concat(str3);
		System.out.println(str1);

		// equals string method
		System.out.println(str1.equals(str3));
	}

}
