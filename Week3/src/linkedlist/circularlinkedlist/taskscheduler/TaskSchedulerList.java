package linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerList {
    private TaskSchedulerNode head = null;

    // Add a task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskSchedulerNode newNode = new TaskSchedulerNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            TaskSchedulerNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Circular link
            head = newNode;
        }
    }

    // Add a task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskSchedulerNode newNode = new TaskSchedulerNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            TaskSchedulerNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Circular link
        }
    }

    // Add a task at a specific position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        TaskSchedulerNode newNode = new TaskSchedulerNode(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
        } else {
            TaskSchedulerNode temp = head;
            int count = 1;
            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Position out of range");
            }
        }
    }

    // Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        TaskSchedulerNode temp = head;
        TaskSchedulerNode prev = null;
        do {
            if (temp.taskId == taskId) {
                if (prev == null) { // Task to be removed is the head
                    if (head.next == head) { // Only one node
                        head = null;
                    } else {
                        prev = head;
                        while (prev.next != head) {
                            prev = prev.next;
                        }
                        head = head.next;
                        prev.next = head; // Circular link
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task ID not found");
    }

    // View the current task and move to the next task
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        TaskSchedulerNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Display all tasks in the list starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        TaskSchedulerNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }
        TaskSchedulerNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

}
