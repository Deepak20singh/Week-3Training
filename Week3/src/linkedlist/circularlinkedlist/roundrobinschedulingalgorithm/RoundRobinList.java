package linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

import static linkedlist.circularlinkedlist.roundrobinschedulingalgorithm.RoundRobinNode.*;

public class RoundRobinList {
   
    private int tq=3;

    RoundRobinNode head=null;
    RoundRobinNode temp=null;


    public void addProcess(int processId,int burstTime,int priority){
        RoundRobinNode newRoundRobinNode=new RoundRobinNode(processId,burstTime,priority);

        if(head==null){
            head=newRoundRobinNode;
            temp=newRoundRobinNode;

        }
        else{
            temp.next=newRoundRobinNode;
            temp=newRoundRobinNode;
            temp.next=head;
        }

    }
    int time=0;

    public void startProcess(){
        RoundRobinNode tail=head;
        RoundRobinNode prev=temp;
        RoundRobinNode tester=prev;
        int t=counter;
        System.out.println("\nTime Quantum is: "+tq);
        System.out.println("\nStarting the process execution....\n");
        // turn around time


        while(counter!=0){
            time+=(tail.burstTime)-tq;
            tail.burstTime= (tail.burstTime)-tq;

            if(counter==1){
                tail.next=tail;
            }

            if(tail.burstTime<=0){
                // true for temp too as the last tail will get plunge in
                System.out.println("\nDeleting the process: " + tail.processId);
                counter--;
                prev.next = tail.next;

                tester=null;
            }
            else {
                System.out.println("\nProcess Id: " + tail.processId + "\nBurst Time: " +tail.burstTime+"\nPriority: " + tail.priority);
            }
            if(tester!=null){
                prev=tail;
            }
            tester=tail;
            tail=tail.next;


        }
        System.out.println("\nAll processes are executed..........");
        System.out.println("\nTotal Time Taken by process: "+time);
        System.out.println("\nAverage time taken by process: "+(time/t));


    }


}