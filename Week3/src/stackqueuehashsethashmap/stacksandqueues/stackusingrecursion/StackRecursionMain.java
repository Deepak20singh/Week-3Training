package stackqueuehashsethashmap.stacksandqueues.stackusingrecursion;

public class StackRecursionMain {
    public static void main(String[] args) {
       StackImplementRecursion stack=new StackImplementRecursion();

       stack.recursive(20);
        stack.recursive(30);
        stack.recursive(10);
        stack.recursive(60);
        stack.recursive(90);

        stack.display();

    }
}
