package September14Excersies;

public class TypesOfVariables {

   static String name = "heratDaySix"; //// Class level / static class example
    int values = 120;  //// Class level / static class example

    int instancevar =123;   ////instance variable
    String instanceVariable ="noteBook";
    char lastname ='A';


    public static void main(String[] args) {



        /////// class levee

        System.out.println("name");
        System.out.println("values");
        System.out.println("indicate");

        ////////// instance variable


        TypesOfVariables object= new TypesOfVariables();
        TypesOfVariables obj = new TypesOfVariables();
        TypesOfVariables objOne = new TypesOfVariables();


        System.out.println(object.instancevar);
        System.out.println(obj.instanceVariable);
        System.out.println(objOne.lastname);




    }

   String indicate = "Lal_Mohammad";


}
