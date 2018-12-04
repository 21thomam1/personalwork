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
		int[][] rollDice = new int[students][rolls];
		
		for (int row = 0; row < rollDice.length; row++) {
			for (int column = 0; column < rollDice[0].length; column++) {
				int num = min + generator.nextInt(max - min + 1);
				rollDice[row][column] = num;
			}
		}
		for (int row = 0; row < rollDice.length; row++) {
			for (int column = 0; column < rollDice[0].length; column++) {
				System.out.print(rollDice[row][column] + " ");
			}
			System.out.println();
		}

	}

}
