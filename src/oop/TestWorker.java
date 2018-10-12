package oop;

public class TestWorker {

	public static void main(String[] args) {
		
		Worker bob = new Worker();
		System.out.println("hours worked: " + bob.getWork());
		System.out.println("rate of pay: " + bob.getPay());
		System.out.println("paycheck: " + bob.payCheck());
		System.out.println("rate of pay after raise: " + bob.raise(1));
		
		bob.setWork(40);
		bob.setPay(2.00);
		System.out.println("hours worked: " + bob.getWork());
		System.out.println("rate of pay: " + bob.getPay());
		System.out.println("paycheck: " + bob.payCheck());
		System.out.println("rate of pay after raise: " + bob.raise(5));

	}

}
