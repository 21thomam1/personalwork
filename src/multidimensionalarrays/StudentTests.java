package multidimensionalarrays;

import java.util.Scanner;

public class StudentTests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("number of students:");
		int students = input.nextInt();
		System.out.println("number of test taken:");
		int tests = input.nextInt();
		int[][]testScores = new int[students][tests];
		
		for(int row = 0; row < testScores.length; row++)	{
			for(int column = 0; column < testScores[0].length; column++)	{
				System.out.println("score:");
				testScores[row][column] = input.nextInt();
			}
		}
		
		for (int row = 0; row < testScores.length; row++) {
			for (int column = 0; column < testScores[0].length; column++) {
				System.out.print(testScores[row][column] + " ");
			}
			System.out.println();
		}
		

	}

}
