
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int magazines[] = { 2 };
		int books[] = { 2 };
		int ebooks[] = { 2 };

		// dateSent type java.util.Date
		Ebook ebook = new Ebook();
		ebook.dat();

		// length of the authors firstName plus the length of the authors
		// lastName
		Author authobj = new Author();
		authobj.auth();

		// For magazines it is the above multiplied by 12
		Magazines mag = new Magazines();
		mag.bok();

		// For ElectornicBooks it is 1 dollar!
		Ebook ebok = new Ebook();
		ebok.dollar();


		// Iterate
		for (int k = 0; k < 2; k++) {
			System.out.println("Iterate book" + k);
		}

		// Book override toString
		Book bookobj = new Book("Brown", 7);
		System.out.println(bookobj.toString());

		// Scanner scnobj = new Scanner (System.in);
		// System.out.println("Please enter the name : ")

	}


}
