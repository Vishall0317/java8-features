interface MyInterface {
    default void defaultMethod(){
        System.out.println("Default method implementation");
    }
    int hashCode();
}

@FunctionalInterface
interface MyFunctionalInterface extends MyInterface {
    void abstractMethod();
}

public class Test3 {
    public static void main(String[] args) {
        MyFunctionalInterface fi = ()->
                System.out.println("Abstarct method implementation");
        fi.abstractMethod();
        System.out.println(fi.hashCode());
    }
}
