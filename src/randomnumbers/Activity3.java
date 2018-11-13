package randomnumbers;
import java.util.Random;

public class Activity3 {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 26;
		int max = 43;
		int tall = 0;
		
		for (int counter = 0; counter < 248; counter ++){
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > 36)
				tall ++;
		}
		System.out.println(tall + " first graders were more than 3 feet tall");
	}

}
