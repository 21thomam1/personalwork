package multidimensionalarrays;

import java.util.Random;

public class FriendsAges {

	public static void main(String[] args) {
		Random generator = new Random();
		Friend[][] friends = new Friend[18][5];

		for (int row = 0; row < friends.length; row++) {
			for (int column = 0; column < friends[0].length; column++) {
				int a = generator.nextInt(51);
				friends[row][column] = new Friend("",a);
			}
		}
		for (int row = 0; row < friends.length; row++) {
			for (int column = 0; column < friends[0].length; column++) {
				System.out.print(friends[row][column].getAge() + " ");
			}
			System.out.println();
		}
	}
}