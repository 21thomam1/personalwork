package oop;
import java.util.Scanner;
public class Car {
Scanner input = new Scanner(System.in);
	public Car()
	{}
		public void sayOdometer()
	{
			int miles = -999;
			System.out.println("How many miles are on the car?");
			miles = input.nextInt();
			System.out.println("There are " + miles + " miles on the car.");
	}
		public void sayFlat()
	{
			System.out.println("There is a flat tire.");
	}
		public void sayGas()
		{
			System.out.println("The car is out of gas.");
		}
}
