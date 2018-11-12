package randomnumbers;
import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 1;
		int max = 13;
		int multiples = 0;
		
		for (int counter = 0; counter < 87; counter ++){
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0)	
				multiples ++;
		}
		System.out.println("a multiple of 3 was rolled " + multiples + " times");

	}

}
