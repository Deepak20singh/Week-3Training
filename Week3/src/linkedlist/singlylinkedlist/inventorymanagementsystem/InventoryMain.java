package linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryMain {

    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();

        // Adding items to inventory
        inventory.addItemAtBeginning("Apple", 1, 50, 1.5);
        inventory.addItemAtEnd("Banana", 2, 30, 0.8);
        inventory.addItemAtEnd("Orange", 3, 60, 1.2);
        inventory.addItemAtPosition("Mango", 4, 40, 1.8, 2);

        // Display inventory
        inventory.displayInventory();

        // Update quantity
        inventory.updateItemQuantity(103, 70);

        // Remove item by ID
        inventory.removeItemByID(102);

        // Display inventory after updates
        inventory.displayInventory();

        // Search for item by ID or name
        inventory.searchItem("Orange");

        // Calculate total value of inventory
        System.out.println("Total Inventory Value :- " + inventory.getTotalInventoryValue());

        // Sort inventory by Price in descending order
        inventory.sortInventory("price", false);
        inventory.displayInventory();
    }
}
