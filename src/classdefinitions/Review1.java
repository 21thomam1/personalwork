package classdefinitions;

import java.util.Random;

public class Review1 {

	public static void main(String[] args) {
		Random generator = new Random();
		int min = 1;
		int max = 6;
		int[]rolls = new int[487];
		int odd = 0;
		
		for (int i = 0; i < rolls.length; i ++){
			int randomNum = min + generator.nextInt(max - min + 1);
			rolls[i] = randomNum;
		}
		
		
		for(int i = rolls.length -1; i >= 0; i--){
			System.out.println(rolls[i]);
			if(rolls[i] == 1 || rolls[i] == 3 || rolls[i] == 5)	{
				odd ++;
			}
		}
		System.out.println("percentage of rolls that are odd: " + (double)odd / rolls.length * 100 + "%");
	}
}

