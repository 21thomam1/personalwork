package arrays;

import java.util.Scanner;

public class Store25000TestScores {

	public static void main(String[] args) {
		int[] scores = new int[5];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for (int counter = 0; counter < 5; counter++) {
			System.out.println("enter a score:");
			scores[counter] = input.nextInt();
			sum = sum + scores[counter];
		}

		for (int counter = 4; counter >= 0; counter--) {
			System.out.println(scores[counter]);
		}

	}

}