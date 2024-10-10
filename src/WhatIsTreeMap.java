import java.util.TreeMap;

public class WhatIsTreeMap {

    public static void main (String [] args){


        TreeMap<String, String>  friutPrices = new TreeMap<>();

        friutPrices.put("Peach", "American");
        friutPrices.put("Cherry","France");
        friutPrices.put("Brine", "Germany");

        System.out.println(friutPrices);

        String peachValue = friutPrices.get("Peach");
        System.out.println("Value of Peach: " + peachValue);

        System.out.println(friutPrices.entrySet());
        System.out.println(friutPrices.keySet());
        System.out.println(friutPrices.firstEntry());
        System.out.println(friutPrices.lastEntry());
        System.out.println(friutPrices.comparator());
        System.out.println(friutPrices.navigableKeySet());
        System.out.println(friutPrices.values());
        System.out.println(friutPrices.containsKey("Cherry"));
        System.out.println(friutPrices.containsValue("Itlay"));
      ////////////////////////////////////

        TreeMap<String, Integer> listOfPetiants = new TreeMap<>();

        listOfPetiants.put("Nargis", 1212);
        listOfPetiants.put("Nadir", 1313);
        listOfPetiants.put("Naghma", 1414);

        System.out.println(listOfPetiants);
        System.out.println(listOfPetiants.keySet());
        System.out.println(listOfPetiants.values());
        System.out.println(listOfPetiants.navigableKeySet());

        listOfPetiants.remove("Nadir",1313);
        System.out.println(listOfPetiants);

        String firstKey =((TreeMap<String,Integer>) listOfPetiants).firstKey();

        System.out.println("First key: " + firstKey);




    }




}
