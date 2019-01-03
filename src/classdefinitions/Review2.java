package classdefinitions;
import java.util.Scanner;
public class Review2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[]names = new String[3];
		for(int i = 0; i < names.length; i++){
			System.out.println("enter a teacher name:");
			names[i] = input.nextLine();
		}
		
		for(int i = names.length -1; i >= 0; i--){
			int index = names[i].indexOf(" ") +1;
			char firstInitial = names[i].charAt(0);
			char lastInitial = names[i].charAt(index);
			System.out.println(firstInitial + "" + lastInitial);
		}
		

	}

}
