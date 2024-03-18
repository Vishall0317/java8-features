import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class CustomeException extends Exception{
    private static final long serialVersionUID = 1L;
    public CustomeException(String message){
        super(message);
    }
}
class Employee{
    String name;
    Integer age;
    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test2 {
    public static void main(String[] args) throws CustomeException {
        System.out.println("hi");

        List<Employee> employees = null;
//        Optional<List<Employee>> optional = Optional.ofNullable(employees);
//        List<Employee> result = optional.orElseThrow(()->new CustomeException("list is empty"));
//        System.out.println(result);
        employees = Arrays.asList(new Employee("vishal", 24),
                new Employee("raju", 25));
        Optional<List<Employee>> optional1 = Optional.ofNullable(employees);
        List<Employee> result1 = optional1.orElseThrow(()->new CustomeException("list is empty"));
        System.out.println(result1);


    }
}
