package inputexamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double monkey = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of an adult monkey?");
		monkey = input.nextDouble();
		System.out.println("The height is " + monkey);
		
	}

}
