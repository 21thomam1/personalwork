package classdefinitions;
import java.util.Scanner;
public class PileOfJunkTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PileOfJunk bob = new PileOfJunk();
		System.out.println("random number: " + bob.getRandomNum());
		System.out.println("set random number to:");
		int randomNum = input.nextInt();
		bob.setRandomNum(randomNum);
		System.out.println("one number:");
		int numOne = input.nextInt();
		System.out.println("another one:");
		int numTwo = input.nextInt();
		System.out.println("sum of the two numbers: " + bob.getSum(numOne, numTwo));
		System.out.println("id number: " + bob.getId());
		System.out.println("new random number: " + bob.getRandomNum());
		
		System.out.println();
		PileOfJunk bobjr = new PileOfJunk();
		System.out.println("random number: " + bobjr.getRandomNum());
		System.out.println("set random number to:");
		randomNum = input.nextInt();
		bobjr.setRandomNum(randomNum);
		System.out.println("one number:");
		numOne = input.nextInt();
		System.out.println("another one:");
		numTwo = input.nextInt();
		System.out.println("sum of the two numbers: " + bobjr.getSum(numOne, numTwo));
		System.out.println("id number: " + bobjr.getId());
		System.out.println("new random number: " + bobjr.getRandomNum());
		
		

	}

}
