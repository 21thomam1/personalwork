package mathoperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int dividend = -999;
		int divisor = -999;
		int remainder = -999;
		int answer = -999;
		System.out.println("Dividend:");
		dividend = input.nextInt();
		System.out.println("Divisor:");
		divisor = input.nextInt();

		answer = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("The answer is " + answer + "r" + remainder);

	}

}
