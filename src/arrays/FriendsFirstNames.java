package arrays;

import java.util.Scanner;

public class FriendsFirstNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String names[] = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.println("enter a name:");
			names[i] = input.nextLine();
		}

		System.out.println("enter first name length:");
		int firstNameLength = input.nextInt();
		
		for (int i = 0; i < names.length; i++) {
			int firstName = names[i].indexOf(" ");
			if(firstNameLength == firstName)	{
				System.out.println(names[i]);
			}


		}
		

	

	}

}
