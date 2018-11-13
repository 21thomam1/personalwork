package randomnumbers;
import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 0;
		int max = 1;
		int flip = 0;
		int heads = 0;
		//ihuiiuhiuhihiu
		
		for (int counter = 1; counter <= 100000; counter ++){
			int randomNum = min + generator.nextInt(max - min + 1);
			flip ++;
			if (randomNum == 0)	
				heads ++;
		}
		System.out.println("heads: " + heads);
		System.out.println("tails: " + (100000 - heads));
	}
}

