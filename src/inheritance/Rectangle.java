package inheritance;

public class Rectangle extends Quadrilateral {
	Quadrilateral bob = new Quadrilateral();
	public Rectangle() {
		bob.setside1(10);
		bob.setside2(5);
		bob.setside3(10);
		bob.setside4(5);
	}

	public Rectangle(double xs1, double xs2, double xs3, double xs4)	{
		bob.setside1(xs1);
		bob.setside2(xs2);
		bob.setside3(xs3);
		bob.setside4(xs4);
	}

	public double area()	{
		return bob.getside1() * bob.getside2();
	}
}
