import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

class Employee{
    private String name;
    private Integer age;
    private String city;
    private Integer salary;

    public Employee(String name, Integer age, String city, Integer salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public Integer getSalary() {
        return salary;
    }
}

public class Test4 {
    public static void main(String[] args) {
        //terminal operations

//
//        List<Integer> list = Arrays.asList(1, 1, 3, 3, 2, 2, 6, 3, 0);
//
//        List<Integer> collectedList = list.stream().collect(Collectors.toList());
//        System.out.println(collectedList);
//
//        Set<Integer> set = list.stream().collect(Collectors.toSet());
//        System.out.println(set);

//        List<Employee> employees = Arrays.asList(
//                new Employee("ram", 27, "culcutta"),
//                new Employee("shyam", 28, "delhi"),
//                new Employee("baburao", 45, "mumbai"));
//        Map<String, Integer> map = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
//        System.out.println(map);

//        List<Employee> employees = Arrays.asList(
//                new Employee("baburao", 45, "mumbai", 4500),
//                new Employee("ram", 27, "kalkatta", 0),
//                new Employee("shyam", 25, "jaipur", 1000),
//                new Employee("sam", 25, "delhi", 1000));
//        employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge).thenComparing(Employee::getCity))
//                .forEach(x-> System.out.println(x.getName()+" : "+ x.getAge()+" : "+ x.getCity()+" : "+x.getSalary()));
//        List<Employee> e = employees.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge).thenComparing(Employee::getCity))
//                .toList();



        Map<String, Integer> map = new HashMap<>();
        map.put("baburao", 45);
        map.put("ram", 27);
        map.put("shyam", 25);
        map.put("sam", 25);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x-> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println(sortedMap);
        Map<String, Integer> sortedMap1 = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->sortedMap1.put(x.getKey(), x.getValue()));
        System.out.println(sortedMap1);
        Map<String, Integer> sortedMap2 = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey())).forEachOrdered(x->sortedMap2.put(x.getKey(), x.getValue()));
        System.out.println(sortedMap2);



//        map.entrySet().stream().sorted(
//                .thenComparing(Map.Entry.comparingByKey()))
//
//        LinkedHashMap<String, Integer> sortedMap2 =  map.entrySet().stream().sorted(Map.Entry.comparingByValue()
//                        .thenComparing(Map.Entry.comparingByKey())).collect(Collectors.toMap())
//
//        LinkedHashMap<String, Integer> sortedMap1 = map.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .collect(
//                        LinkedHashMap::new, // Supplier for the collector: creates a new LinkedHashMap
//                        (m, n) -> m.put(n.getKey(), n.getValue()), // Accumulator: puts each entry into the map
//                        LinkedHashMap::putAll // Combiner: combines the maps in case of parallel streams (not used here)
//                );



//
//        List<String> names = Arrays.asList("ram", null, "shyam", "baburao", null);
//        String result = names.stream().filter(Objects::nonNull).collect(Collectors.joining("-"));
//        System.out.println(result);
    }
}
