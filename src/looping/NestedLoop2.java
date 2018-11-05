package looping;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		for (int counter1 = 1; counter1 <= 4; counter1 ++)	{
			
			for (int counter2 = 1; counter2 <= 5; counter2 ++)
			{
				if (counter2 == 3)
					System.out.print(counter1 + " ");
				else
					System.out.print(counter2 + " ");
		}
		
		System.out.println();
		
		}

	}

}

