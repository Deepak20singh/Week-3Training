package linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryList {
    private LibraryNode head = null;
    private LibraryNode tail = null;
    private int totalBooks = 0;

    // Add a book at the beginning of the list
    public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        LibraryNode newNode = new LibraryNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        totalBooks++;
    }

    // Add a book at the end of the list
    public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        LibraryNode newNode = new LibraryNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        totalBooks++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 1 || position > totalBooks + 1) {
            System.out.println("Invalid position");
            return;
        }

        LibraryNode newNode = new LibraryNode(title, author, genre, bookId, isAvailable);
        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
        } else if (position == totalBooks + 1) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
        } else {
            LibraryNode temp = head;
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            totalBooks++;
        }
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("No books to remove.");
            return;
        }

        LibraryNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next; // Updating head if the book is the first in the list
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev; // Updating tail if the book is the last in the list
                }

                totalBooks--;
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by title
    public LibraryNode searchByTitle(String title) {
        LibraryNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for a book by author
    public LibraryNode searchByAuthor(String author) {
        LibraryNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Update a book’s availability status
    public void updateAvailability(int bookId, boolean isAvailable) {
        LibraryNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability status of book ID " + bookId + " updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books in the library.");
            return;
        }

        LibraryNode temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books in the library.");
            return;
        }

        LibraryNode temp = tail;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookId + ", Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books in the library
    public int countBooks() {
        return totalBooks;
    }
}
