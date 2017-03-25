
public class Book {
	String author = "Green";
	String title;
	int books = 2;
	public void bok() {

		System.out
				.println("For magazines it is the above multiplied by 12 is : "
						+ author.length() * 12);
	}

	public void dollar() {
		System.out.println("ElectornicBooks it is 1 dollar is : "
				+ author.length() * 1);
	}

	public Book() {

	}

	public Book(String author, int books) {
		super();
		this.author = author;
		this.books = books;
		// for(int v=0;v<author.length();v++);
		// System.out.println("Iterate book" + v);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBooks() {
		return books;
	}

	public void setAuthor(int books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "[author:" + author + ", books:" + books + "]";
	}
}
