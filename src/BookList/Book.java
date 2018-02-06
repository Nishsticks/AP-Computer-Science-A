package src.BookList;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -



public class Book
{
	private String title;
	private String media;	

	public Book()
	{
		title = "";
		media = "";
	 
	}

	public Book(String t, String m)
	{
	   title = t;
	   media = m;
	}

	public String getTitle()
	{
		return title;
	}
	
	public String getMedia()
	{
		return media;
	}
	
	public String toString()
	{
		return title + " " +media;
	}
}