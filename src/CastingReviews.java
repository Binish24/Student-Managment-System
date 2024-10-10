import java.sql.SQLOutput;

public class CastingReviews {


    public static void main (String [] args) {

        int intNumber = 10;
        int intNumberTwo =20;

        System.out.println(intNumber);
        System.out.println(intNumberTwo);

        System.out.println(intNumber + intNumberTwo);

        double doubleNumber = 20.0;
        float floatNumber = 50f;

        System.out.println(doubleNumber);
        System.out.println(floatNumber);

        int intNumberThree = (int) 10.0;
        int intNumberFour = (int) 20.5F;

        System.out.println(intNumberThree);
        System.out.println(intNumberFour);

    }
}
