import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        //terminal operations
        List<String> names = Arrays.asList("ram", null, "shyam", "baburao", null);
        String result = names.stream().filter(Objects::nonNull).collect(Collectors.joining("-"));
        System.out.println(result);



//        list.stream().filter(x-> x%2==0).forEach(x->System.out.print(x+" "));
//        list.stream().filter(x-> x%2==0).forEach(System.out::print);
//
//        String result1 = names.stream().filter(Objects::nonNull).reduce("", (s1, s2)-> s1+s2);
//        System.out.println(result1);
//
//
//        int sum = list.stream().reduce(0, Integer::sum);
//        System.out.println(sum);
//        int sum0 = list.stream().reduce(2, (a, b)->a+b);
//        System.out.println(sum0);
////        int max = list.stream().reduce(Integer.MIN_VALUE, (a, b)->Math.max(a, b));
////        System.out.println(max);
////        int min = list.stream().reduce(Integer.MAX_VALUE, (a, b)->Math.min(a, b));
////        System.out.println(min);
//        int avg = list.stream().reduce(0, (a, b)-> a+b)/list.size();
//        System.out.println(avg);
//
//
//
//        int sum1 = list.stream().collect(Collectors.summingInt(Integer::intValue));
//        System.out.println(sum1);
//        int sum2 = list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum2);
//
//        long count = list.stream().count();
//        System.out.println(count);
//
//        Optional<Integer> max = list.stream().max(Integer::compareTo);
//        System.out.println(max.orElse(null));
//        Optional<Integer> min = list.stream().min(Integer::compareTo);
//        System.out.println(min.orElse(null));
//
//        boolean result11 = list.stream().anyMatch(x-> x>5);
//        System.out.println(result11);



    }
}
