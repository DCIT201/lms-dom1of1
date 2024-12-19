package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Things fall Apart", "Chinua Achebe", 2002));
        library.addBook(new Book("Slow and Fast Thinking", "Will Taylor", 1957));

        // List all books
        System.out.println("Books in the library:");
        library.listBooks();

        // Create a patron
        Patron patron = new Patron("Dominic", 1);

        // Borrow a book
        patron.borrowBook(new Book("Things fall Apart", "Chinua Achebe", 2002), library);

        // List borrowed books
        System.out.println("\nBorrowed books:");
        patron.listBorrowedBooks();

        // Return a book
        patron.returnBook(new Book("Things fall Apart", "Chinua Achebe", 2002), library);

        // Final library state
        System.out.println("\nBooks in the library after completed operations:");
        library.listBooks();
    }
}
