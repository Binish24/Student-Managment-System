import java.util.ArrayList;

public class homeWorks {


    public static void main(String[] args) {

///1: Convert an Array into Collection in Java
//2: Java Program to Change a Collection to an Array
//3: Java Program to Compare Elements in a Collection


/////////Convert an Array into Collection in Java

      /*  int [] numbers = {5, 10, 15,20, 25,30};

        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();

        for (int number: numbers) {

            numbersArrayList.add(number);
        }
        System.out.println(numbersArrayList);

       */

        /*int [] values = { 10, 20, 30, 40, 50};
        ArrayList<Integer> ArrayListOne = new ArrayList<>();

        for (int value: values) {
            ArrayListOne.add(value);
        }
        System.out.println(ArrayListOne);

         */

       /////Java Program to Change a Collection to an Array


      /*  ArrayList<String> namesOfArrayList = new ArrayList<>();
        namesOfArrayList.add("Tom");
        namesOfArrayList.add("Sam");
        namesOfArrayList.add("Peter");

        String [] namesOfArray = namesOfArrayList.toArray(new String[0]);

        System.out.println(Arrays.toString(nameOfArray));

       */



        ///3: Java Program to Compare Elements in a Collection

        int [] first = { 12, 14, 16, 18, 20};
        int [] second = { 12, 14, 16, 18, 20};

        if (equals(first, second))
            System.out.println("Same array");
        else
            System.out.println("Different arrays");
    }
    public static  boolean equals (int [] a, int [] b) {
        if ( a.length != b.length)
            return false;
        for (int i =0; i < a.length; i++) {
            if (a[i] != b[i]) ;
            return false;
        }
            return true;

        }


}


