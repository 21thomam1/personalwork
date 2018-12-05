package arraylists;

import java.util.ArrayList;

public class FriendTest {

	public static void main(String[] args) {
		ArrayList<Friend> friends = new ArrayList<Friend>();
		Friend one = new Friend("name one", 11);
		Friend two = new Friend("name two", 22);
		Friend three = new Friend("name three", 33);
		friends.add(three);
		friends.add(two);
		friends.add(one);
	}

}