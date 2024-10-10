public class Students {

    public String firstName;
    public String lastName;
    int age;


    Students (String firstName, String lastName, int age) {

        this. firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

     /// this is called overloading, by this method we can remove or ignore to add some information for the next people!
    Students (String firstName, String lastName) {

        this. firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


    ///one of the easiest way and we can deleght long coding on the Constructor class

    public void printinfo() {

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

    }
}
