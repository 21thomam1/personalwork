package mathoperators;
import java.util.Scanner;
public class VolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		double length = -999;
		double width = -999;
		double height = -999;
		double volume = -999;
		System.out.println("Length:");
		length = input.nextDouble();
		System.out.println("Width:");
		width = input.nextDouble();
		System.out.println("Height:");
		height = input.nextDouble();
		volume = length * width * height;
		System.out.println("The box is " + volume + " units cubed.");

	}

}
