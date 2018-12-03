package arrays;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
		for(int counter = 0; counter < 5; counter ++)	{
		System.out.println("enter a score:");
		scores[counter] = input.nextInt();
		}
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

	}

}
