package interfaces;

public class Dog implements Animal{
private String name;
private int age;
private boolean injured;
	public Dog()	{
		name = "Fido";
		age = 1;
		injured = false;
	}
	public void act()	{
		injured = false;
		age+=7;
	}
	public String toString()	{
		return "Dog object name: " + name + " age: " + age + " injured: " + injured;
	}
	public void vet()	{
		if(injured == true)	{
			injured = false;
		}
	}
}
