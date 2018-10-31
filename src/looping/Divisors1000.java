package looping;
import java.util.Scanner;

public class Divisors1000 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDivisors = 0;
		int largestNumber = 0;
		int largestDivisors = 0;
		System.out.println("The number with the most divisors between 1-1000 is...");
		for (int number = 1; number <= 1000; number ++)	{
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
		System.out.println("Number with the most divisors: " + largestNumber);
	}

}
