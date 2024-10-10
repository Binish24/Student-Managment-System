import java.util.TreeSet;

public class WhatIsTreeSet {

    public static void main(String[] args) {



        TreeSet <String> names = new TreeSet<>();

        names.add("Walter");
        names.add("Dick");
        names.add("Kamer");
        names.add("Helen");

        System.out.println(names);

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        for(String name:names) {
            System.out.println(name);
        }



        names.clear();
        System.out.println(names);
        /////////////////////////////////////

        TreeSet <String> values = new TreeSet<>();

        values.add("Nargis");
        values.add("Amina");
        values.add("Khadija");
        values.add("Ali");

        System.out.println(values);

        values.add("Suliman");
        System.out.println(values);

        System.out.println(values.size());
        System.out.println(values.isEmpty());

        for (String value: values) {
            System.out.println(value);
        }

        values.clear();
        System.out.println(values);





    }


}
