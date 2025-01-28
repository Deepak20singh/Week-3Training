package linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentListCode {
    private StudentNode head;
    //add at front

    public void addBegining(int age,int rollNumber,String name,String grade){
        StudentNode newStudent=new StudentNode(rollNumber,age,name,grade);
        newStudent.next=head;
        head=newStudent;

    }
    public void addEnd(int age,int rollNumber,String name,String grade){
        StudentNode newStudent=new StudentNode(rollNumber,age,name,grade);
        if(head==null){
            head=newStudent;
            newStudent.next =null;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newStudent;


    }
    public void addBetween(int age,int rollNumber,String name,String grade,int position){
        if (position == 1) {
            addBegining( age, rollNumber,name,grade);
            return;
        }
        StudentNode newStudent=new StudentNode(rollNumber,age,name,grade);
        StudentNode temp=head;
          for(int i=0;i<position&&temp!=null;i++){
           temp=temp.next;
       }
        if (temp == null) {
            System.out.println("Position is more than the number of elements.");
            return;
        }
        newStudent.next=temp.next;
        temp.next=newStudent;


        }

    public void search(int rollnumber){
        StudentNode temp=head;
        while(temp.rollNumber!=rollnumber){
            temp=temp.next;
        }
        System.out.println("Result for searchByDirector :- "+"Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);


    }
    public void update(int rollnumber,String grade){
        StudentNode temp=head;
        while(temp.rollNumber!=rollnumber){
            temp=temp.next;
        }
        temp.grade=grade;
    }
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }

    }
    public void delete(int rollNumber){
        if (head == null) {
            System.out.println("No student present.");
             }

        if (head.rollNumber == rollNumber) {
            head = head.next;
         }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
            }
        temp.next = temp.next.next;
    }

    }

    

