package oop;

public class TestGreeter {

	public static void main(String[] args) {
		Greeter megan = new Greeter();
		megan.sayHello();
		System.out.println(megan.getAge());
		megan.setAge(5);
		System.out.println(megan.getAge());
	}

}
