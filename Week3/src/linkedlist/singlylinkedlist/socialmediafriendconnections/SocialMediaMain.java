package linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaMain {
    public static void main(String[] args) {
        SocialMediaList connections = new SocialMediaList();

        // Add users to the system
        connections.addUser(1, "Dev", 28);
        connections.addUser(2, "Ravi", 34);
        connections.addUser(3, "Adi", 24);

        // Add some friend connections
        connections.addFriendConnection(1, 2);
        connections.addFriendConnection(1, 3);

        // Display all users
        System.out.println("All Users:");
        connections.displayAllUsers();

        // Display friends of a specific user
        connections.displayFriends(1);

        // Find mutual friends between two users
        connections.findMutualFriends(1, 2);

        // Remove a friend connection
        connections.removeFriendConnection(1, 2);
        connections.displayFriends(1);

        // Count the number of friends for each user
        connections.countFriends();
    }
}
