package classdefinitions;

public class BookTest {

	public static void main(String[] args) {
		Book bob = new Book(-44, "hello");
		System.out.println(bob.toString());
		Book otherBook = new Book(0, "hello");
		System.out.println(bob.equals(otherBook));
		System.out.println(bob.clone());

	}

}
