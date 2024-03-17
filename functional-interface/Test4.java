import java.util.function.*;

public class Test4 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = age-> age>18;
        System.out.println("eligible for vote: "+ predicate.test(12));

        Consumer<String> consumer = (name)->System.out.println("hello "+name);
        consumer.accept("vishal");

        BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name+ " : "+age);
        biConsumer.accept("vishal", 24);

        Supplier<Double> supplier = ()-> Math.random()*100;
        System.out.println(supplier.get());

        Function<String, String> function = (name)-> "hello "+ name;
        System.out.println(function.apply("vishal"));

        BiFunction<String, String, String> biFunction = (s1, s2)-> s1+" "+s2;
        System.out.println(biFunction.apply("hello", "vishal"));
    }
}
