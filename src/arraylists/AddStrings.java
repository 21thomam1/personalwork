package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStrings {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		names.add("mollie");
		names.add("hannah");
		names.add("megan");
		names.add("bob");
		names.add("jane");
		names.add(0, "billy");
		System.out.println("enter your name:");
		names.add(input.nextLine());
		
		

	}

}
