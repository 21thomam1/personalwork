package oop;

public class TestEmployee {

	public static void main(String[] args) {
		Employee bob = new Employee();
		System.out.println(bob.getWage());
		bob.setWage(0.01);
		System.out.println(bob.getWage());
		System.out.println(bob.getExperience());
		bob.setExperience(4);
		System.out.println(bob.getExperience());

	}

}
