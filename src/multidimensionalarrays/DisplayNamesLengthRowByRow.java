package multidimensionalarrays;

import java.util.Scanner;

public class DisplayNamesLengthRowByRow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][3];

		for (int row = 0; row < names.length; row++) {
			for (int column = 0; column < names[0].length; column++) {
				System.out.print("name:");
				String friendName = input.nextLine();
				names[row][column] = friendName;
			}
		}
		for (int row = 0; row < names.length; row++) {
			for (int column = 0; column < names[0].length; column++) {
				System.out.print(names[row][column].length() + " ");
			}
			System.out.println();
		}
	}
}
