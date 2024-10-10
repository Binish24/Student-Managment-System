import java.util.HashMap;

public class WhatIsHashMap {

    public static void main(String[] args) {


        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 123);
        empIds.put("Alex", 1234);
        empIds.put("Tony", 12345);
        empIds.put("Reza", 123456);
        empIds.put("Naqibullah",1234567);

        System.out.println(empIds);

        System.out.println(empIds.get("Alex"));

        System.out.println(empIds.containsKey("Jerry"));

        System.out.println(empIds.containsValue(123));

        empIds.put("John",777);
        System.out.println(empIds);

        empIds.replace("John",777);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve",222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

   ////////////////////////////////////


        HashMap<String, Integer> studentNameAndId = new HashMap<>();

        studentNameAndId.put ("Haroon", 123);
        studentNameAndId.put("Mashaal",234);
        studentNameAndId.put("Kabir", 345);

        System.out.println(studentNameAndId);

        System.out.println(studentNameAndId.get("Haroon"));
        System.out.println(studentNameAndId.containsValue(123));
        System.out.println(studentNameAndId.containsKey("Alex"));

        studentNameAndId.put("Haroon", 123452);
        System.out.println(studentNameAndId);

        studentNameAndId.replace("Mashaal", 27000);
        System.out.println(studentNameAndId);

        studentNameAndId.putIfAbsent("Steve", 12314412);
        System.out.println(studentNameAndId);

        studentNameAndId.remove("Steve");
        System.out.println(studentNameAndId);

        studentNameAndId.clear();
        System.out.println(studentNameAndId);




    }
}
