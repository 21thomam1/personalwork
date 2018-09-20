package inputexamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberone = -999;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first number of your locker combination:");
		numberone = input.nextInt();
		int numbertwo = -999;
		System.out.println("Enter the second number of your locker combination:");
		numbertwo = input.nextInt();
		int numberthree = -999;
		System.out.println("Enter the third number of your locker combination");
		numberthree = input.nextInt();
		System.out.println("Your locker combination is " + numberone + " - " + numbertwo + " - " + numberthree);
		
	}

}
