package interfaces;

import java.util.ArrayList;

public class ShapeTest3 {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1, 1);
		Circle circ1 = new Circle(1);
		Circle circ2 = new Circle(1);
		Rectangle rect2 = new Rectangle(1, 1);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(rect1);
		shapes.add(circ1);
		shapes.add(circ2);
		shapes.add(rect2);
		double total = 0;
		double smallest = 9999;
		for (int i = 0; i < shapes.size(); i++) {
			total += shapes.get(i).area();
		}
		System.out.println("total area: " + total);

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).perimeter() < smallest) {
				smallest = shapes.get(i).perimeter();
			}
		}
		System.out.println("smallest perimeter: " + smallest);
	}
}