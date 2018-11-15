package strings;

public class EssayTest {

	public static void main(String[] args) {
		Essay bob = new Essay();
		bob.setName("Bob", "the Builder");
		bob.setText("Can we build it? Yes we can!!");
		System.out.println("number of characters in first name: " + bob.getFirstName());
		System.out.println("last name in all caps: " + bob.getLastName());
		System.out.println("author has 'X' in his/her name: " + bob.getX());
		System.out.println("word count: " + bob.getWordCount());
		
		

	}

}
