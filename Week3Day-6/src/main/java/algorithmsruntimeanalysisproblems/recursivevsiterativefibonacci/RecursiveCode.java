package algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci;

public class RecursiveCode {

    public static int recursiveFibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }
}
