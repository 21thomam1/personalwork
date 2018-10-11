package oop;

public class TestCat {

	public static void main(String[] args) {
		
		Cat max = new Cat();
		System.out.println("cat sleep: " + max.getSleep());
		System.out.println("cat age: " + max.getAge());
		System.out.println("cat birthday: " + max.birthday());
		System.out.println("cat sleep more: " + max.sleepMore());
		System.out.println("cat sleep less: " + max.sleepLess());
		
	}
}
