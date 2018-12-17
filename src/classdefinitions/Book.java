package classdefinitions;

public class Book {
	private int pages;
	private String title;
	
	public Book()	{
		pages = 0;
		title = " ";
	}
	
	public Book(int xPages, String xTitle)	{
		pages = xPages;
		title = xTitle;
	}
	
	public void setTitle(String xTitle)	{
		title = xTitle;
	}
	
	public void setPages(int xPages)	{
		pages = xPages;
	}
	
	public String getTitle()	{
		return title;
	}
	
	public int getPages()	{
		return pages;
	}

}
