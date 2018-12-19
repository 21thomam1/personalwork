package classdefinitions;

public class Book {
	private int pages;
	private String title;
	
	public Book()	{
		pages = 0;
		title = " ";
	}
	
	public Book(int xPages, String xTitle)	{
		if(xPages < 0){
			xPages = 0;
		}
		pages = xPages;
		title = xTitle;
	}
	
	public void setTitle(String xTitle)	{
		title = xTitle;
	}
	
	public void setPages(int xPages)	{
		if(xPages < 0){
			xPages = 0;
		}
		pages = xPages;
	}
	
	public String getTitle()	{
		return title;
	}
	
	public int getPages()	{
		return pages;
	}
	
	public String toString()	{
		return "Book object pages: " + pages + " title: " + title;
	}
	
	public boolean equals(Book otherBook)	{
		return this.toString().equals(otherBook.toString());
	}
	
	public Book clone()	{
		return new Book(pages, title);
	}

}
