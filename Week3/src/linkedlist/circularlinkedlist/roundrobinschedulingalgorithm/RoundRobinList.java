package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinList {
    private RoundRobinNode head;
    private RoundRobinNode tail;
    private int totalProcesses = 0;
    static int totalTime=0;

    // Add a new process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        RoundRobinNode newNode = new RoundRobinNode(processId, burstTime, priority);
     if(head==null){
         head=newNode;
         tail=newNode;
     }
     else{
         tail.next=newNode;
     newNode.next=head;
         tail = newNode;
     }
    totalProcesses++;

    }

    // Remove a process by Process ID after its execution
    public void deleteProcess(int processID) {
        if (head == null) {
            System.out.println("No processes to delete.");
            return;
        }

        RoundRobinNode temp = head;
        RoundRobinNode prev = tail; // Keep track of the previous node

        // 🟢 Case 1: Single node in the list
        if (head.processId == processID && head.next == head) {
            head = null;
            tail = null;
            totalProcesses--;
            return;
        }

        // 🟢 Case 2: Deleting the head node
        if (head.processId == processID) {
            head = head.next;
            tail.next = head;  // Maintain circular connection
            totalProcesses--;
            return;
        }

        // 🟢 Case 3: Deleting a middle or last node
        do {
            prev = temp;
            temp = temp.next;

            if (temp.processId == processID) {
                prev.next = temp.next;

                // If deleting the tail, update `tail`
                if (temp == tail) {
                    tail = prev;
                }

                totalProcesses--;
                return;
            }
        } while (temp != head); // Stop when full circle is completed

        System.out.println("Process ID not found: " + processID);
    }



    // Simulate Round Robin scheduling with a fixed time quantum
    public void roundRobinScheduling(int timeQuantum){
        RoundRobinNode temp=head;
        RoundRobinNode prev=tail;
        RoundRobinNode tester=prev;
        while(totalProcesses!=0){

            temp.burstTime-=timeQuantum;

            if (temp.burstTime <= 0) {

            RoundRobinList.totalTime += temp.burstTime; // Adjust totalTime for the last burst

                temp.initial= totalTime; // Completion time calculation
                System.out.println("Process deleted: " + temp.processId);
               prev.next=temp.next;
               tester=null;
                totalProcesses--;
            }else{

            System.out.println("Process ID: " + temp.processId + ", Current Burst Time: " + temp.burstTime);
            temp = temp.next;
                System.out.println(temp.processId);
           }
            if(tester!=null){
              prev=temp;
            }
            tester=temp;
            temp=temp.next;

            RoundRobinList.totalTime+=timeQuantum;
        }

    }


    public void scheduling(int timeQuantum){
        RoundRobinNode temp=head;
       while(totalProcesses!=0){

            temp.burstTime-=timeQuantum;

            if (temp.burstTime <= 0) {

                RoundRobinList.totalTime += temp.burstTime; // Adjust totalTime for the last burst

                temp.initial = totalTime;
                // Completion time calculation
                System.out.println("Total Time taken :- "+(temp.initial+timeQuantum));
                deleteProcess(temp.processId);
                System.out.println("Process deleted: " + temp.processId);
                totalProcesses--;
            }else{

                System.out.println("Process ID: " + temp.processId + ", Current Burst Time: " + temp.burstTime);
                System.out.println(temp.processId);
            }
           temp=temp.next;

            RoundRobinList.totalTime+=timeQuantum;
        }
    }



    // Display all processes in the circular list

}

