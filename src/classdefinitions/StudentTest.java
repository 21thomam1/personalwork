package classdefinitions;

public class StudentTest {

	public static void main(String[] args) {
		Student bob = new Student("bob");
		Student oneStudent = new Student("bob");
		bob.addScore("100");
		bob.addScore("10");
		bob.addScore("100");
		bob.addScore("100");
		bob.addScore("100");
		System.out.println(bob.average());
		System.out.println(bob.lowestScore());
		System.out.println(bob.toString());
		System.out.println(bob.equals(oneStudent));
		System.out.println(bob.clone());

	}

}
