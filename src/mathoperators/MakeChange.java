package mathoperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double change = -999.9;
		double makechange = -999.9;
		double dollars = -999.9;
		double quarters = -999.9;
		double dimes = -999.9;
		double nickels = -999.9;
		double pennies = -999.9;
		
		System.out.println("What should I make change for?");
		makechange = input.nextDouble();
		
		dollars = (int)makechange;
		quarters = makechange / 4;
		
		System.out.println("You want to break down $" + makechange);
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		
		input.close();
	}

}
