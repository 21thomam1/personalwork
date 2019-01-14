package inheritance;

public class BasketballTest {

	public static void main(String[] args) {
		Basketball bob = new Basketball();
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		Ball meg = new Basketball();
		System.out.println(meg.method1());
		System.out.println(meg.method2());
		Storage jim = new Storage();
		System.out.println(jim.method1());
		System.out.println(jim.method2());
		System.out.println(jim.method3());
		System.out.println(jim.method4());
		System.out.println(jim.method5());
		Box fred = new Box();
		System.out.println(fred.method1());
		System.out.println(fred.method2());
		System.out.println(fred.method3());
		System.out.println(fred.method5());
		
	}

}
