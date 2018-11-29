package arrays;

import java.util.Scanner;
import java.util.Random;

public class SplitSentenceRandomWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("sentence:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int max = words.length - 1;
		int min = 0;
		int randomWord = generator.nextInt(max - min + 1);

		System.out.println(words[randomWord]);
	}

}