package looping;

public class NumberOutput {
	public static void main(String[] args){
	int counter = 0;
	int num = 0;
		for (counter = 1; counter <= 5; counter++)	{
			System.out.print(counter + " ");
		for (num = counter; num <= 5; num ++){
			System.out.print(num + " ");
		}

		System.out.println();
	}
}
}