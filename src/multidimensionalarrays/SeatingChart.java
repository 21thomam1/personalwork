package multidimensionalarrays;
import java.util.Scanner;

public class SeatingChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("number of students (must be multiple of 4)");
		int students = input.nextInt();
		String[][] seatingChart = new String[students][4];
		
		for(int row = 0; row < seatingChart.length; row++)	{
			for(int column = 0; column < seatingChart[0].length; column++)	{
				System.out.println("name of student:");
				seatingChart[row][column] = input.nextLine();
				
			}
		}

	}

}
