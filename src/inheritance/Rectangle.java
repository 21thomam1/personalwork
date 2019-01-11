package inheritance;

public class Rectangle extends Parallelogram implements Geo{
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width)	{
		super(length, width, length, width);
	}

	public double area()	{
		return super.getside1() * super.getside2();
	}
}