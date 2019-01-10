package interfaces;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		Teacher tom = new Teacher();
		Student bob = new Student();
		Teacher jim = new Teacher();
		Student meg = new Student();
		bob.setName("bob");
		tom.setName("tom");
		jim.setName("jim");
		meg.setName("shanaynayiqua");
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(tom);
		people.add(bob);
		people.add(jim);
		people.add(meg);
	
		for (int i = 0; i < people.size(); i++) {
			Person onePerson = people.get(i);
			System.out.println(onePerson.getName());
			if(onePerson.getName().length() > 10){
				System.out.println(onePerson.getAge());
			}
		}

	}
}