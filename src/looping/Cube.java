package looping;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number (-1 to quit): ");
		int num = input.nextInt();
		while(num != -1)	{
			System.out.println(num * num);
			System.out.println("Enter a number (-1 to quit): ");
			num = input.nextInt();
		}

	}

}
