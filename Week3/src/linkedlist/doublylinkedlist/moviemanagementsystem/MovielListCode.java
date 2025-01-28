package linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovielListCode {
    private MovieNode head;

    public void addStart(String Title,String Director,int Year_of_Release,double Rating) {
        MovieNode movie = new MovieNode(Title, Director, Year_of_Release, Rating);
        movie.next = head;
        head = movie;
        movie.prev = null;

    }
    public void addEnd(String Title,String Director,int Year_of_Release,double Rating) {
        MovieNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        MovieNode movie = new MovieNode(Title, Director, Year_of_Release, Rating);
        temp.next = movie;
        movie.prev = temp;
        movie.next=null;

    }
    public void addBetween(String Title,String Director,int Year_of_Release,double Rating,int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        MovieNode movie = new MovieNode(Title, Director, Year_of_Release, Rating);
        if (position == 1) {
            addStart(Title, Director, Year_of_Release, Rating);
            return;
        }

        MovieNode temp=head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        movie.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = movie;
        }
        temp.next = movie;
        movie.prev = temp;
    }
    public void searchByDirector(String Director){
        MovieNode temp=head;
        while(temp.Director!=Director){
            temp=temp.next;
        }
        System.out.println("Search result \nTitle :- "+temp.Title+" \nDirector :- "+temp.Director+"\nYear of Release :- "+temp.Year_of_Release+"\nRating of movie :- "+temp.Rating+"\n");

    }

    public void searchByRating(double Rating){
        MovieNode temp=head;
        while(temp.Rating!=Rating){
            temp=temp.next;
        }
        System.out.println("Search result \nTitle :- "+temp.Title+" \nDirector :- "+temp.Director+"\nYear of Release :- "+temp.Year_of_Release+"\nRating of movie :- "+temp.Rating+"\n");

    }
    public void Update(String Title,double Rating){
        MovieNode temp=head;
        while(temp != null && !temp.Title.equals(Title)){
            temp=temp.next;
        }
        if (temp == null) {
            System.out.println("Title not found");
            return;
        }
        temp.Rating=Rating;

    }
    public void DisplayStart(){
        System.out.println("From Start");

        MovieNode temp=head;
        while(temp!=null){
            System.out.println("Title :- "+temp.Title+" , Director :- "+temp.Director+" , Year of Release :- "+temp.Year_of_Release+" , Rating of movie :- "+temp.Rating);
              temp=temp.next;
        }

    }
    // Delete a movie by Title
    public void deleteByTitle(String Title) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        MovieNode temp = head;

        // Traverse to find the node to delete
        while (temp != null && !temp.Title.equals(Title)) {
            temp = temp.next;
        }

        // If the movie is not found
        if (temp == null) {
            System.out.println("Movie with title \"" + Title + "\" not found.");
            return;
        }

        // If the node to delete is the head node
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Movie \"" + Title + "\" deleted from the list.");
            return;
        }

        // If the node to delete is in the middle or at the end
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        System.out.println("Movie \"" + Title + "\" deleted from the list.");
    }

    public void Displayend(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Movies from End:");
        MovieNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println("Title: " + temp.Title + " , Director: " + temp.Director + " , Year of Release: " + temp.Year_of_Release + " , Rating: " + temp.Rating);
            temp = temp.prev;
        }
    }
    }


