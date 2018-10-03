package oop;
import java.util.Scanner;
public class Room {
Scanner input = new Scanner(System.in);
	public void area()
	{
		System.out.println("Length of Wall:");
		int length = input.nextInt();
		System.out.println("Height of Wall:");
		int height = input.nextInt();
		int area = length * height;
		System.out.println("Area of Wall: " + area);
	}
	public void areaWithDoor()
	{
		System.out.println("\nLength of Wall:");
		int length = input.nextInt();
		System.out.println("Height of Wall:");
		int height = input.nextInt();
		System.out.println("Length of Door:");
		int dlength = input.nextInt();
		System.out.println("Height of Door:");
		int dheight = input.nextInt();
		int area = length * height - dlength * dheight;
		System.out.println("Area of Wall Without Door: " + area);
	}
		
}
