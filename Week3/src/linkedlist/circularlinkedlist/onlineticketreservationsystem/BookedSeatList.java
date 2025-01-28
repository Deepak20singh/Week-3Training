package linkedlist.circularlinkedlist.onlineticketreservationsystem;


public class BookedSeatList {
    private BookedSeat head;
    private BookedSeat tail;

    public void addEnd(int ticketID,int seatNumber,double bookingtime,String customerName,String movieName) {
        BookedSeat movie = new BookedSeat(ticketID,seatNumber,bookingtime,customerName,movieName);
        if (head == null) {
            head = movie;
            tail = movie;
            movie.next = head; // Circular link
        }
        else {
            tail.next=movie;
            movie.next = head;
            tail=movie;
        }
        System.out.println(" Successfully!! Ticket booked : Ticket ID = " + ticketID);


    }
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
        }
        BookedSeat current = head;
        BookedSeat previous = tail;
        boolean found = false;
        while (true) {
            if (current.ticketID == ticketID) {
                found = true;
                break;
            }
            previous = current;
            current = current.next;

            // Break the loop when we return to the head
            if (current == head) {
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket with ID " + ticketID + " not found.");
        }
        if (current == head && current == tail) { // Only one ticket in the list
            head = null;
            tail = null;
        } else if (current == head) { // Removing the head node
            head = head.next;
            tail.next = head;
        } else if (current == tail) { // Removing the tail node
            tail = previous;
            tail.next = head;
        } else { // Removing a middle node
            previous.next = current.next;
        }

        BookedSeat.numberofticketbooked--;

    }
    public void search(String searchkey){
        if (head == null) {
            System.out.println("No tickets available.");
            }
        BookedSeat current = head;
        boolean found = false;
        while(current.movieName!=searchkey||current.customerName!=searchkey){
            if(current.movieName==searchkey||current.customerName==searchkey){
                found=true;
                break;
            }
            current=current.next;

            if(current==head){
                break;
            }
        }
        if(found){
            System.out.println("Name of Customer :- "+current.customerName+" , Name of Movie :- "+current.movieName+" , Ticket Id :- "+current.ticketID+" , Seat Number :- "+current.seatNumber);
        }
        else{
            System.out.println("No tickets available.");
        }



    }
    public void Display(){
        BookedSeat current = head;
        while(current!=tail.next){
            System.out.println("Name of Customer :- "+current.customerName+" , Name of Movie :- "+current.movieName+" , Ticket Id :- "+current.ticketID+" , Seat Number :- "+current.seatNumber);

        }
    }

    }
