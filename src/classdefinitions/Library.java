package classdefinitions;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList<Book> library;
	
	public Library()	{
		name = "library";
		library = new ArrayList<Book>();
		for(int i = 0; i <10; i++)	{
			Book bob = new Book();
			library.add(bob);
		}
	}
	
	public Library(String xName, ArrayList<Book> xLibrary)	{
		name =xName;
		library = xLibrary;
	}
	
	public void checkOutBook(int index)	{
		Book remove = library.remove(index);
	}
	
	public void returnBook()	{
		library.add(new Book());
	}
	
	public void Fire()	{
		for(int i = library.size() - 1; i >= 0; i--)	{
			library.remove(i);
		}
	}
}
