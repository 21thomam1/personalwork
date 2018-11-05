package looping;
import java.util.Scanner;

public class HowManyNumbers {
	public static void main(String[] args) {
		int howMany = 0;
		int sum = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		
		do	{
			System.out.println("Enter a number:");
			number = input.nextInt();
			howMany ++;
			sum = sum + number;
			
		} while(sum <= 2018);

		System.out.println("It took " + howMany + " numbers to reach 2018");
	}

}
