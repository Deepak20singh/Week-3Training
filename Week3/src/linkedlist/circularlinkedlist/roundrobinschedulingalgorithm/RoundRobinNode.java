package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinNode {
    int processId;
    int burstTime;
    int priority;
    RoundRobinNode next;

    // Constructor to initialize the process node
    public RoundRobinNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
