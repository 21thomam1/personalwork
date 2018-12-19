package classdefinitions;

import java.util.ArrayList;
import java.util.Random;

public class SearchingRectangleWidth {

	public static void main(String[] args) {
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		Random generator = new Random();
		int total = 0;

		for(int i = 0; i < 100; i++){
			int length = generator.nextInt(499);
			int width = generator.nextInt(499);
			rectangles.add(new Rectangle(length, width));
		}
		
		for(int i = 0; i < rectangles.size(); i++)	{
			Rectangle oneRectangle = rectangles.get(i);
			if(oneRectangle.getWidth() == 10){
				total++;
			}
		}
		System.out.println("number of rectangles with a width of 10: " + total);
		
	}

}
