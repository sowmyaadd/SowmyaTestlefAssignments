package week2.day1;

public class LibraryManagement {
public static void main(String[] args) {
	Library libMang = new Library();
	String book = libMang.addBook("The Monk Who Sold His Ferrari");
	libMang.issueBook();
	
}
}
