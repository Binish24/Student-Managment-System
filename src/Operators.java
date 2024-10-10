import java.sql.SQLOutput;

public class Operators {

    public static void main(String[] args) {

        int number =10;
        int numberOne =15;
        int numberTwo = 20;

        int result = number + numberOne+ numberTwo;

        System.out.println(10 + 15 + 20);
        System.out.println( number + numberOne+ numberTwo);

        System.out.println("The result of " + numberOne + " + " + numberTwo + " = " + result);

        System.out.println( numberOne + numberTwo + number);

        ///System.out.println(**********************  ******************* ******************);

        /// /String Methods

        String name = " Hello Afghanistan"; /// length

        System.out.println(name.length());

        String value = " Wellcome to Afghanistan";

        System.out.println(value.length());

        ////////////////////////////////////////

        String values = "Hello World"; ///replace
        System.out.println(values.replace("World","Java!"));

        String str = "  I AM LIVING IN AFGHANISTAN!";
        System.out.println(str.replaceAll("I AM LIVING IN AFGHANISTAN","I am living in Afghanistan!"));

        /////////////////////////////////////////////////////////

        String words = " WELLO TO KABUL!";     //////lowerCase
        System.out.println(words.toLowerCase());

        String word = "I AM FROM AFGHANISTAN AND CURRENTLY LIVE IN ALAMEDA CITY!";
        System.out.println(word.toLowerCase());

        ////////////////////////////////

        String nameSix =" i am nabiullah benish, one of the tekschool students!"; //// ToupperCase
        System.out.println(nameSix.toUpperCase());

        String lastName = "this is a book!";
        System.out.println(lastName.toUpperCase());

        ////////////////////////////////////////////////////
        String str2 = " hello world  "; ///////trim
        System.out.println(str2.trim());

        String nickName ="                Gholam             Haider                  !";
        nickName =nickName.trim();
        System.out.println(nickName);

        ///////////////////////////////////




    }



}
