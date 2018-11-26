package strings;
import java.util.Scanner;
public class EveryFourthCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a sentence:");
		String sentence = input.nextLine();
		
		for(int counter = 0; counter < sentence.length(); counter += 4)	{
			System.out.println(sentence.charAt(counter));
		
		}

	}

}
