package looping;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		int largest =0;
		int smallest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num = input.nextInt();
		largest = num;
		smallest = num;
		do {
			
			if (num>largest)	{
				largest = num;
			}
			if (num<smallest)	{
				smallest = num;
			}
			System.out.println("Please enter a number.");
			num = input.nextInt();
			
		} while(num != 9999);
		System.out.println(largest - smallest);

	}

}
