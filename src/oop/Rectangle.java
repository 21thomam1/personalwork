package oop;

public class Rectangle {

	//instance fields
	private double length;
	private double width;
	
	//constructors
	public Rectangle()
	{
		length = 10;
		width = 5;	
	}
	
	public void Rectangle(double newL, double newW)
	{
		length = newL;
		width = newW;
	}

	//mutator methods
	public void setLength(double newL)
	{
		length = newL;
	}
	
	public void setWidth(double newW)
	{
		width = newW;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double perimeter()
	{
		return 2 * length + 2 * width;
	}
	
	public double area()
	{
		return length * width;
	}
}
