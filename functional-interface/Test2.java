//@FunctionalInterface
//interface MyFunctionalInterface {
//    void abstractMethod();
//    default void defaultMethod() {
//        System.out.println("Default method implementation");
//    }
//    static void staticMethod() {
//        System.out.println("Static method implementation");
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//        MyFunctionalInterface fi = ()->
//                System.out.println("Abstarct method implementation");
//        fi.abstractMethod();
//        fi.defaultMethod();
//        MyFunctionalInterface.staticMethod();
//    }
//}