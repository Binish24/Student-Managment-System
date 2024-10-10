import java.util.HashSet;

public class WhatIsHashSet {

    public static void main(String[] args) {



        HashSet <String> names = new HashSet <>();

        names.add("Tony");
        names.add("Sam");
        names.add("Walter");

        System.out.println(names);

     //   names.remove("Walter");
       // System.out.println(names);


        System.out.println(names.size());
        System.out.println(names.contains("Tony"));
        System.out.println(names.isEmpty());
       // System.out.println(names.remove("Tony"));


      //  names.clear();
       // System.out.println(names);

        for (String name: names) {
            System.out.println(name);

        }

        HashSet<String> values = new HashSet<>();

        values. add ("Eric");
        values.add("Alex");
        values.add("Hamid");
        values.add("Mina");
        values.add("Reza");

        System.out.println(values);
        System.out.println(values.size());
        System.out.println(values.contains("Mike"));
        System.out.println(values.isEmpty());

        values.remove("Alex");
        System.out.println(values);

        System.out.println(values.size());

        for (String value: values) {
            System.out.println(value);
        }

       values.clear();
        System.out.println(values);






    }





}
