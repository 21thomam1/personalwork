package looping;
import java.util.Scanner;

public class NestedLoop3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int divisor = 0;
	System.out.println("enter a number:");
	int number = input.nextInt();
		
	System.out.println(number%number == 0);
	
	for(int j = 1; j <= number; j ++)	{
			if(60 % j == 0)	{
			divisor ++;
			}
		}
	}
}