package multidimensionalarrays;

import java.util.Scanner;
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 1;
		System.out.println("number of students:");
		int students = input.nextInt();
		System.out.println("number of sides on a die:");
		int max = input.nextInt();
		System.out.println("number of rolls:");
		int rolls = input.nextInt();
		int[][] studentRollResults = new int[students][rolls];
		
		for (int column = 0; column < studentRollResults[0].length; column++) {
			int num = min + generator.nextInt(max - min + 1);
			System.out.print(num + " ");
		}

	}

}
