public class immutableStrings {


    public static void main(String[] args) {


        String name = "John";
       /// name= "Lerry";
        String anotherName = "John";
        String aThirdName = new String("John");

        System.out.println(name);
        System.out.println(name==anotherName);

        System.out.println(name==aThirdName);



    }
}
