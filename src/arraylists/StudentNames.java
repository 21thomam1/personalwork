package arraylists;

import java.util.ArrayList;

public class StudentNames {

	public static void main(String[] args) {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		for(int i = 0; i < 50; i++)	{
			studentNames.add("student name");
		}

		if(studentNames.size() > 0)	{
			String junkOne = studentNames.remove(0);
		}
		
		if(studentNames.size() > 0)	{
			String junkTwo = studentNames.remove(studentNames.size()-1);
		}
		
		for(int i = 0; i < studentNames.size(); i++)	{
			System.out.println(studentNames.get(i));
		}	

	}

}
