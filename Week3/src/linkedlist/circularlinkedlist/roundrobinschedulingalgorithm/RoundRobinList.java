package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinList {
    private RoundRobinNode head = null;
    private int totalProcesses = 0;

    // Add a new process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        RoundRobinNode newNode = new RoundRobinNode(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular link
        } else {
            RoundRobinNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Circular link
        }
        totalProcesses++;
    }

    // Remove a process by Process ID after its execution
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }
        RoundRobinNode temp = head;
        RoundRobinNode prev = null;
        do {
            if (temp.processId == processId) {
                if (prev == null) { // Removing the head node
                    if (head.next == head) { // Only one process in the list
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
                System.out.println("Process with ID " + processId + " removed after execution.");
                totalProcesses--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Process ID " + processId + " not found.");
    }

    // Simulate Round Robin scheduling with a fixed time quantum
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        RoundRobinNode temp = head;

        while (totalProcesses > 0) {
            // If the burst time is greater than 0, simulate the process execution
            if (temp.burstTime > 0) {
                int executionTime = Math.min(timeQuantum, temp.burstTime);
                temp.burstTime -= executionTime;
                totalWaitingTime += executionTime;
                System.out.println("Process ID " + temp.processId + " executed for " + executionTime + " units.");

                // If burst time becomes 0, remove the process
                if (temp.burstTime == 0) {
                    removeProcess(temp.processId);
                }
            }

            // Move to the next process in the circular list
            temp = temp.next;
        }

        // Calculate average waiting time and turnaround time
        double avgWaitingTime = totalWaitingTime / (double) totalProcesses;
        double avgTurnaroundTime = (totalWaitingTime + totalWaitingTime) / (double) totalProcesses;
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Display all processes in the circular list
    public void displayAllProcesses() {
        if (head == null) {
            System.out.println("No processes to display.");
            return;
        }
        RoundRobinNode temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

