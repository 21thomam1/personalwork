package foreachloop;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeWage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("number of emplyees:");
		int numEmployees = input.nextInt();
		double highest = 0;
		ArrayList<Double> wages = new ArrayList<Double>();
		
		for(int i = 0; i < numEmployees; i++)	{
			System.out.println("wage:");
			double wage = input.nextDouble();
			wages.add(wage);
		}

		for(double i : wages)	{
			if(i > highest)	{
				highest = i;
			}
		}
		System.out.println(highest);
	}

}
