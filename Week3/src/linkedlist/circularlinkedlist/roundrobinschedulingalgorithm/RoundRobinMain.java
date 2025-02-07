package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinMain {
    public static void main(String[] args) {
        RoundRobinList scheduler = new RoundRobinList();

        scheduler.addProcess(1, 14, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 7, 3);
        scheduler.addProcess(4, 10, 4);

        System.out.println("All Processes in the Queue:");

         System.out.println("\nRound Robin Scheduling with Time Quantum 4:");
      scheduler.startProcess();;
      //scheduler.scheduling(4);

    }

}

