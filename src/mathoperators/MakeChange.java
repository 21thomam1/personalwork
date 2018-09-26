package mathoperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int change = -999;
		int makechange = -999;
		int remainder = -999;
		int remainder2 = -999;
		int remainder3 = -999;
		int remainder4 = -999;
		int dollars = -999;
		int quarters = -999;
		int dimes = -999;
		int nickels = -999;
		int pennies = -999;
		
		System.out.println("How many cents should I make change for?");
		makechange = input.nextInt();
		
		dollars = makechange / 100;
		remainder = makechange % 100;
		quarters = remainder / 25;
		remainder2 = remainder % 25;
		dimes = remainder2 / 10;
		remainder3 = remainder2 % 10;
		nickels = remainder3 / 5;
		remainder4 = remainder3 % 5;
		pennies = remainder4;
		
		System.out.println("You want to break down " + makechange + " cents.");
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
		input.close();
	}

}
