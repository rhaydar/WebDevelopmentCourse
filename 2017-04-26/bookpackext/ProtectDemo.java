package bookpackext;
import bookpack.*;

class ExtBook extends Book {
	private String publisher;

	ExtBook(String t2, String a2, int p1, String p2) {
		super(t2,a2,p1);
		publisher = p2;
	}

	public void show() {
		super.show();
		System.out.println(publisher);
		System.out.println();
	}

	// setter and getter for publisher
	public void setPublisher(String p) {
		publisher = p;
	}
	public String getPublisher() {
		return publisher;
	}


}

class ProtectDemo {
	public static void main(String[] args) {
		ExtBook[] books = new ExtBook[5];

		books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill Professional");
		books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill Professional");
		books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On The Road", "Kerouac", 1955, "Viking");

		for (int i=0; i<books.length; i++) {
			books[i].show();
		}

		//find books by author Shildt
		System.out.println("Showing all books by Schildt.");
		for (int i=0; i<books.length; i++) {
			for (int j = 0; j <= books[i].getAuthor().length()-7; j++) {
				if (books[i].getAuthor().substring(j,j+7).equals("Schildt")) {
					System.out.println(books[i].getTitle());
				}
			}
		}
	}
}