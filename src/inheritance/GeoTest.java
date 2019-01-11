package inheritance;
import java.util.ArrayList;
public class GeoTest {

	public static void main(String[] args) {
		ArrayList<Geo> shapes = new ArrayList<Geo>();
		shapes.add(new Rectangle());
		shapes.add(new Trapezoid());
		shapes.add(new Rectangle());
		shapes.add(new Trapezoid());
		shapes.add(new Rectangle());
		shapes.add(new Trapezoid());

	}

}
