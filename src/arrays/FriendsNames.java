package arrays;

import java.util.Scanner;

public class FriendsNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[20];
		
		for(int i = 0; i < names.length; i ++)	{
			System.out.println("enter a name:");
			names[i] = input.nextLine();
		}
		
		for(int i = names.length - 1 ; i >= 0; i --){
			System.out.println(names[i]);
		}

	}

}
