public class polymorphismFirstExample {


    public static void main(String[] args) {


        sumOfTwoNumbers(50, 100);
        sumOfThreeNumbers(150, 200, (short) 125);
        sumOfFourNumbers(205, 210, (short) 100, 150);


    }


    public static void sumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sumOfThreeNumbers(int a, int b, short c) {
        System.out.println(a + b + c);


    }

    public static void sumOfFourNumbers(int a, int b, short c, int d) {
        System.out.println(a + b + c + d);


    }

}
