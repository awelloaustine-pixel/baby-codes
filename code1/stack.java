package code1;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> names=new Stack<>();
        names.push("Awello");
        names.push("Austine");
        names.push("Haaland");

        System.out.println(names);
        names.pop();
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.search("Awello"));
        System.out.println(names.isEmpty());

        while (!names.isEmpty()) {
            System.out.println(names.pop());
            
        }
    }

}
