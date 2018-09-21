package mathoperators;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = -999;
		int vote = 18;
		Scanner input = new Scanner (System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		vote = vote - age;
		System.out.println("You will be able to vote in " + vote + " years.");
	}

}
