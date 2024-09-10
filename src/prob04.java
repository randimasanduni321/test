import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class prob04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
        Collections.sort(numbers, Collections.reverseOrder());


        StringBuilder result = new StringBuilder();
        for (Integer num : numbers) {
            result.append(num);
        }

        System.out.println("The arranged number is: " +  result.toString());
    }
}
