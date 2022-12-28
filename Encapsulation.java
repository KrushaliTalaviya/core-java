package program;

/**
 * practical no-14 Write a program to demonstrate encapsulation
 *
 * @author Krushali
 */
//encapsulated class Student
class Student {
	// private data member
	private String name;

	// get method for name
	public String getname() {
		return name;
	}

	// set method for name
	public String setname(String name) {
		return this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		// creating the object of encapsulated class
		Student s = new Student();

		// setting the value in name member
		s.setname("Vraj");

		// get value of the name member
		System.out.println("Student name is: " + s.getname());
	}

}
