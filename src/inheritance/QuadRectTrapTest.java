package inheritance;

public class QuadRectTrapTest {

	public static void main(String[] args) {
		Quadrilateral quad1 = new Quadrilateral();
		Quadrilateral quad2 = new Quadrilateral();
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		Trapezoid trap1 = new Trapezoid();
		Trapezoid trap2 = new Trapezoid();
		System.out.println(quad1.perimeter());
		System.out.println(quad2.perimeter());
		System.out.println(rect1.perimeter());
		System.out.println(rect1.area());
		System.out.println(rect2.perimeter());
		System.out.println(rect2.area());
		System.out.println(trap1.perimeter());
		System.out.println(trap1.area());
		System.out.println(trap2.perimeter());
		System.out.println(trap2.area());

	}

}
