package desicions;
import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int insurance = 200;
		System.out.println("Enter your age:");
		int age = input.nextInt();
		
		if (age>75)	{
			
			insurance += 125;
		}
		
		if (age<30)	{
			
			insurance += -25;
		}

		
		System.out.println("Enter your weight:");
		double weight = input.nextDouble();
		
		if (weight>700)	{
			
			insurance += 300;
		}
		
		System.out.println("Do you smoke?");
		boolean smoke = input.nextBoolean();
		
		if (smoke == true)	{
			
			insurance += 50;
		}
		
		else	{
			
			insurance += -40;
		}
		
		System.out.println("The cost of insurance is: $" + insurance);
		
	}

}
