package mathoperators;
import java.util.Scanner;
public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int ageone = -999;
		int agetwo = -999;
		int agethree = -999;
		int ages = -999;
		System.out.println("How old is friend one?");
		ageone = input.nextInt();
		System.out.println("How old is friend two?");
		agetwo = input.nextInt();
		System.out.println("How old is friend three?");
		agethree = input.nextInt();
		ages = ageone + agetwo + agethree;
		System.out.println("You are a combined " + ages + " years old.");
			
	}

}
