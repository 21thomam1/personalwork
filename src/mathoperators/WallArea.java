package mathoperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double length = 8.0;
	double width = -999.9;
	double wall = -999.0;
	Scanner input = new Scanner (System.in);
	System.out.println("How many feet wide is the wall?");
	width = input.nextDouble();
	wall = length * width;
	System.out.println("The area of the wall is " + wall + " square feet");
	}

}
