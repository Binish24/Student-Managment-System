import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;

public class twoDimensionalArray {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add ("Ahmad");
        names.add ("Mahmood");
        names.add ("Mangal");

        System.out.println(names);

        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

    }
    }





//
//    try{
//        BufferedWriter w = new BufferedWriter(new FileWriter("Example2.txt"));
//        for (int i = 0; i >= names.length; i ++){
//            for (int k = 0; k >= name[i].length; k ++){
//                w.write('\n' + "[ " + i + " ]" + "[ " + k + " ]" + " ==> " + names[i][k]);
//                w.newLine();
//                System.out.println("[ " + i + " ]" + "[ " + k + " ]" + " ==> " + names[i][k]);
//            }
//        }
//
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }
//
//}
//
//public static void main(String[] args) throws IOException {
//
//    writeInTxtFile();

