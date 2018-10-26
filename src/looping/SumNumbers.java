package looping;
import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		for(int counter = 1; counter <= 5; counter ++)	{
			System.out.println("enter a number:");
			int number = input.nextInt();
			sum += number;
		}
		System.out.println(sum);
	}

}
