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

		for (int i = boxes.size()-1; i > 0; i--) {
			Rectangle oneBox = boxes.get(i);
			System.out.println(oneBox.area());
		}

	}

}