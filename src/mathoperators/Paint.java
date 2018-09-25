package mathoperators;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double height = 8.0;
		double length = -999.9;
		double width = -999.9;
		double gallon = 150.0;
		double volume = -999.9;
		double actualvolume = -999.9;
		double totalgal = -999.9;
		
		System.out.println("The room is 8 feet tall.");
		System.out.println("Length of Room:");
		length = input.nextDouble();
		System.out.println("Width of Room:");
		width = input.nextDouble();
		
		actualvolume = length * width * height;
		volume = height * length + height * length + width * height + width * height;
		totalgal = volume / gallon;
		
		System.out.println("The room is " + actualvolume + " square feet.");
		System.out.println(volume + " square feet need to be painted.");
		System.out.println(totalgal + " gallons are needed to paint the room.");
	
	}

}
