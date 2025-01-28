package linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskSchedulerNode next;

    // Constructor to initialize the task node
    public TaskSchedulerNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

