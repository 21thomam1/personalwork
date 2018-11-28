package arrays;

import java.util.Random;

public class RectangleActivity {

	public static void main(String[] args) {
		Random generator = new Random();
		Rectangle[] numRectangles = new Rectangle[100];
		int min = 10;
		int max = 56;
		int smallestArea = 99999;
		int smallestIndex = 0;

		for (int i = 0; i < numRectangles.length; i++) {
			int xLength = min + generator.nextInt(max - min + 1);
			int xWidth = min + generator.nextInt(max - min + 1);
			numRectangles[i] = new Rectangle();
			numRectangles[i].setLength(xLength);
			numRectangles[i].setWidth(xWidth);
			System.out.println(xLength + " x " + xWidth);
			System.out.println("area: " + numRectangles[i].area());
			System.out.println();

			if (numRectangles[i].area() < smallestArea) {
				smallestArea = numRectangles[i].area();
				smallestIndex = i;
				
			}
		}
		System.out.println("smallest area: " + smallestArea);
		System.out.println("index: " + smallestIndex);
	}

}
