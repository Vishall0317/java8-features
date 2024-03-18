import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println(optional);

        String s= null;
        //Returns an Optional with a present value if the specified value is non-null, otherwise an empty Optional
        Optional<String> optional1 = Optional.ofNullable(s);
        System.out.println(optional1.orElse("string s is null"));
        String s1= "VISHAL";
        Optional<String> optional2 = Optional.ofNullable(s1);
        System.out.println(optional2.orElse("string s1 is null"));
        optional2.ifPresent(x->System.out.println(x.toLowerCase()));

        String s3="VISHAL";
        Optional<String> optional3 = Optional.ofNullable(s3);
        System.out.println(optional3.filter(x->x.equals("vi")));
        System.out.println(optional3.filter(x->x.equals("VISHAL")));
        System.out.println(optional3.get());

        String s4= null;
        //Returns an Optional with the value present otherwise Throws NullPointerException – if value is null
        Optional<String> optional4 = Optional.of(s4);
        if(optional4.isPresent()){
            System.out.println(s4.toLowerCase());
        }else{
            System.out.println("string s2 is null");
        }


    }
}
