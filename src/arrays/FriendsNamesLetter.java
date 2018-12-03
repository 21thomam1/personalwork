package arrays;

import java.util.Scanner;

public class FriendsNamesLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String names[] = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.println("enter a name:");
			names[i] = input.nextLine();
		}

		System.out.println("enter a letter:");
		String userWord = input.nextLine();
		char userLetter = userWord.charAt(0);

		for (int i = 0; i < names.length; i++) {
			int namesLength = names[i].length();
			char lastLetter = names[i].charAt(namesLength - 1);

			if (lastLetter == userLetter) {
				System.out.println(names[i]);
			}

		}

	}

}
