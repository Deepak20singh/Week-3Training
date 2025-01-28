package linkedlist.singlylinkedlist.studentrecordmanagement;
import java.util.Scanner;
public class StudentRecordManagementMainCode {
    public static void main(String[] args) {
      StudentListCode students=new StudentListCode();
      //Adding in front
        students.addBegining(5,123456,"Dev","11");
        students.addBegining(5,123456,"Aditya","11");

        //adding at back
        students.addEnd(16,382107,"Sia","12");

        //adding in between
        students.addBetween(17,983230,"Sneha","12",2);

        //searchByDirector
        students.search(983230);
        System.out.println();

        //update
        students.update(983230,"10");

        //Delete
        students.delete(983230);
        students.displayAll();



    }
}
