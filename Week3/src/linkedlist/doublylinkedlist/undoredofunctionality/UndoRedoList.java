package linkedlist.doublylinkedlist.undoredofunctionality;

public class UndoRedoList {
    private UndoRedoNode currentState;
    private int historySize;
    private UndoRedoNode head;
    private UndoRedoNode tail;

    public UndoRedoList(int historySize) {
        this.historySize = historySize;
        this.head = this.tail = this.currentState = null;
    }

    // Add a new state to the history
    public void addState(String newText) {
        UndoRedoNode newNode = new UndoRedoNode(newText);

        // If history is at its limit, remove the oldest state
        if (currentState != null && getHistoryCount() == historySize) {
            // Remove the head node (oldest state)
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }

        // Add the new node to the end of the history list
        if (currentState == null) {
            head = tail = currentState = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            currentState = tail;  // Move currentState to the new state
        }
    }

    // Undo the last action (move to the previous state)
    public String undo() {
        if (currentState == null || currentState.prev == null) {
            return "No previous state available.";
        }
        currentState = currentState.prev;
        return currentState.text;
    }

    // Redo the last undone action (move to the next state)
    public String redo() {
        if (currentState == null || currentState.next == null) {
            return "No next state available.";
        }
        currentState = currentState.next;
        return currentState.text;
    }

    // Display the current state of the text
    public String getCurrentState() {
        if (currentState == null) {
            return "No text available.";
        }
        return currentState.text;
    }

    // Get the current history count (number of states in history)
    public int getHistoryCount() {
        int count = 0;
        UndoRedoNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Display the full history from the first to the last state
    public void displayHistory() {
        UndoRedoNode temp = head;
        if (temp == null) {
            System.out.println("No history available.");
            return;
        }
        System.out.println("History of Text States:");
        while (temp != null) {
            System.out.println(temp.text);
            temp = temp.next;
        }
    }

}
