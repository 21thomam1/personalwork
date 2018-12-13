package classdefinitions;

import java.util.Random;

public class PileOfJunk {
	private static int idNum = 1;
	private int min;
	private int max;
	private int id;
	private int randomNum;

	public PileOfJunk() {
		Random generator = new Random();
		min = 10;
		max = 100;
		id = idNum;
		idNum++;
		randomNum = min + generator.nextInt(max - min + 1);

	}

	public static int getSum(int numOne, int numTwo)	{
		int sum = numOne + numTwo;
		return sum;
	}
	
	public void setRandomNum(int randomNum)	{
		this.randomNum = randomNum;
	}
	
	public int getId()	{
		return id;
	}
	
	public int getRandomNum()	{
		return randomNum;
	}
}
