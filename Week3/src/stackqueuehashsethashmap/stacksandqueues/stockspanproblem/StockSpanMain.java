package stackqueuehashsethashmap.stacksandqueues.stockspanproblem;

public class StockSpanMain {
    public static void main(String[] args) {
        StockSpan s=new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};  // Example stock prices
        s.calculate(prices);
        s.display();
    }
}
