
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class  prob02 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<Object> result = interleave(list1, list2);
        System.out.println(result);
    }

    public static List<Object> interleave(List<String> list1, List<Integer> list2) {
        List<Object> interleaved = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            interleaved.add(list1.get(i));
            interleaved.add(list2.get(i));
        }

        return interleaved;
    } }
