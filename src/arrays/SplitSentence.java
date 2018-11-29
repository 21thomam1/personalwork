package arrays;
import java.util.Scanner;
public class SplitSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sentence:");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		
		for(int i = 0; i < words.length; i++)	{
			System.out.println(words[i].charAt(0));
		}

	}

}
