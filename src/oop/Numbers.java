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
}
