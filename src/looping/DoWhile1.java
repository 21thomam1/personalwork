package looping;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		num = input.nextInt();
		do {
		
			System.out.println("Magic prouct in: " + num * 17);
			System.out.println("Please enter a number. (9999) to quit");
			num = input.nextInt();
		
		} while(num != 9999);


	}

}
