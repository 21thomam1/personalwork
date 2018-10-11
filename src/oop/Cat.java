package oop;

public class Cat {

private double age;
private double sleep;
	
	public Cat()
	{
		age = 1;
		sleep = 1;
	}
	
	public void setAge(double newAge)
	{
		age = newAge;
	}
	
	public void setSleep(double newSleep)
	{
		sleep = newSleep;
	}
	
	public double getAge()
	{
		return age;
	}
	
	public double getSleep()
	{
		return sleep;
	}
	
	public double sleepMore()
	{
		return sleep + 1;
	}
	
	public double sleepLess()
	{
		return sleep - 1;
	}
	
	public double birthday()
	{
		return age + 1;
	}
}
