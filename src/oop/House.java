package oop;
import java.util.Scanner;
public class House
{
Scanner input = new Scanner(System.in);
	
	public void House()
	{
		System.out.println("Length:");
		int length = input.nextInt();
		System.out.println("Height:");
		int height = input.nextInt();
		int min60 = 200;
		
		int area = length * height;
		int time = area / min60;
		
		System.out.println("Total Minues to Paint Wall: " + time);
	}

}
