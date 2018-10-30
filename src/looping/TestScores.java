package looping;
import java.util.Scanner;

public class TestScores {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a test score:");
		int score = input.nextInt();
		
		while(score != 9999)	{
			number ++;
			sum = sum + score;
			avg = sum / number;
			System.out.println("Enter a test score:");
			score = input.nextInt();
		}
		System.out.println("Sum of test scores: " + sum);
		System.out.println("Average of test scores: " + avg);
	}

}
