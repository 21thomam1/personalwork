package arrays;

import java.util.Scanner;

public class LongAndShortNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("number of people:");
		int numPeople = input.nextInt();
		String[] names = new String[numPeople];
		int longestName = 0;
		int shortestName = 9999;
		
		for(int i = 0; i < names.length; i++)	{
			System.out.println("name:");
			names[i] = input.nextLine();
		}
		
		for(int i = 0; i < names.length; i++){
			if(names[i].length() > longestName)	{
				longestName = names[i].length();
			}
			if(names[i].length() < shortestName)	{
				shortestName = names[i].length();
			}
			System.out.println(names[i]);
		}
		int range = longestName - shortestName;
		System.out.println("longest name: " + longestName);
		System.out.println("shortest name: " + shortestName);
		System.out.println("range: " + range);
		

	}

}
