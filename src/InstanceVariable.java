import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class InstanceVariable {

    String middleName = "Mike";
    byte scores = 40;
    String gender= "male";
    static short salary = 30000;
    static int yearIncome;
    static byte familymembers= 15;


    public static void main(String[] args) {


        /* String firstName;
        String lastName;
        byte age;
        firstName= "Nabiullah";
        lastName= "Benish";
        age = 39;

        InstanceVariable obj =new InstanceVariable();
        var objOne = new InstanceVariable();
        InstanceVariable objTwo = new InstanceVariable();

        System.out.println(objOne.scores);
        System.out.println(obj.middleName);
        System.out.println(objTwo.gender);
        System.out.println(salary);
        System.out.println(yearIncome);
        System.out.println(familymembers);

        System.out.println("firstName " + " lastName" +" age");


        byte values = 124;

        System.out.println("minimum value for byte:"+ Byte.MAX_VALUE);
        System.out.println( Byte.MAX_VALUE);
        System.out.println( Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        byte byteNumber;

        System.out.println("Print the minimum size of the byte:" + Byte.MIN_VALUE);
        System.out.println("Maximum value for byte:" + Byte.MAX_VALUE);

        short shortNumber;

        System.out.println("Print the minimum range of the Short:" + Short.MIN_VALUE);
        System.out.println("Pring the maximum range of the Short:" +Short.MAX_VALUE);

        int intNumber;

        System.out.println("Print the large size of the int:" + Integer.MIN_VALUE);
        System.out.println("Print the small size of the int:" + Integer.MAX_VALUE);

        long longNumber;

        System.out.println("Enter the smallest size of the long:" +Long.MIN_VALUE);
        System.out.println("Enter the biggest size of the long:" + Long.MAX_VALUE);

        float floatNumber;

        System.out.println("Print the smallest size of the float:" + Float.MIN_VALUE);
        System.out.println("Print the biggest size of the float:" + Float.MAX_VALUE);


        double doubleNumber;

        System.out.println("Print the smallest size of the double:" + Double.MIN_VALUE);
        System.out.println("Print the biggest size of the double:" + Double.MAX_VALUE);

        char charater = 'A';


        System.out.println(charater);
        System.out.println();
         */


        int number = 10;

        int [] numbers = new int[2];

        numbers [0] = 10;
        numbers [1] = 20;

        System.out.println(Arrays.toString(numbers));

        System.out.println( numbers [0]);
        System.out.println( numbers [1]);

        ////

        int element = 20;

        int [] elements = new int[3];

        elements [0] =10;
        elements [1] =20;
        elements [2] =30;

        System.out.println(Arrays.toString(elements));


        int member = 124;

        int [] members = new int[3];

        members [0]= 150;
        members [1] =250;
        members [2] =350;

        System.out.println(Arrays.toString(members));

        System.out.println(members [0]);
        System.out.println(members [1]);
        System.out.println(members [2]);

        ////

        String lastName;
        lastName="Steve";

        System.out.println(lastName.charAt(0) );
        System.out.println(lastName.charAt(1) );
        System.out.println(lastName.charAt(2) );
        System.out.println(lastName.charAt(3) );
        System.out.println(lastName.charAt(4) );


        String mood = "Nazifullah";

        System.out.println(mood.charAt(0));
        System.out.println(mood.charAt(1));
        System.out.println(mood.charAt(2));
        System.out.println(mood.charAt(3));
        System.out.println(mood.charAt(4));
        System.out.println(mood.charAt(5));
        System.out.println(mood.charAt(6));
        System.out.println(mood.charAt(7));
        System.out.println(mood.charAt(8));
        System.out.println(mood.charAt(9));


        int value = 10;

        System.out.println(value);


        String name = "Tony";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        String message = "            I am Nabiullah Benish, from Afghanistan!                 ";
        String Book = "            i live in the United States of America!!!           ";

        String BookTwo= "Mike";



        System.out.println(message.trim() );
        System.out.println(Book.trim());

        System.out.println(BookTwo.charAt(3));
        System.out.println(BookTwo.charAt(1));
        System.out.println(BookTwo.toUpperCase());
        System.out.println(message.toUpperCase());
        System.out.println(Book.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(BookTwo.toLowerCase());
        System.out.println(message.replace('N','A'));
        System.out.println(Book.replace('U','D'));
        System.out.println(BookTwo.replaceAll("Mike","Mohammad"));
        System.out.println(BookTwo.replaceAll("Mike","Hamahang"));


        ///////

        int XX = 1;

        while (XX <= 10) {
            System.out.println(XX);
            //XX = XX + 1;
            XX++;

        }


        ArrayList < String> newStafflist = new ArrayList<>();

        newStafflist. add("Mohammad");
        newStafflist. add("Mike");
        newStafflist. add("Steve");
        newStafflist. add("Nancy");

        System.out.println(newStafflist);

        //////////////////

        int C = 1;

        while (C <= 10 );
        {
            System.out.println(C);
            C=C +1;
        }












    }












}
