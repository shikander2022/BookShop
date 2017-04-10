
public class Book {

	String author;
	String title;
	int length;

	public Book(Author author, String title) {
		this.author = author.toString();
		this.length = author.nameLength();
		this.title = title;
	}

	public double calculatePrice() {
		return length;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", length="
				+ length + "]";
	}

}
