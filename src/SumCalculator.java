import java.util.List;

public class SumCalculator {
    public static int computeSum(List<Integer> numbers) {
        int sum = 0;
        int i = 0;

        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = computeSum(numbers);
        System.out.println("Sum: " + sum);
    }
}

