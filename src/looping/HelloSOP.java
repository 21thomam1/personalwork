package looping;
import java.util.Scanner;

public class HelloSOP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How may?");
		int number = 0;
		if (number>=0)	{
		number = input.nextInt();
		}
		else	{
		number = 0;
		}
		
		for(int counter = 1; counter <= number; counter ++)	{
			System.out.println(counter + " Hello");
		}

	}

}
