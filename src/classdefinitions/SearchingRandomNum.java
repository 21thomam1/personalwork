package classdefinitions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SearchingRandomNum {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		for(int i = 0; i < 100; i++)	{
			int min = 0;
			int max = 499;
			int num = min + generator.nextInt(max - min + 1);
			nums.add(num);
		}
		
		System.out.println("enter a random number:");
		int find = input.nextInt();
		
		for(int i = 0; i < nums.size(); i++)	{
			if(nums.get(i) == find)	{
				total++;
			}
		}
		
		System.out.println(find + " was found " + total + " time(s)");
		

	}

}
