package multidimensionalarrays;

import java.util.Random;

public class RandomInt {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 0;
		int max = 100;
		int maxCol = 10;
		int maxRow = 24;
		int[][] tests = new int[maxRow][maxCol];
		
		for (int row = 0; row < tests.length; row++) {

			for (int column = 0; column < tests[0].length; column++) {
				int num = min + generator.nextInt(max - min + 1);
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}
