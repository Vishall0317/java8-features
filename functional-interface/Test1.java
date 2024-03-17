@FunctionalInterface
interface Welcome{
    void hello();  // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object object);
}

public class Test1 {
    public static void main(String[] args) {
        Welcome welcome = ()-> System.out.println("Hey hii :) ");
        welcome.hello();
        System.out.println(welcome.hashCode());
    }
}
