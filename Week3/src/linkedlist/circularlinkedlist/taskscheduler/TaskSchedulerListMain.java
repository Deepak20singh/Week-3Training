package linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerListMain {

        public static void main(String[] args) {
            TaskSchedulerList scheduler = new TaskSchedulerList();

            // Adding tasks
            scheduler.addAtBeginning(1, "Task1", 1, "2025-01-30");
            scheduler.addAtEnd(2, "Task2", 3, "2025-02-01");
            scheduler.addAtEnd(3, "Task3", 2, "2025-02-05");
            scheduler.addAtPosition(2, 4, "Task4", 1, "2025-02-10");

            // Display all tasks
            System.out.println("All Tasks:");
            scheduler.displayAllTasks();

            // Search for tasks by priority
            System.out.println("\nTasks with Priority 1:");
            scheduler.searchByPriority(1);

            // Remove a task by Task ID
            System.out.println("\nRemoving Task with ID 2:");
            scheduler.removeByTaskId(2);

            // View current task
            System.out.println("\nCurrent Tasks:");
            scheduler.viewCurrentTask();
        }
    }

