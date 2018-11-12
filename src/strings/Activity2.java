package strings;
import java.util.Scanner;
public class Activity2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("Bob is in the sentence: " + sentence.contains("Bob"));
		System.out.println("the sentence is: " + sentence);


	}

}
