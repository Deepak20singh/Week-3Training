package linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryList library = new LibraryList();

        // Adding books
        library.addBookAtBeginning("The Catcher in the Rye", "J.D. Salinger", "Fiction", 1, true);
        library.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 2, true);
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", 3, false);
        library.addBookAtPosition(2, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", 4, true);

        // Display all books in forward order
        System.out.println("Books in the Library (Forward Order):");
        library.displayBooksForward();

        // Display all books in reverse order
        System.out.println("\nBooks in the Library (Reverse Order):");
        library.displayBooksReverse();

        // Search for a book by title
        System.out.println("\nSearching for a book titled '1984':");
        LibraryNode book = library.searchByTitle("1984");
        if (book != null) {
            System.out.println("Found book: " + book.title + " by " + book.author);
        } else {
            System.out.println("Book not found.");
        }

        // Update the availability status of a book
        library.updateAvailability(3, true);

        // Remove a book by ID
        library.removeBookById(2);

        // Display total number of books
        System.out.println("\nTotal number of books: " + library.countBooks());

    }}

