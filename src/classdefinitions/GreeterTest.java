package classdefinitions;
import java.util.Scanner;
import java.util.ArrayList;
public class GreeterTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> greeters = new ArrayList<Greeter>();
		System.out.println("number of greeters:");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++)	{
			greeters.add(new Greeter());
		}
		
		for(Greeter i : greeters)	{
			System.out.println(i.getAge());
		}
	}

}
