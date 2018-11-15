package strings;

public class Essay {
	String nameFirst;
	String nameLast;
	String text;
	boolean x;
	int wordCount;

	public Essay() {
		nameFirst = "Megan";
		nameLast = "Thomas";
		text = "hi";
		x = true;
		wordCount = 0;

	}

	public void setName(String newNameFirst, String newNameLast) {
		nameFirst = newNameFirst;
		nameLast = newNameLast;
	}

	public void setText(String newText) {
		text = newText;
		for (int counter = 0; counter < text.length(); counter++) {
			if (text.charAt(counter) == ' ') {
				wordCount++;
			}
		}
	}

	public String getLastName() {
		return nameLast.toUpperCase();
	}

	public int getFirstName() {
		return nameFirst.length();
	}

	public boolean getX() {
		if (nameFirst.contains("X") == true || nameLast.contains("X") == true) {
			x = true;
			return x;
		} else {
			x = false;
			return x;
		}
	}
	
	public int getWordCount() {
		{
			return text.length();
		}
	}

}
