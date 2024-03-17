import java.util.Arrays;
import java.util.List;

class Person{
    String name;
    List<Long> phoneNo;

    Person (String name, Long... phoneNo){
        this.name=name;
        this.phoneNo= Arrays.asList(phoneNo);
    }
}
public class Test2 {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(5, 6, 7), Arrays.asList(2, 1, 3), Arrays.asList(3, 5, 0));
        List<Integer> flattenedList = nestedList.stream().flatMap(List::stream).toList();
        System.out.println("flattenedList: "+flattenedList);
        List<Integer> sortedFlattenedList = nestedList.stream().flatMap(List::stream).sorted().toList();
        System.out.println("sortedFlattenedList: "+sortedFlattenedList);

        List<Person> persons = Arrays.asList(new Person("ram", 9087897899L, 9089076540L),
                new Person("shyam", 8978900890L, 7897897890L),
                new Person("baburao", 8888888888L, 9999887890L));
        List<Long> phoneNos= persons.stream().flatMap(person -> person.phoneNo.stream()).toList();
        System.out.println(phoneNos);
    }
}
