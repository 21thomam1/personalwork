package oop;

public class IsoscelesTrapezoid {

	private double base1;
	private double base2;
	private double height;
	private double leg;
	
	public IsoscelesTrapezoid()
	{
		base1 = -99.9;
		base2 = -99.9;
		height = -99.9;
		leg = -99.9;
	}
	
	public void setBase1(double newBase1)
	{
		base1 = newBase1;
	}
	
	public void setBase2(double newBase2)
	{
		base2 = newBase2;
	}
	
	public void setHeight(double newHeight)
	{
		height = newHeight;
	}
	
	public void setLeg(double newLeg)
	{
		leg = newLeg;
	}
	
	public double getBase1()
	{
		return base1;
	}
	
	public double getBase2()
	{
		return base2;
	}
		
	public double getHeight()
	{
		return height;
	}
	
	public double getLeg()
	{
		return leg;
	}
	
	public double area()
	{
		double area = .5 * (base1 + base2) * height;
		return area;
	}

	public double perimeter()
	{
		double perimeter = base1 + base2 + leg + leg;
		return perimeter;
	}
	
}
