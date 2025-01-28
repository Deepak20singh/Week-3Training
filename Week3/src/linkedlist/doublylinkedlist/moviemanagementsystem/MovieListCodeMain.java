package linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieListCodeMain {
    public static void main(String[] args) {
        MovielListCode movies = new MovielListCode();
        movies.addStart("pushpa", "Kabir", 2022, 4.5);
        movies.addStart("KGF", "Dev", 2021, 4.5);
        movies.addStart("Jocker", "Ravi", 2015, 4.5);

        //adding at end
        movies.addEnd("Kick", "Pranav", 2016, 4.7);

        //adding in between
        movies.addBetween("pushpa2", "ramu", 2023, 4.8, 2);

        //searchByDirector
        movies.searchByDirector("ramu");

        //search by rating
        movies.searchByRating(4.5);

        //delete
        movies.deleteByTitle("Kick");

        //update
        movies.Update("pushpa2", 3.7);
        movies.DisplayStart();
        movies.Displayend();

    }
}