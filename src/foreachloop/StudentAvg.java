package foreachloop;
import java.util.Scanner;

public class StudentAvg {

	public static void main(String[] args) {
		int[] ages = new int[20];
		Scanner input = new Scanner(System.in);
		int total = 0;
	
		for(int i : ages)	{
			System.out.println("age:");
			int age = input.nextInt();
			total += age;
		}

		double avg = (double) total / 20.0;
		System.out.println("avg age: " + avg);
		

	}

}
