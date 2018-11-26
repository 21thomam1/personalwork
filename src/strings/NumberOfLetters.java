package strings;
import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		int vowel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		
		for(int counter = 0; counter < sentence.length(); counter ++)	{
			if(sentence.charAt(counter) == 'a' || sentence.charAt(counter) == 'e' || sentence.charAt(counter) == 'i' || sentence.charAt(counter) == 'o' || sentence.charAt(counter) == 'u' || sentence.charAt(counter) == 'y')	{
				vowel ++;
			}
			
		}
		System.out.println("vowels: " + vowel);
	}

}
