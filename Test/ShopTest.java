import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {

	List<Book> bookList = new ArrayList<>();

	@Before
	public void setUp() throws Exception {

		// adding books
		Author author = new Author("Test", "Thomas", "Tempe");
		bookList.add(new Book(author, "Hello Java"));
		bookList.add(new Book(author, "Test java"));
		// adding magazines
		Publisher publisher = new Publisher("Statefarm", "Tempe, AZ");
		bookList.add(new Magazine(author, "Daily Magazine", publisher));
		bookList.add(new Magazine(author, "Standup", publisher));

		// adding Ebooks
		bookList.add(new Ebook(author, "ebook1", new Date()));
		bookList.add(new Ebook(author, "ebook2", new Date()));

	}

	@Test
	public void ShopCalculatePriceTest() {
		Shop shop = new Shop(bookList);
		Assert.assertTrue(262 == shop.calculateTotalBookPrice());
	}

}
