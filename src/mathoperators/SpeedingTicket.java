package mathoperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int limit = -999;
		int driver = -999;
		int fine = -999;
		int over = -999;
		final int FINESTART = 55;
		System.out.println("Speed Limit:");
		limit = input.nextInt();
		System.out.println("Speed of Driver:");
		driver = input.nextInt();
		
		over = driver - limit;
		fine = over * 40 + FINESTART - 40;
		
		System.out.println("Speed Limit: " + limit);
		System.out.println("Speed of Driver: " + driver);
		System.out.println("Cost of Ticket: " + fine);
		
	}

}
