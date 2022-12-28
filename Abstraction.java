package program;

/**
 * practical no-13 Write a program to demonstrate data abstraction. using
 * abstract data and abstract method
 *
 * @author Krushali
 */
abstract class Figure {

	// declare a variable for dimension
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	// area is now abstracted method
	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	// override area of rectangle
	double area() {
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	// override area of triangle
	double area() {
		return (dim1 * dim2) / 2;
	}
}

public class Abstraction {

	public static void main(String[] args) {

		// Figure f=new Figure(10,10); //now this is show error
		Rectangle r = new Rectangle(10, 10);
		Triangle t = new Triangle(10, 15);
		Figure figure1; // this is okay no object is created

		figure1 = r;
		System.out.println("Area of rectangle is: " + figure1.area());

		figure1 = t;
		System.out.println("Area of triangle is: " + figure1.area());
	}

}
