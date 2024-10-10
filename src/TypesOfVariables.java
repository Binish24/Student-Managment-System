import java.sql.SQLOutput;

public class TypesOfVariables {

    static String name ="Ahmad"; ////////Static Variables
    static int number= 12000;
    static String province;
    static String countryName;
    static int population;
    /////////////

    String meddileName= "Karim"; ///////Instance Variables
    int scores= 1225;

    String message= " Hello Afghanistan";
    int numberOne= 1999;

    String studentName= "Mike";
    int studentId= 590;

    String nameOfUniversity= "HeratUniversity";
    int numberOfStudent= 125000;

    String nameOfSchool="TekSchool";
    int numberOfTeachers= 123;



    public static void main(String[] args) {

        System.out.println(name); //////Static Variables Examples
        System.out.println(number);
        lastName="Benish";
        System.out.println(lastName);
        value=200;
        System.out.println(value);

        province="Badghis";
        age=45;

        System.out.println(province);
        System.out.println(age);

        countryName="Afghanistan";
        population= 35000000;

        System.out.println(countryName);


        ////////////////Static Variables Examples

        TypesOfVariables obj = new TypesOfVariables();
        System.out.println(obj.meddileName);

        TypesOfVariables objTwo = new TypesOfVariables();
        System.out.println(objTwo.scores);

        TypesOfVariables objThree = new TypesOfVariables();
        System.out.println(objThree.message);

        TypesOfVariables objFour = new TypesOfVariables();
        System.out.println(objFour.numberOne);

        TypesOfVariables objA = new TypesOfVariables();
        System.out.println(objA.studentName);

        TypesOfVariables objB= new TypesOfVariables();
        System.out.println(objB.studentId);

        TypesOfVariables objC = new TypesOfVariables();
        System.out.println(objC.nameOfUniversity);

        TypesOfVariables objD = new TypesOfVariables();
        System.out.println(objD.numberOfStudent);

        TypesOfVariables objE = new TypesOfVariables();
        System.out.println(objE.nameOfSchool);

        TypesOfVariables objF= new TypesOfVariables();
        System.out.println(objF.numberOfTeachers);

        ////////Local Variables

        String firstName;
        firstName="Nabiullah Binish";

        int ageTwo;
        ageTwo=39;

        System.out.println(firstName);
        System.out.println(ageTwo);


        String printmessage= "Hello World, Good morning!!!!!!!!!! Wish you all a good day a head!!!!";
        System.out.println(printmessage);







    }

 static String lastName;
    static int value;
    static int age;




}
