package strings;

import java.util.Scanner;

public class SentenceWithoutSpacesAndA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a sentence:");
		String sentence = input.nextLine();

		for (int counter = 0; counter < sentence.length(); counter++) {
			if (sentence.charAt(counter) != ' ' && sentence.charAt(counter) != 'a') {
				System.out.print(sentence.charAt(counter));
			}

		}
		System.out.println();
		System.out.println("original sentence: " + sentence);
	}

}