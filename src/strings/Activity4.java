package strings;
import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a name:");
		String name1 = input.nextLine();
		System.out.println("enter another name:");
		String name2 = input.nextLine();
		if(name1.compareTo(name2) < 0)	{
			System.out.println(name1 + " is before " + name2);
		}
		if(name1.compareTo(name2) > 0)	{
			System.out.println(name2 + " is before " + name1);
		}
		if(name1.compareTo(name2) == 0)	{
			System.out.println(name2 + " and " + name1 + " are equal");
		}
	}

}
