package desicions;
import java.util.Scanner;

public class PostIt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int postItInches = 3*3;
		System.out.println("Enter the length of the rectangle:");
		double l = input.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		double w = input.nextDouble();
		System.out.println("Were the dimensions in inches?");
		boolean measurement = input.nextBoolean();
		
		if (measurement==false)	{
			
			l *= 12;
			w *= 12;
			
		}
		
		double surfaceArea = l*w;
		double finalNumber = surfaceArea/postItInches;
		System.out.println(finalNumber);
		
	}

}
