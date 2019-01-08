package interfaces;

public class Cat implements Animal{
private String name;
private int age;
private boolean friendly;
	public Cat()	{
		name = "Bob";
		age = 1;
		friendly = false;
	}
	public void act()	{
		age+= 9;
		if(friendly == false)	{
			friendly = true;
		}
		if(friendly == true)	{
			friendly = false;
		}
	}
	public String toString()	{
		return "Cat object name: " + name + " age: " + age + " friendly: " + friendly;
	}
	public boolean returnFriendly()	{
		return friendly;
	}
}
