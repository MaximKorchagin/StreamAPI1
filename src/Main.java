import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();

        for (Integer list : intList) {
            if (list > 0 && list % 2 == 0) {
                sortedList.add(list);
            }
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);

    }
}