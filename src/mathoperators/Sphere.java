package mathoperators;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		double volume = -999.9;
		double radius = -999.9;
		double radiuscubed = -999.9;
		System.out.println("Radius:");
		radius = input.nextDouble();

		radiuscubed = radius * radius * radius;
		volume = 4.0 / 3.0 * Math.PI * radiuscubed;
		System.out.println("The volume of the sphere is " + volume);

	}

}
