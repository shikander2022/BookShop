import java.util.Date;

public class Ebook extends Book implements ElectronicBook {

	Date dateSent;

	public Ebook(Author author, String title, Date dateSent) {
		super(author, title);
		this.dateSent = dateSent;
	}

	public double calculatePrice() {
		return 1;

	}

	@Override
	public String toString() {
		return "Ebook [dateSent=" + dateSent + ", author=" + author
				+ ", title=" + title + ", length=" + length + "]";
	}

	@Override
	public void transmitted() {
		System.out.println("transmitted.");

	}

}