package interfaces;
import java.util.Scanner;

public class ShapeTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("length:");
		double length = input.nextDouble();
		System.out.println("width:");
		double width = input.nextDouble();
		Rectangle box = new Rectangle(length, width);
		Shape thing = box;
		System.out.println("perimeter: " + box.perimeter());
		System.out.println("area: " + box.area());
		box.setWidth(1);
		box.setLength(1);
		System.out.println("width: " + box.getWidth());
		System.out.println("length: " + box.getLength());
		System.out.println("perimeter: " + thing.perimeter());
		System.out.println("area: " + thing.area());


	}

}
