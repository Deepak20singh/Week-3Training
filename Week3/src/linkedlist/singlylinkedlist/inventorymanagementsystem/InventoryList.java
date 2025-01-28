package linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryList {

    private InventoryNode head;
    private int size;

    

    // Constructor for InventoryManagementSystem
    public InventoryList() {
        this.head = null;
        this.size = 0;
    }

    // Add an item at the beginning
    public void addItemAtBeginning(String itemName, int itemID, int quantity, double price) {
        InventoryNode newInventoryNode = new InventoryNode(itemName, itemID, quantity, price);
        newInventoryNode.next = head;
        head = newInventoryNode;
        size++;
    }

    // Add an item at the end
    public void addItemAtEnd(String itemName, int itemID, int quantity, double price) {
        InventoryNode newInventoryNode = new InventoryNode(itemName, itemID, quantity, price);
        if (head == null) {
            head = newInventoryNode;
        } else {
            InventoryNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newInventoryNode;
        }
        size++;
    }

    // Add an item at a specific position
    public void addItemAtPosition(String itemName, int itemID, int quantity, double price, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        InventoryNode newInventoryNode = new InventoryNode(itemName, itemID, quantity, price);
        if (position == 0) {
            newInventoryNode.next = head;
            head = newInventoryNode;
        } else {
            InventoryNode current = head;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            newInventoryNode.next = current.next;
            current.next = newInventoryNode;
        }
        size++;
    }

    // Remove an item by Item ID
    public void removeItemByID(int itemID) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemID == itemID) {
            head = head.next;
            size--;
            return;
        }

        InventoryNode current = head;
        InventoryNode previous = null;
        while (current != null && current.itemID != itemID) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Item with ID " + itemID + " not found.");
            return;
        }

        previous.next = current.next;
        size--;
    }

    // Update the quantity of an item by Item ID
    public void updateItemQuantity(int itemID, int newQuantity) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    // Search for an item by Item ID or Item Name
    public void searchItem(String searchTerm) {
        InventoryNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(searchTerm) || Integer.toString(current.itemID).equals(searchTerm)) {
                System.out.println("Found Item - ID: " + current.itemID + ", Name: " + current.itemName +
                        ", Quantity: " + current.quantity + ", Price: " + current.price);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No item found for: " + searchTerm);
        }
    }

    // Calculate and display the total value of the inventory
    public double getTotalInventoryValue() {
        double totalValue = 0;
        InventoryNode current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        return totalValue;
    }

    // Sort the inventory based on Item Name or Price
    public void sortInventory(String sortBy, boolean ascending) {
        if (head == null || head.next == null) {
            return;
        }

        // Convert linked list to array for sorting
        InventoryNode[] InventoryNodes = new InventoryNode[size];
        InventoryNode current = head;
        for (int i = 0; i < size; i++) {
            InventoryNodes[i] = current;
            current = current.next;
        }

        // Sort the array based on the chosen field (Item Name or Price)
        if (sortBy.equalsIgnoreCase("name")) {
            if (ascending) {
                mergeSortByName(InventoryNodes, 0, size - 1);
            } else {
                mergeSortByName(InventoryNodes, 0, size - 1);
                reverseArray(InventoryNodes);
            }
        } else if (sortBy.equalsIgnoreCase("price")) {
            if (ascending) {
                mergeSortByPrice(InventoryNodes, 0, size - 1);
            } else {
                mergeSortByPrice(InventoryNodes, 0, size - 1);
                reverseArray(InventoryNodes);
            }
        }

        // Rebuild the linked list from the sorted array
        head = InventoryNodes[0];
        current = head;
        for (int i = 1; i < size; i++) {
            current.next = InventoryNodes[i];
            current = current.next;
        }
        current.next = null; // Set the last InventoryNode's next to null
    }

    // Merge Sort based on Item Name
    private void mergeSortByName(InventoryNode[] InventoryNodes, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortByName(InventoryNodes, left, mid);
            mergeSortByName(InventoryNodes, mid + 1, right);
            mergeByName(InventoryNodes, left, mid, right);
        }
    }

    // Merge operation for sorting by Item Name
    private void mergeByName(InventoryNode[] InventoryNodes, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        InventoryNode[] leftArray = new InventoryNode[n1];
        InventoryNode[] rightArray = new InventoryNode[n2];

        System.arraycopy(InventoryNodes, left, leftArray, 0, n1);
        System.arraycopy(InventoryNodes, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].itemName.compareTo(rightArray[j].itemName) <= 0) {
                InventoryNodes[k] = leftArray[i];
                i++;
            } else {
                InventoryNodes[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            InventoryNodes[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            InventoryNodes[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Merge Sort based on Price
    private void mergeSortByPrice(InventoryNode[] InventoryNodes, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortByPrice(InventoryNodes, left, mid);
            mergeSortByPrice(InventoryNodes, mid + 1, right);
            mergeByPrice(InventoryNodes, left, mid, right);
        }
    }

    // Merge operation for sorting by Price
    private void mergeByPrice(InventoryNode[] InventoryNodes, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        InventoryNode[] leftArray = new InventoryNode[n1];
        InventoryNode[] rightArray = new InventoryNode[n2];

        System.arraycopy(InventoryNodes, left, leftArray, 0, n1);
        System.arraycopy(InventoryNodes, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i].price <= rightArray[j].price) {
                InventoryNodes[k] = leftArray[i];
                i++;
            } else {
                InventoryNodes[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            InventoryNodes[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            InventoryNodes[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Reverse the array (to convert ascending to descending order)
    private void reverseArray(InventoryNode[] InventoryNodes) {
        int left = 0;
        int right = InventoryNodes.length - 1;
        while (left < right) {
            InventoryNode temp = InventoryNodes[left];
            InventoryNodes[left] = InventoryNodes[right];
            InventoryNodes[right] = temp;
            left++;
            right--;
        }
    }

    // Display all items in the inventory
    public void displayInventory() {
        InventoryNode current = head;
        while (current != null) {
            System.out.println("Item ID: " + current.itemID + ", Name: " + current.itemName +
                    ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }

}
