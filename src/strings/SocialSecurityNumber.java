package strings;
import java.util.Scanner;
public class SocialSecurityNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("social security number:");
		String ssn = input.nextLine();
		System.out.println("last 4 digits: " + ssn.substring(7));
		System.out.println("middle 2 digits: " + ssn.substring(4, 6));
		System.out.println("fist 3 digits: " + ssn.substring(0, 3));

	}

}
