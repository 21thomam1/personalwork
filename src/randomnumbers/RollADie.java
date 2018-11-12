package randomnumbers;
import java.util.Random;
import java.util.Scanner;

public class RollADie {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("numbers of sides of a die:");
		int sides = input.nextInt();
		System.out.println("number of rolls:");
		int rolls = input.nextInt();
		int min = 1;
		int max = sides;
		
		for (int counter = 0; counter < rolls; counter ++){
			int randomNum = min + generator.nextInt(max - min + 1);
			System.out.println("you rolled a " + randomNum);
		}
		
		

	}

}
