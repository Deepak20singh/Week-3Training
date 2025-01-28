package linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    LibraryNode next;
    LibraryNode prev;

    // Constructor to initialize a book node
    public LibraryNode(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
