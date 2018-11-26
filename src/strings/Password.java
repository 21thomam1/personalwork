package strings;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password:");
		String password = input.nextLine();
		System.out.println("Re enter password:");
		String password2 = input.nextLine();
		
		while(!password.equals(password2))	{
			System.out.println("Enter a password:");
			password = input.nextLine();
			System.out.println("Re enter password:");
			password2 = input.nextLine();
		}

	}

}
