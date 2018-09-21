package inputexamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double age = -999.0;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your age:");
		age = input.nextDouble() + 17;
		double number = -999.0;
		System.out.println("Enter your lucky number:");
		number = input.nextDouble() + 78;
		double pets = -999.0;
		System.out.println("Enter how many pets you have:");
		pets = input.nextDouble() + 2;
		System.out.println("In the future...");
		System.out.println("I see...");
		
		
		System.out.println(age + " years from now");
		System.out.println("You will have " + pets + " kids");
		System.out.println("And you will die in " + number + " years.");
	}
}
