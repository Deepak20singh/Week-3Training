package linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class BookedListMain {
    public static void main(String[] args) {
        BookedSeatList book=new BookedSeatList();
        book.addEnd(912789,23,15.00,"Dev","kgf");
        book.addEnd(198208,33,18.00,"Aditya","Ravan");
        book.addEnd(598012,21,21.00,"Ved","Pushpa");

        //Search
        book.search("Dev");
        book.search("kgf");

        //remove
        book.removeTicket(198208);

        //display
        book.Display();

        //totalnumber of ticked booked
        System.out.println("Total Number of ticket booked :- "+BookedSeat.numberofticketbooked);


    }
}
