package linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class BookedSeat {
    public static int numberofticketbooked=0;
    int ticketID,seatNumber;
    double bookingtime;
    String customerName, movieName;
    BookedSeat next;
    BookedSeat(int ticketID,int seatNumber,double bookingtime,String customerName,String movieName){
        this.ticketID=ticketID;
        this.seatNumber=seatNumber;
        this.bookingtime=bookingtime;
        this.movieName=movieName;
        this.customerName=customerName;
        this.next=null;
        numberofticketbooked++;

    }
}
