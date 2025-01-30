package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinNode {
    int processId;
    int burstTime;
    int priority;
    RoundRobinNode next;
    static int numberOfProcess;
    int initial;

    // Constructor to initialize the process node
    public RoundRobinNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
        numberOfProcess++;
        this.initial=0;
    }
}
