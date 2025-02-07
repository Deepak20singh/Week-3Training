package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinNode {
    public static int counter=0;

   int processId;
   int burstTime;
   int priority;
    RoundRobinNode next;
    RoundRobinNode(int processId,int burstTime,int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
        counter++;

    }
}


