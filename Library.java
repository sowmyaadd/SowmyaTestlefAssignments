package week2.day1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library lib = new Library();
		String book = lib.addBook("The monk who sold his ferrari");
		lib.issueBook();

	}
}

