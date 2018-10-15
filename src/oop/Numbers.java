package oop;
public class Numbers {
	public Numbers()
	{
	}
	
	public void sayNumber(double num)
	{
	System.out.println("Your number is " + num);	
	}
	
	public void sayNumberPlus2(double num)
	{
	num = num + 2;
	System.out.println("Your number is " + num);	
	}
	
	public void saySum(double num, double num2)
	{
	double sum = num + num2;
	System.out.println("The sum is " + sum);	
	}
	
	public double returnSquare(double num)
	{
	double square = num * num;
	return square;
	}
	
	public double returnArea(double length, double width)
	{
	return length * width;
	}
	
	public int roundUp(double num)
	{
	int answer = (int)Math.ceil(num);
	return answer;
	}
}
