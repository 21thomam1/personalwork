package classdefinitions;

public class CircleTest {

	public static void main(String[] args) {
		Circle bob = new Circle(45);
		Circle otherCircle = new Circle(44);
		System.out.println(bob.toString());
		System.out.println(bob.equals(otherCircle));
		System.out.println(bob.clone());

	}

}
