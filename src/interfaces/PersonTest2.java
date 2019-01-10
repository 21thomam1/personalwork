package interfaces;

import java.util.ArrayList;

public class PersonTest2 {

	public static void main(String[] args) {
		Teacher tom = new Teacher();
		Student bob = new Student();
		Teacher jim = new Teacher();
		Student meg = new Student();
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(tom);
		people.add(bob);
		people.add(jim);
		people.add(meg);

		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof Student) {
				Student oneStudent = (Student) people.get(i);
				oneStudent.outSick();
			}
		}
	}
}