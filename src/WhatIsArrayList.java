import java.util.ArrayList;

public class WhatIsArrayList {


        public static void main(String[] args) {


   ArrayList <String> fruits = new ArrayList<>();

//Adding of elements

        fruits.add("BANNA");
        fruits.add("Brine");
        fruits.add("Peach");
        fruits.add("Grape");
        fruits.add("Apple");


        fruits.add(1,"ANNAS");
        fruits.add(4,"MELON");
        System.out.println(fruits);


////Acceesing and element by index

        System.out.println(fruits.get(1));
        System.out.println(fruits.get(4));
        System.out.println(fruits.get(3));

        ///REMOVING AN Element

        fruits.remove(0);
        fruits.remove(1);
        System.out.println(fruits);
        System.out.println(fruits);

        for (String fruit:fruits) {
        System.out.println(fruit);

        }

}
}

