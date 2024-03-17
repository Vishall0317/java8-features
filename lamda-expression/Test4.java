@FunctionalInterface
interface Addition{
    public int add(int a, int b);
}

public class Test4 {
    public static void main(String[] args) {
        Addition addition1 = (x, y)->{ return (x+y);};
        System.out.println(addition1.add(4, 5));
    }
}
