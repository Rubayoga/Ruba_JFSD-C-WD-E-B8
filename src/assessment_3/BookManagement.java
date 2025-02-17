package assessment_3;

import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Library obj = new Library();
		int input = 0;
		while (input != 4) {
			System.out.println("1.add book");
			System.out.println("2.Remove book");
			System.out.println("3.Search book");
			System.out.println("4.exit");
			System.out.println("*****Select the above Option to proceed*****");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println("Enter the book id:");
				int bookid = sc.nextInt();
				System.out.println("Enter the title");
				String title = sc.next();
				System.out.println("enter the author name");
				String author = sc.next();
				Book bk = new Book(bookid, title, author);
				obj.addBook(bk);
			} else if (input == 2) {
				System.out.println("Enter the book id to remove book");
				int remove = sc.nextInt();
				obj.removeBook(remove);
			} else if (input == 3) {
				System.out.println("Enter the book id to search book");
				int search = sc.nextInt();
				obj.searchBook(search);
			}
		}
		System.out.println("exit");
	}
}
