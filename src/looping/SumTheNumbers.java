package looping;
import java.util.Scanner;

public class SumTheNumbers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = input.nextInt();
		
		do {
			
			System.out.println("Please enter a number: ");
			int num2 = input.nextInt();
			System.out.println("Sum is: " + (num1 + num2));
			System.out.println("Please enter a number. (999) to quit");
			num1 = input.nextInt();

		
		} while(num1 != 999);

		System.out.println("end.");
	}

}
