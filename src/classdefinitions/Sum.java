package classdefinitions;

public class Sum {
	public static void main(String[] args) {
		System.out.println(sumNumbers(5));
	}
	public static int sumNumbers(int num)	{
		if(num > 0)	{
			return num + sumNumbers(num - 1);
		}
		return 0;
	}
}
