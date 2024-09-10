
import java.util.List;

public class recursion {
    public static int computeSum(List<Integer> numbers, int index) {
        // Base case: if the index is out of bounds, return 0
        if (index == numbers.size()) {
            return 0;
        }

        // Recursive case: add the current element and recursively sum the rest
        return numbers.get(index) + computeSum(numbers, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = computeSum(numbers, 0);
        System.out.println("Sum: " + sum);
    }
}

