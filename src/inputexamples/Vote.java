package inputexamples;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vote = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Did you vote?");
		vote = input.nextBoolean();
		System.out.println("You said " + vote);
		
	}

}
