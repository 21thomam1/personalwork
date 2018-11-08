package randomnumbers;
import java.util.Scanner;
import java.util.Random;

public class RollADie2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 1;
		int max = 6;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		int avg4 = 0;
		int avg5 = 0;
		int avg6 = 0;
		int sum = 0;
		System.out.println("number of rolls:");
		int rolls = input.nextInt();
		
		for (int counter = 0; counter < rolls; counter ++)	{
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1)	{
				one ++;
			}
			if (randomNum == 2)	{
				two ++;
			}
			if (randomNum == 3)	{
				three ++;
			}
			if (randomNum == 4)	{
				four ++;
			}
			if (randomNum == 5)	{
				five ++;
			}
			if (randomNum == 6)	{
				six ++;
			}
			sum = one + two + three + four + five + six;
			if (one == 0)	{
				avg1 = 0;
			}
			if (two == 0)	{
				avg2 = 0;
			}
			if (three == 0)	{
				avg3 = 0;
			}
			if (four == 0)	{
				avg4 = 0;
			}
			if (five == 0)	{
				avg5 = 0;
			}
			if (six == 0)	{
				avg6 = 0;
			}
			if (one != 0){
			avg1 = sum / one;
	
			}
			}
			if (two != 0){
			avg2 = sum / two;
	
			}
			if (three != 0){
			avg3 = sum / three;
	
			}
			if (four != 0){
			avg4 = sum / four;
	
			}
			if (five != 0){
			avg5 = sum / five;
	
			}
			if (six != 0){
			avg6 = sum / six;
	
			}
		System.out.println("Number of Rolls");
		System.out.println("1: " + one);
		System.out.println("2: " + two);
		System.out.println("3: " + three);
		System.out.println("4: " + four);
		System.out.println("5: " + five);
		System.out.println("6: " + six);
		System.out.println("Average of Rolls");
		System.out.println("1: " + avg1 + "%");
		System.out.println("2: " + avg2 + "%");
		System.out.println("3: " + avg3 + "%");
		System.out.println("4: " + avg4 + "%");
		System.out.println("5: " + avg5 + "%");
		System.out.println("6: " + avg6 + "%");
	}

}