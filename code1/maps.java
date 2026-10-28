package code1;
import java.util.Map;
import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        Map <String,Integer> m=new HashMap<>();
        //Adding elements to a Map
        m.put("Awello",1);
        m.put("Austine",5);
        m.put("Braut",9);

        System.out.println("Initial map elements "+m);

        //Changing elements in a map
        m.put("Austine",7);
        System.out.println("Updated map elements "+m);

        //Iterating through the map
        for(String i:m.keySet()){
            System.out.println(i +""+ m.get(i));
        }

        //Removing elements from a map
        m.remove("Braut");
        System.out.println("Updated Map Elements "+m);
    }

}
