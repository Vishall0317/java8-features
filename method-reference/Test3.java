@FunctionalInterface
interface Welcome{
    public void hello();
}

class Greet{
    public void greeting(){
        System.out.println("Good Morning :)");
    }
}

public class Test3 {
    public static void main(String[] args) {
        //Referring non-static method using reference
        Greet greet = new Greet();
        Welcome welcome = greet::greeting;
        welcome.hello();

        //Referring non-static method using anonymous object
        Welcome welcome1 = new Greet()::greeting;
        welcome1.hello();
    }
}
