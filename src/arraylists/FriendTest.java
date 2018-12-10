package arraylists;

import java.util.ArrayList;

public class FriendTest {

	public static void main(String[] args) {
		ArrayList<Friend> buddies = new ArrayList<Friend>();
		Friend person = new Friend("Jacki Jones", 93);
		buddies.add(person);
		
		for(int  j = 0; j < buddies.size(); j++)	{
		System.out.println(buddies.get(j).getAge());
		}
		
	}

}