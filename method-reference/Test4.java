@FunctionalInterface
interface Messageable{
    public void setMessage(String message);
}

class Message{
    Message(String message) {
        System.out.println(message);
    }
}
public class Test4 {
    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.setMessage("Hello");
    }
}
