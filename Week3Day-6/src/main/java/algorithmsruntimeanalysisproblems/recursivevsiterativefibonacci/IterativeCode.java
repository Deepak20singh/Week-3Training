package algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci;

public class IterativeCode {
    public static int fiboIterative(int n) {
         if (n == 1) return 0;
        if (n == 2) return 1;
        int start = 0;
        int next = 1;
        int current=0;
        if (n > 2) {
            for (int i = 2; i <=n; i++) {
                 current = start + next;
                 start = next;
                 next = current;

            }
        }

    return current;}
}
