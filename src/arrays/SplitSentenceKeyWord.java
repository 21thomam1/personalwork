package arrays;

import java.util.Scanner;

public class SplitSentenceKeyWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sentence:");
		String sentence = input.nextLine();
		System.out.println("key word:");
		String keyWord = input.nextLine();
		String[] words = sentence.split(" ");
		int times = 0;

		for(int i = 0; i < words.length; i++)	{
			if(words[i].compareTo(keyWord) == 0)	{
				times++;
			}
		}
		
		System.out.println(keyWord + " appeared " + times + " time(s)");
	}

}