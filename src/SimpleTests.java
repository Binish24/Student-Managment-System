public class SimpleTests {


    public static void main(String[] args) {

        String name;
        String lastName;
        String details;


        name="Mike";
        lastName=" Jackson";
        details=" from the United State of America!";

        byte number;
        short numberOne;
        int numberTwo;
        long numberThree;

        number = 100;
        numberOne=3100;
        numberTwo= 100000;
        numberThree=1000000;

        System.out.println(number + numberOne + numberTwo + numberThree);


        System.out.println( name + lastName + details);

        /////////////////////////////////////////////

        //narrowing casting  ///lose data
        // double -> int

        double x = 10.100;
        int y = (int) x;

        System.out.println(y);


       // widening casting (converting a small number of amount to a large number of amount without losing any values or amount!) //no lose data
        // int -> long

        int xx = 100;
        double yy = x;



        System.out.println(xx);
        System.out.println(yy);

        ///////

        /* Operators / Arithmetic Op. ( +, -, *, /, %, ++, --)
        // Assignment
         */
    }





}
