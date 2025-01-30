package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinMain {
    public static void main(String[] args) {
        RoundRobinList scheduler = new RoundRobinList();

        // Adding processes
        scheduler.addProcess(1, 14, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 7, 3);
        scheduler.addProcess(4, 10, 4);

        // Display all processes
        System.out.println("All Processes in the Queue:");

        // Simulate Round Robin scheduling with a time quantum of 4
        System.out.println("\nRound Robin Scheduling with Time Quantum 4:");
      scheduler.roundRobinScheduling(4);
      //scheduler.scheduling(4);
        System.out.println("Total Time Taken by Complete process :- "+RoundRobinList.totalTime);

    }

}

