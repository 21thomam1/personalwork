package randomnumbers;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		Random generator = new Random();
		int coin = 0;
		int heads = 0;
		double maxPercentage = 0;
		double minPercentage = 100;
		double headsPercentage = 0;

		for (int counter = 1; counter <= 100000; counter++) {
			heads = 0;
			for (int counter2 = 1; counter <= 1000000; counter++) {
				coin = generator.nextInt(1);
				if (coin == 0) {
					heads++;
				}
			}
			headsPercentage = ((heads * 1.0) / 1000000) * 100;
		}
		if (headsPercentage > maxPercentage) {
			maxPercentage = headsPercentage;
		}
		if (headsPercentage < minPercentage) {
			minPercentage = headsPercentage;
		}
		System.out.println(maxPercentage);
		System.out.println(minPercentage);
	}
}
