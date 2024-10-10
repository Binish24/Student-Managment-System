import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class WhatIsLinkedHashSet {


    public static void main (String []  args) {

        LinkedHashSet <String> names = new LinkedHashSet<>();

        names.add("Mohammad");
        names.add("Ahmad");
        names.add("Nabiullah");
        names.add("Najibullah");

        System.out.println(names);

        System.out.println(names.size());
        System.out.println(names.contains("Habibullah"));
        System.out.println(names.isEmpty());

        names.remove("Ahmad");
        System.out.println(names);

        for (String name: names) {
            System.out.println(name);
        }

        names.clear();
        System.out.println(names);
        ////////////////////////////


        LinkedHashSet<String> values = new LinkedHashSet<>();

        values.add("James");
        values.add("Obama");
        values.add("David");
        values.add("Zaman");
        values.add("Mitra");

        System.out.println(values);

        System.out.println(values.size());
        System.out.println(values.isEmpty());
        System.out.println(values.contains("Alex"));

        values.remove("Zaman");
        System.out.println(values);

        for (String value:values) {
            System.out.println(value);
        }

        values.clear();
        System.out.println(values);




    }
}
