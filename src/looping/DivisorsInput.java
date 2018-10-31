package looping;
import java.util.Scanner;

public class DivisorsInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDivisors = 0;
		int largestNumber = 0;
		int largestDivisors = 0;
		System.out.println("Enter a number: ");
		int integer = input.nextInt();
		for (int number = 1; number <= integer; number ++)	{
		for (int divisor = number; divisor > 0; divisor --)	{
		if (number % divisor == 0)	{
			numDivisors ++;
		}
		}
		if (numDivisors > largestDivisors)	{
			largestDivisors = numDivisors;
			largestNumber = number;
		}
		numDivisors = 0;
		}
		System.out.println("Number with the most divisors between 0 and " + integer + " is: " + largestNumber);
	}

}