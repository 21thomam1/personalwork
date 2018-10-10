package oop;

public class TestCircle {

	public static void main(String[] args) {
		Circle ball = new Circle();
		System.out.println("ball radius: " + ball.getRadius());
		System.out.println("ball circumferece: " + ball.circumference());
		System.out.println("ball area: " + ball.area());
		ball.setRadius(7.2);
		System.out.println("ball radius: " + ball.getRadius());
		
		ball = new Circle(12.25);
		System.out.println("ball radius: " + ball.getRadius());
		System.out.println("ball circumferece: " + ball.circumference());
		System.out.println("ball area: " + ball.area());
		ball.setRadius(7.2);
		System.out.println("ball radius: " + ball.getRadius());
	}

}
