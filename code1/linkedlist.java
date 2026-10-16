package code1;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();
        num.add(12);
        num.add(34);
        num.add(56);
        System.out.println("This is the initial LinkedList; "+num);

        num.addFirst(67);
        num.addLast(89);
        num.set(3,48);
        num.remove(4);
        System.out.println("The new LinkedList; "+num);

        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }
        System.out.println("The first element is: " + num.getFirst());
        System.out.println("The last element is: "+num.getLast());
        System.out.println("The size of the LinkedList is :"+num.size());
        System.out.println("Does the LinkedList contain 57? "+num.contains(57));
        System.out.println("The first occurance of 48 is at index: "+num.indexOf(48));
    }

}
