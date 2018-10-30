package looping;
import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest = -9999;
		int smallest = 9999;
		System.out.println("Enter a test score:");
		int score = input.nextInt();
		
		while (score != 9999)	{
			
			if(score > largest)	{
				largest = score;
			}
			if(score < smallest)	{
				smallest = score;
			}
			System.out.println("Enter a test score (9999 to quit): ");
			score = input.nextInt();
		}
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}

}
