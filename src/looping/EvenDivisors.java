package looping;

import java.util.Scanner;

public class EvenDivisors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		boolean cont = true;
		do	{
		System.out.println("Enter a number: ");
		int integer = input.nextInt();
		for (int divisor = integer; divisor > 0; divisor--) {
				if (integer % divisor == 0) {
					if (divisor % 2 == 0) {
						sum = sum + divisor;0
					}
				}
			}
			System.out.println("Sum of the even divisors is: " + sum);
			System.out.println("Continue (true/false):");
			cont = input.nextBoolean();
		} while (cont == true);
		
	}

}
