package looping;

import java.util.Scanner;

public class HelloFavorite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Favorite Number:");
		int fav = input.nextInt();
		
		for(int counter = 1; counter <= 10; counter ++)	{
			System.out.println(fav + " Hello");
		}

	}

}
