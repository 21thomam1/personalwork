package inheritance;

public class Parallelogram extends Quadrilateral{
	private double height;
	public Parallelogram()	{
		super();
	}
	
	public Parallelogram(double s1, double s2, double s3, double s4)	{
		super(s1, s2, s3, s4);
		height = 1;
	}
	
	public void setHeight(double xheight)	{
		height = xheight;
	}
	
	public double getHeight()	{
		return height;
	}
	
	public double area()	{
		return super.getside2() * height;
	}
	
	public String toString()	{
		return "Parallelogram object height: " + height + super.toString();
	}
}
