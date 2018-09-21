package inputexamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberone = -999;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a one digit number:");
		numberone = input.nextInt();
		int numbertwo = -999;
		System.out.println("Enter another one digit number:");
		numbertwo = input.nextInt();
		int numberthree = -999;
		System.out.println("Enter a third one digit number:");
		numberthree = input.nextInt();
		
		System.out.println("Your password could be: " + numberone + numbertwo + numberthree);
		System.out.println("Or " + numberone + numberthree + numbertwo);
		System.out.println("Or " + numbertwo + numberone + numberthree);
		System.out.println("Or " + numbertwo + numberthree + numberone);
		System.out.println("Or " + numberthree + numbertwo + numberone);
		System.out.println("Or " + numberthree + numberone + numbertwo);
	}

}
