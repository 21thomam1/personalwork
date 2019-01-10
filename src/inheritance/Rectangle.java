package inheritance;

public class Rectangle extends Quadrilateral {
	public Rectangle() {
		setside1(10);
		setside1(5);
		setside1(10);
		setside1(5);
	}

	public Rectangle(double length, double width)	{
		setside1(length);
		setside2(width);
		setside3(length);
		setside4(width);
	}

	public double area()	{
		return s1 * s2;
	}
}
