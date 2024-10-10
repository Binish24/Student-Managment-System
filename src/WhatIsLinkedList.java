import java.util.LinkedList;

public class WhatIsLinkedList {


    public static void main(String[] args) {


       /* LinkedList<String> nameOfLinkedList =new LinkedList<>();

        nameOfLinkedList.add("John");
        nameOfLinkedList.add("Alex");
        nameOfLinkedList.add("Tony");
        nameOfLinkedList.add("Nazari");
        nameOfLinkedList.add("Samim");

        System.out.println(nameOfLinkedList);


        ///ADDING ELEMENTS

        nameOfLinkedList.add(1,"Helen");
        nameOfLinkedList.add(5,"Hala");

        System.out.println(nameOfLinkedList);

        ////ACESSING AN ELEMENT BY INDEX

        System.out.println(nameOfLinkedList.get(5));
        System.out.println(nameOfLinkedList.get(0));
        System.out.println(nameOfLinkedList.get(3));


        ///REMOVING AN Element

        System.out.println(nameOfLinkedList.size());


        ////But there is no removing option

        */


        LinkedList<String> values = new LinkedList<>();

        values.add("family");
        values.add("food");
        values.add("cloths");
        values.add("socity");
        values.add("Culture");

        System.out.println(values);

        ///Adding more element

        values.add(1,"water");
        values.add(4,"security");

        System.out.println(values);

        ///Accessing an element by index

        System.out.println(values.get(1));
        System.out.println(values.get(3));
        System.out.println(values.get(5));

        for (String value: values) {
            System.out.println(value);
        }



    }
}