package looping;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int num = 0;
		int end = 0;
		int sum = 0;
		int entered = 0;
		int largest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number. (9999) to quit");
		num = input.nextInt();
		while (num != 9999)	{
			if (num > largest)	{	
				largest = num;
			}
			sum = sum + num;
			num = num + 2;
			System.out.println(num);
			System.out.println("Please enter a number. (9999) to quit");
			num = input.nextInt();
			entered ++;
		}

		double avg = sum / entered;
		System.out.println("Average: " + avg);
		System.out.println("Largest: " + largest);
		System.out.println("Done.");
	}

}
