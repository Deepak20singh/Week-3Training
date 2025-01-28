package linkedlist.doublylinkedlist.undoredofunctionality;

public class UndoRedoMain {
    public static void main(String[] args) {
        // Create a TextEditor with a history limit of 5 states
        UndoRedoList editor = new UndoRedoList(5);

        // Simulate typing actions and add states
        editor.addState("Hello, world!");
        editor.addState("Hello, world! How are you?");
        editor.addState("Hello, world! How are you? I am fine.");
        editor.addState("Hello, world! How are you? I am fine. Thank you.");
        editor.addState("Hello, world! How are you? I am fine. Thank you. Goodbye.");

        // Display current state
        System.out.println("Current Text: " + editor.getCurrentState());

        // Undo the last action
        System.out.println("\nUndo: " + editor.undo());
        System.out.println("Current Text: " + editor.getCurrentState());

        // Undo again
        System.out.println("\nUndo: " + editor.undo());
        System.out.println("Current Text: " + editor.getCurrentState());

        // Redo the last undone action
        System.out.println("\nRedo: " + editor.redo());
        System.out.println("Current Text: " + editor.getCurrentState());

        // Display the full history
        editor.displayHistory();

        // Add more states (causing history limit to discard older states)
        editor.addState("New state added.");
        editor.addState("Another new state added.");

        // Display the updated history
        editor.displayHistory();
    }
}
