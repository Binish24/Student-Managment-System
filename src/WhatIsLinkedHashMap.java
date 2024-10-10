import java.util.LinkedHashMap;

public class WhatIsLinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap <String,String> dictionary = new LinkedHashMap<>();

        dictionary.put("Book", "there are different of Books which come through the research or thought or...");
        dictionary.put("Pen", "something that human beings record and write some event throuth it...");
        dictionary.put("NoteBook", "it allows that human being noted...");
        dictionary.put("Board", "there are different of Books which come through the research or thought or...");

        dictionary.put("Pencil", "we write something on the notebook");

        System.out.println(dictionary.keySet());

      dictionary.remove("Board");
        System.out.println(dictionary);

        dictionary.isEmpty();
        System.out.println(dictionary);


        for (String word:dictionary.keySet()) {
            System.out.println(word);
        }

        ////////////////////

        LinkedHashMap<String, Integer> fruitsPrices = new LinkedHashMap<>();

        fruitsPrices.put ("Apple", 50);
        fruitsPrices.put ("Orange", 100);
        fruitsPrices.put ("Mango", 150);
        fruitsPrices.put ("Carrot", 200);
        fruitsPrices.put ("Banana", 250);

        System.out.println(fruitsPrices);

       int applePrice = fruitsPrices.get("Apple");
       int mangoPrice =fruitsPrices.get("Mango");
       int carrotPrice = fruitsPrices.get("Carrot");
       int bananaPrice = fruitsPrices.get("Banana");

        System.out.println("Price of Apple: " + applePrice);
        System.out.println("Price of Mango: " + mangoPrice);
        System.out.println("Price of Carrot: " + carrotPrice);
        System.out.println("Price of Banana: " + bananaPrice);

        fruitsPrices.get("Banana");
        System.out.println("Banana");
        System.out.println(fruitsPrices.size());
        System.out.println(fruitsPrices.keySet());
        System.out.println(fruitsPrices.containsValue("Melon"));
        System.out.println(fruitsPrices.containsValue("Orange"));
        System.out.println(fruitsPrices.containsValue(150));
        fruitsPrices.remove("Banana");
        System.out.println(fruitsPrices);
        /////////////////

        LinkedHashMap<String, Integer> studentNameAndId = new LinkedHashMap<>();

        studentNameAndId.put("Qadir", 01);
        studentNameAndId.put("Nazanin", 02);
        studentNameAndId.put("Zahir", 03);

        System.out.println(studentNameAndId);

        studentNameAndId.put("Rafiq",04);

        System.out.println(studentNameAndId);

        System.out.println(studentNameAndId.containsValue(01));
        System.out.println(studentNameAndId.keySet());
        System.out.println(studentNameAndId.size());
        System.out.println(studentNameAndId.values());
        System.out.println(studentNameAndId.isEmpty());
        System.out.println(studentNameAndId.containsKey("Zahir"));

       // for (LinkedHashMap detials:studentNameAndId) {
         //   System.out.println(detials);
       // }



    }




}
