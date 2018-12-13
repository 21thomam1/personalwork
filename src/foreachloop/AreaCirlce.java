package foreachloop;
import java.util.Scanner;
import java.util.ArrayList;
public class AreaCirlce {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Circle> radii = new ArrayList<Circle>();
		
		for(int i = 0; i < 10; i++){
			System.out.println("radius of circle");
			double radius = input.nextInt();
			radii.add(new Circle(radius));
		}
		
		for(Circle i : radii){
			System.out.println(i.area());
		}

	}

}
