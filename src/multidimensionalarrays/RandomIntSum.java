package multidimensionalarrays;

import java.util.Random;

public class RandomIntSum {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 0;
		int max = 100;
		int sum = 0;
		int maxCol = 7;
		int maxRow = 3;
		int[][] tests = new int[maxRow][maxCol];

		for (int column = 0; column < tests[0].length; column++) {
			int num = min + generator.nextInt(max - min + 1);
			sum += tests[0] [column];
		}
		System.out.println("sum of elements in first row: " + sum);
	}

}