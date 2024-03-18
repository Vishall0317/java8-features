import java.util.HashMap;

class Customer{
    String name;
    Integer age;
    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
public class Test3 {
    public static void main(String[] args) {
       Customer customer = new Customer("vishal", 24);
       Customer customer1 = new Customer("vishal", 24);
       Customer customer2 = new Customer("vishal", 24);

        HashMap<Customer, Integer> hashMap = new HashMap<>();
        hashMap.put(customer, 1);
        hashMap.put(customer1, 2);
        hashMap.put(customer2, 3);

        System.out.println(hashMap);

    }
}
