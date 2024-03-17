import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 3, 3, 2, 2, 6, 3, 0);

        //intermediate operations
        List<Integer> sortedlist = list.stream().sorted().toList();
        System.out.println(sortedlist);

        List<Integer> evenList = list.stream().filter(x->x%2==0).toList();
        System.out.println(evenList);

        List<Integer> evenSquaresList = list.stream().map(x-> x*x).toList();
        System.out.println(evenSquaresList);

        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.println(distinctList);

        List<Integer> skippedList = list.stream().skip(3).toList();
        System.out.println(skippedList);

        List<Integer> limitedList = list.stream().limit(2).toList();
        System.out.println(limitedList);

    }
}
