package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinMain {
    public static void main(String[] args) {
        RoundRobinList scheduler = new RoundRobinList();

        // Adding processes
        scheduler.addProcess(1, 6, 3);
        scheduler.addProcess(2, 8, 2);
        scheduler.addProcess(3, 7, 1);
        scheduler.addProcess(4, 3, 4);

        // Display all processes
        System.out.println("All Processes in the Queue:");
        scheduler.displayAllProcesses();

        // Simulate Round Robin scheduling with a time quantum of 4
        System.out.println("\nRound Robin Scheduling with Time Quantum 4:");
        scheduler.roundRobinScheduling(4);
    }
}

