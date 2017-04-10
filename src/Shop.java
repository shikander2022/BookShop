import java.util.ArrayList;
import java.util.List;

public class Shop {

	List<Book> bookList = new ArrayList<>();

	public Shop(List<Book> bookList) {
		this.bookList = bookList;
	}


	public double calculateTotalBookPrice() {
		double totalPrice = 0;
		for (Book book : bookList) {
			totalPrice += book.calculatePrice();
			System.out.println(book.toString());
		}

		return totalPrice;

	}

}
