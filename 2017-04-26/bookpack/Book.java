// package declaration
package bookpack;

public class Book {
	protected String title;
	protected String author;
	protected int pubDate;

	public Book(String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
	}

	// setters and getters for inherited members
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}

	public void setAuthor(String k) {
		author = k;
	}
	public String getAuthor() {
		return author;
	}
	public void setPubDate(int x) {
		pubDate = x;
	}
	public int getPubDate() {
		return pubDate;
	}

}