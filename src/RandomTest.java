import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        //    Random random = new Random();
//       String[] studentNames = { "narges", "mansoor", "faridullah", "stephanie", "Alyzabeth", "fasiha" };
//
//        int randomStudent = random.nextInt(studentNames.length);
//        System.out.println( studentNames[randomStudent] );


        Random random = new Random();

        String [] studentNames = {"Nargis", "Mansoor", "Najibullah", "Alex", "Helen", "Mike"};

        int randomStudent = random.nextInt(studentNames.length);
        System.out.println(studentNames[randomStudent]);



    }
}
