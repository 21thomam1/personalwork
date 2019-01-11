package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	private double height;
	public Trapezoid() {
		super();
		height = 1;
	}

	public Trapezoid(double leg1, double leg2, double base1, double base2, double xheight) {
		super(leg1, leg2, base1, base2);
		height = xheight;
	}
	
	public void setHeight(double xheight)	{
		height = xheight;
	}
	
	public double getHeight()	{
		return height;
	}
	
	public double area() {
		return (super.getside4() + super.getside3()) / 2 * height;
	}
}
