package classdefinitions;

public class Student {
	private String name;
	private int testScores[];
	private int howMany;

	public Student() {
		name = "bob";
		testScores = new int[5];
		howMany = 0;
	}
	
	public Student(String xName)	{
		name =xName;
	}

	public void addScore(String score) {
		int lowest = 999;
		int realScore = Integer.valueOf(score);
		if (realScore >= 0) {
			howMany++;
		}
		if (testScores.length > 5) {
			testScores[testScores.length] = realScore;
		}
	}

	public double average() {
		double total = 0;
		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
		double avg = total / testScores.length;
		return avg;
	}

	public int lowestScore() {
		int lowest = 9999;
		for (int i = 0; i < testScores.length; i++) {
			if (testScores[i] < lowest) {
				lowest = testScores[i];
			}
		}
		return lowest;
	}
	
	public String toString()	{
		return "Student object name: " + name;
	}
	
	public boolean equals(Student oneStudent)	{
		return this.toString().equals(oneStudent.toString());
	}
	
	public Student clone()	{
		return new Student(name);
	}

}
