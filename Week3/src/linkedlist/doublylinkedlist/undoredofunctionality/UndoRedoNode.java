package linkedlist.doublylinkedlist.undoredofunctionality;

public class UndoRedoNode {
    String text;
    UndoRedoNode next;
    UndoRedoNode prev;

    public UndoRedoNode(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
