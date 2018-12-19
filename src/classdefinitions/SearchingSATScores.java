package classdefinitions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SearchingSATScores {

	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		boolean there = false;
		
		for(int i = 0; i < 100; i++)	{
			int min = 400;
			int max = 1600;
			int score = min + generator.nextInt(max - min + 1);
			scores.add(score);
		}
		
		System.out.println("enter a SAT score:");
		int find = input.nextInt();
		
		for(int i = 0; i < scores.size(); i++)	{
			if(scores.get(i) == find)	{
				there = true;
				System.out.println("score: " + scores.get(i));
			}
		}
		
		System.out.println("is score in the list: " + there);
		

	}

}
