package looping;
import java.util.Scanner;

public class CountBy5 {
	public static void main(String[] args) {
		int total = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		System.out.println("The multiples of 5 less than " + num + " are: ");
			
			while(total <= num)	{
				System.out.print(total + " ");
				total = total + 5;
				
			}

	}

}
