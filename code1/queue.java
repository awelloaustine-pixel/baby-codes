package code1;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
        num.add(30);
        num.add(50);
        num.add(70);
        System.out.println(num);

        System.out.println("The front element is: "+num.peek());
        System.out.println("The size of num is: "+num.size());

        num.remove(50);
        System.out.println("The new queue is: "+num);
        System.out.println("Is the queue empty? "+num.isEmpty());
        
    }

}
