package strings;
import java.util.Scanner;
public class ToLowerCaseExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a sentece:");
		String sentence = input.nextLine();
		System.out.println("the sentence in all lowercase letters is: " + sentence.toLowerCase());

	}

}
