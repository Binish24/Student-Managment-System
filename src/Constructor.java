import java.util.Scanner;

public class Constructor {

    public static void main (String [] args){


       // Scanner input = new Scanner( System.in);


        Students obj = new Students(
                "John",
                "Doe",
                20
        );
        Students objTwo = new Students(
                "Mike",
                "Jackson",
                25
        );
        Students objThree = new Students(
                "Helen",
                "Nancy",
                34
        );
        Students objFour = new Students(
                "Habib",
                "Qadir",
                24
        );

        Students objFive = new Students(
                "Maryam",
                "Mohammadi"

        );

       // System.out.println(obj.firstName);
        // System.out.println(obj.lastName);
        // System.out.println(obj.age);

        //System.out.println(objTwo.firstName);
        //System.out.println(objTwo.lastName);
        //System.out.println(objTwo.age);

        //System.out.println(objThree.firstName);
        //System.out.println(objThree.lastName);
        //System.out.println(objThree.age);

        //System.out.println(objFour.firstName);
        //System.out.println(objFour.lastName);
        //System.out.println(objFour.age);

        // This is the short way to print our codes on the console!!!

        obj.printinfo();
        objTwo.printinfo();
        objThree.printinfo();
        objFour.printinfo();
        objFive.printinfo();
    }
}
