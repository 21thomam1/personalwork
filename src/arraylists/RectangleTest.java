package arraylists;

import java.util.ArrayList;
import java.util.Random;

public class RectangleTest {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();

		for (int i = 0; i < 400; i++) {
			boxes.add(new Rectangle (50 + generator.nextInt(20), 50 + generator.nextInt(20)));
		}
		
		Rectangle removed = boxes.remove(generator.nextInt(boxes.size()));
		Rectangle last = boxes.remove(boxes.size()-1);
		boxes.set(0, last);
		
		for (int i = boxes.size()-1; i > 0; i--) {
			Rectangle oneBox = boxes.get(i);
			System.out.println(oneBox.area());
		}
		System.out.println();
		System.out.println("length of removed rectangle: " + removed.getLength());
		
	}

}