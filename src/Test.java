import java.util.ArrayList;
import java.util.LinkedList;


public class Test {



    public static void main(String[] args) {


        LinkedList<String>  nameLinkedList  = new LinkedList < > ();

        nameLinkedList.add("Mike");
        nameLinkedList.add("John");
        nameLinkedList.add("Tony");
        nameLinkedList.add("Sam");
        nameLinkedList.add("Alex");

        System.out.println(nameLinkedList.get(2));
        System.out.println(nameLinkedList.get(0));


        ArrayList <String> nameArrayList = new ArrayList<>();

        nameArrayList.add("Mike");
        nameArrayList.add("John");
        nameArrayList.add("Tony");
        nameArrayList.add("Sam");
        nameArrayList.add("Alex");

        System.out.println(nameArrayList.get(4));
        System.out.println(nameArrayList.get(3));
        System.out.println(nameArrayList.get(0));







    }




}
