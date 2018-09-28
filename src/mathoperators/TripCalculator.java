package mathoperators;
import java.util.Scanner;
public class TripCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double distance = -999.99;
		double mpg = -999.99;
		double cost = -999.99;
		double total = -999.99;
		double avg = -999.99;
		System.out.println("Distance of Trip:");
		distance = input.nextDouble();
		System.out.println("Miles Per Gallon:");
		mpg = input.nextDouble();
		System.out.println("Total Amount of Money Spent on Gas:");
		cost = input.nextDouble();
		
		total = distance + mpg + cost;
		avg = total / 3;
		
		System.out.println("Distance of Trip: " + distance);
		System.out.println("Miles Per Gallon: " + mpg);
		System.out.println("Total Amount of Money Spent on Gas: " + cost);
		System.out.println("Average: " + avg);
		
	}

}
