package interfaces;
import java.util.Scanner;
public class ShapeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("length:");
		double length = input.nextDouble();
		System.out.println("width:");
		double width = input.nextDouble();
		Shape thing1 = new Rectangle(length, width);
		System.out.println("perimeter or rectangle: " + thing1.perimeter());
		System.out.println("area of rectangle: " + thing1.area());
		System.out.println("radius:");
		double radius = input.nextDouble();
		Shape thing2 = new Circle(radius);
		System.out.println("perimeter of circle: " + thing2.perimeter());
		System.out.println("area of circle: " + thing2.area());

	}

}
