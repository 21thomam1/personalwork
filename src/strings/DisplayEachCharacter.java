package strings;

public class DisplayEachCharacter {

	public static void main(String[] args) {
		String word = "Hello World";
		
		for(int counter = 0; counter < word.length(); counter ++)	{
			System.out.println(word.charAt(counter));
		}

	}

}
