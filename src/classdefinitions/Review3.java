package classdefinitions;
import java.util.Random;
import java.util.Scanner;

public class Review3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int[][] scores = new int[5][7];
		int high = 0;
		int total = 0;

		for (int column = 0; column < scores.length; column++) {
			for (int row = 0; row < scores[0].length; row++) {
				System.out.println("score:");
				scores[column][row] = input.nextInt();
				total+= scores[column][row];
				if(scores[column][row] > 150)	{
					high++;
				}
			}
		}
		
		System.out.println("number of studetns who scored over 150 points: " + high);
		System.out.println("avg: " + (double)total/35);
	}

}
