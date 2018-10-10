package oop;

public class TestRectangle {

	public static void main(String[] args) {
	Rectangle box = new Rectangle();
	System.out.println("box length: " + box.getLength());
	System.out.println("box width: " + box.getWidth());
	System.out.println("box perimeter: " + box.perimeter());
	System.out.println("box area: " + box.area());
	box.setLength(4.5);
	box.setWidth(7);
	System.out.println("box length: " + box.getLength());
	System.out.println("box width: " + box.getWidth());
	
	box = new Rectangle(3.0, 8.75);
	System.out.println("box length: " + box.getLength());
	System.out.println("box width: " + box.getWidth());
	System.out.println("box perimeter: " + box.perimeter());
	System.out.println("box area: " + box.area());
	box.setLength(4.5);
	box.setWidth(7);
	System.out.println("box length: " + box.getLength());
	System.out.println("box width: " + box.getWidth());
	
	}
}
