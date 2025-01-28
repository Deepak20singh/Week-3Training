package linkedlist.singlylinkedlist.socialmediafriendconnections;
import java.util.List;
import java.util.ArrayList;
public class SocialMediaNode {
    SocialMediaNode next;
    int userID;
    String name;
    int age;
    List<Integer> friendIDs; // List of Friend IDs

    // Constructor to initialize a user
    public SocialMediaNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
    }
}
