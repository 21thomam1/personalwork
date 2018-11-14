package strings;
import java.util.Scanner;
public class SocialSecurityNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("social security number:");
		String sentence = input.nextLine();

		for(int counter = sentence.length(); counter >= 0; counter --)	{
			System.out.println(sentence.charAt(counter));
		}

	}

}
