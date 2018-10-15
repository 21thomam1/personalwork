package oop;

public class TestNumbers {

	public static void main(String[] args) {
	Numbers num = new Numbers();
	num.sayNumber(7.5);
	num.sayNumberPlus2(7.5);
	num.saySum(2,3);
	num.returnSquare(3.0);
	double thing1 = num.returnSquare(3.0);
	System.out.println(thing1);
	num.returnArea(2.0, 4.0);
	double thing2 = num.returnArea(2.0, 4.0);
	System.out.println(thing2);

	}

}
