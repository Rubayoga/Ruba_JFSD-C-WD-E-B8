package assessment_3;

public class Library {
	// This program will work only for 3 books
	Book[] books = new Book[3];
	int index = 0;

	public void addBook(Book book) {
		books[index] = book;
		index++;
		System.out.println("----------Book added----------");
	}

	public void removeBook(int bookid) {
		boolean found = false;
		for (int i = 0; i < 3; i++) {
			Book book = books[i];
			if (book != null && book.bookid == bookid) {
				found = true;
				book.available = false;
				System.out.println("---------book removed-----------");
			}
		}
		if (!found) {
			System.out.println("_______________Your given book id is not available. Hence not able to remove_______________________");
		}
	}

	public void searchBook(int bookid) {
		boolean found = false;
		for (int i = 0; i < 3; i++) {
			Book book = books[i];
			if (book != null && book.bookid == bookid && book.available) {
				found = true;
				System.out.println("Book ID:" + book.bookid);
				System.out.println("Your searched book is available");
				System.out.println("Author :" + book.author);
				System.out.println("Title :" + book.title);
			}
		}
		if (!found) {
			System.out.println("____________Your searched book id is not available________________");
		}
	}
}
