
public class Magazine extends Book {

	Publisher publisher;

	// For Magazine

	public Magazine(Author author, String title, Publisher publisher) {
		super(author, title);
		this.publisher = publisher;
	}

	public double calculatePrice() {
		return super.calculatePrice() * 12;
	}

	@Override
	public String toString() {
		return "Magazines [publisher=" + publisher + ", author=" + author
				+ ", title=" + title + ", length=" + length + "]";
	}

}

