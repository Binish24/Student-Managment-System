package TeamExcercise;

import java.sql.SQLOutput;

public class TypesOfVariables {

    ///class variable;
     static String name = " Asadullah Benish";
     static String nameTwo = "Mina Bahamin";


     //// instance variable

    String instance = "Karim";
    int instanceVari = 123;
    double numbers = 123452;



    public static void main (String[] args) {

        ///class/Static level variables examples


        System.out.println(name);
        System.out.println(nameTwo);


        System.out.println(values);
        System.out.println(scores);

        /// instance variable:

        TypesOfVariables obj = new TypesOfVariables();
        System.out.println(obj.instance);

        TypesOfVariables objOne = new TypesOfVariables();
        System.out.println (objOne.instance);

        TypesOfVariables input = new TypesOfVariables();
        System.out.println(input.numbers);

        /// local varibale

        String valueZero = " United State of America!";
        System.out.println(valueZero);

        int scoresOne = 124534;
        System.out.println(scoresOne);

        char valuesval = 'A';
        System.out.println(valuesval);




    }


    static int values = 123;
    static double scores = 13242;

    //////////////////////////////////





}
