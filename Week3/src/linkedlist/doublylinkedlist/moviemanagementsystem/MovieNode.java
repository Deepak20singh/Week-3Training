package linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieNode {
    String Title, Director;
    int Year_of_Release;
    double Rating;
    MovieNode next;
    MovieNode prev;
    public MovieNode(String Title,String Director,int Year_of_Release,double Rating){
        this.Director=Director;
        this.Rating=Rating;
        this.Title=Title;
        this.Year_of_Release=Year_of_Release;
        this.next=null;
        this.prev=null;
    }

}
