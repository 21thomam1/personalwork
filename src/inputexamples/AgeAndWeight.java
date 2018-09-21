package inputexamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double age = -9.0;
		Scanner input = new Scanner (System.in);
		System.out.println("How old are you?");
		age = input.nextDouble();
		System.out.println("You are " + age + " years old.");
		
		double weight = -9.0;
		System.out.println("How much do you weigh?");
		weight = input.nextDouble();
		System.out.println("You weigh " + weight + " pounds.");
	}

}
