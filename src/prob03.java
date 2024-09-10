import java.util.ArrayList;
        import java.util.List;

public class prob03 {


    public static List<Long> generateFibonacci(int n) {
        List<Long> fibonacciList = new ArrayList<>();

        fibonacciList.add(0L);
        if (n > 1) {
            fibonacciList.add(1L);
        }

        for (int i = 2; i < n; i++) {
            long nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }

        return fibonacciList;
    }

    public static void main(String[] args) {

        List<Long> fibonacciNumbers = generateFibonacci(100);
        for (int i = 0; i < fibonacciNumbers.size(); i++) {
            System.out.println("Fibonacci " + (i + 1) + ": " + fibonacciNumbers.get(i));
        }
    }
}
