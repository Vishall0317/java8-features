import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }
}
public class Test2 {
    public static void main(String[] args) {
        // BiFunction<T, U, R> <T> – the type of the first argument to the function <U> – the type of the second argument to the function <R> – the type of the result of the function
        BiFunction<Integer, Integer, Integer> addition = Arithmetic::add;
        BiFunction<Double, Double, Double> addition1 = Arithmetic::add;
        System.out.println(addition.apply(2, 5));
        System.out.println(addition1.apply(2.3, 5.4));
    }
}
