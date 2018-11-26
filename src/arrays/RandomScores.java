package arrays;

import java.util.Random;

public class RandomScores {

	public static void main(String[] args) {
		Random generator = new Random();
		int[] scores = new int[250];
		int min = 0;
		int max = 1000;
		int largestScore = 0;

		for (int counter = 0; counter < 250; counter++) {
			int num = min + generator.nextInt(max - min + 1);
			scores[counter] = num;
			if (scores[counter] > largestScore) {
				largestScore = scores[counter];
			}

		}
		System.out.println(largestScore);
	}
}