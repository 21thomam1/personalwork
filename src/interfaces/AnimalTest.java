package interfaces;
import java.util.ArrayList;
public class AnimalTest {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cat());
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		for(Animal i : animals){
			i.act();
			System.out.println(i.toString());
			if(i instanceof Dog)	{
				Dog oneDog = (Dog)i;
				oneDog.vet();
			}
		}
		int lastCatIndex = -1;
		for(int i = 0; i < animals.size(); i++)	{
			if(animals.get(i) instanceof Cat)	{
				lastCatIndex = i;
			}
		}
		animals.remove(lastCatIndex);
		for(Animal i : animals)	{
			System.out.println(i.toString());
		}

	}

} 