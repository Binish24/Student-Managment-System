public class Reviewing25_09_2024 {

    public static void main(String[] args) {


        // print the number from 1 to 5

        /// for loop

        // String [] valuesOne = {"Bob", "Tony", "Gabril", "Habib", "Sam"};

        //  for (int index =0; index <valuesOne.length-1; index++) {
        //    System.out.println(valuesOne[index]);
        // }

        // int [] number = new int[10];

        // number [0]=10;
        //number [1]=20;
        //number [2]=30;
        //number [3]=40;
        //number [4]=50;
        //number [5]=60;
        //number [6]=70;
        //number [7]=80;
        //number [8]=90;
        //number [9]=100;

        // for (int input =0; input<=number.length-1; input++) {
        //  System.out.println(number[input]);
        //  }


        // System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        // System.out.println(4);
        //System.out.println(5);


        //  for (int index =1 ; index <=5; index++) {
        // System.out.println(index);


        //  String[] Angel = {" Bob", " Sam", "Dalil", "Shamil"};

        // for (int value = 0; value < 5; value++) {
        //   System.out.println(Angel[0]);
        // }

        //for (int index = 0; index < Angel.length; index++) {
        //   System.out.println(Angel [index]);
        // }
        //for (int input = 0; input <=Angel.length-1; input++) {
        //   System.out.println(Angel [input]);
        // }


        //String [] firstNames = { "Mike", "James", " Tony", "Bilal", "Saifori", "Dorani"};

        // for (int index = 0; index <firstNames.length;index++) {
        //     System.out.println(firstNames[index]);
        //    System.out.println(index);
        //    System.out.println("[" + index + " ] ==> " + "\"" + firstNames[index] + " \"");
        //  }


        ///While LOOP

       /* String [] identities = {"firstname: Sam", "lastName: Mike", "Nationalty: USA","Age: 80"};

        int detials =0;

        while (detials <= identities.length-1) {
            System.out.println(identities[detials]);
            detials++;
        }

       /*int [] scores = { 100, 200, 300, 400, 500, 600, 700, 800, 900};

        int scoresOne =0;
        while ( scoresOne <= scores.length-1) {
            System.out.println(scores [scoresOne]);
            scoresOne++;
        }


        */
        ////print number from 1 -10

       /* int [] numbers ={10, 20,30, 40, 50, 60, 70, 80, 90,100};

        int input = 0;
        while (input <= 9) {
            System.out.println(numbers [input]);
            input++;
        }



        String [] names = {"mike", "bob", "sam", "shakib", "mohammadi"};

        int values = 0;
        while (values <= 4) {
            System.out.println(names [values]);
            values++;



            int [] inputOne = {10,20,30,40,50,60};

            int scores =0;
            while (scores <= inputOne.length-1) {
                System.out.println(inputOne[scores]);
                scores++;

        */

        // String [] names = { "Bob", "james", "majeed", "nasir", "alex", "tony"};
        // System.out.println(names [5]);
        // System.out.println(names [ names.length-1]);

///////// Do While Loop


        String[] values = {"Book", "Notebook", "Pen", "Pencil", "Rubber"};

        int items = 0;

        do {
            System.out.println(values[items]);
            items++;
        } while (items <= values.length - 1);

        int [] amounts = {1000, 10000, 100000, 1000000, 10000000};

        int number =0;

        do {
            System.out.println(amounts[number]);
            number++;
        } while (number< amounts.length);

        String [] newItems ={ "Cloths", "Foods", "Machinery", "Entertainments", "Sport Stuffs"};

        int stuffs =0;

        do {
            System.out.println(newItems[stuffs]);
            stuffs++;
        } while (stuffs<=newItems.length-1);



       // String [] names = {" Bob ", " Mike ", " Jackson"}; ///or
       // int [] numbers = { 10, 20, 30, 40, 50, 60, 70, 80};


       //int name = 0;
       // do {
        //    System.out.println(names [name]);
       //     name++;
       // } while (name <= names.length-1);



      //  int scores =0;

      //  do {
       //     System.out.println(numbers [scores]);
       //     scores++;
        //} while (scores<8);


        //int values = 0;

       // do {
        //    System.out.println(names[values]);
        //    values++;
        //} while (values <=names.length-1);


       // int number = 0;

      //  do {
       //     System.out.println(numbers[number]);
         //   number++;
      //  } while (number<= numbers.length-1);




        //// for each loop

        int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for  ( int amount : numbers) {
            System.out.println(amount);
        }

        String [] names ={ "Bob", "Sam", "Tony", "Alex", "Helen"};

        for (String valuesTwo : names) {
            System.out.println(valuesTwo);
        }



        int [] numbersOne = {100, 200, 300, 400, 500, 1000, 5000, 10000};

        for (int numbersTwo : numbersOne) {
            System.out.println(numbersTwo);
        }

        String [] studentsInfo = {"Mike", "Karim", "Qadir", "Hamid", "Sakhi"};

        for (String detials : studentsInfo ) {
            System.out.println(detials);
        }

        int [] scores = { 100, 120, 130, 140, 150};

        for (int numbersFive : scores) {
            System.out.println(numbersFive);
        }

        for (int numbersfive :scores) {
            if (numbersfive == 10) {
                System.out.println();
            }
        }


        String [] called = { "Bob", " Tony", "Sam", "Helen"};

        for (String namesOfpeople : called) {
            if (namesOfpeople == "Helen") {
                System.out.println(namesOfpeople);
            }

        }

        int [] numbers11 = { 500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000};

        for (int nubmers2 : numbers11) {
            if (nubmers2 == 1000) {
                System.out.println(nubmers2);
            }
        }


        int [] valuesPartOfFirst = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numberOne1 : valuesPartOfFirst) {
            if (numberOne1 % 2==0) {
                System.out.println(numberOne1);
            }}


        int [] numbersTwo = {10, 15, 20,25,30,35,40};

        for (int values2 : numbersTwo) {
            if (values2 % 2 == 0) {
                System.out.println(values2);
            }
        }


        int [] values3 = {10, 15, 20, 25, 30, 35, 40, 45, 50};

        for (int counts : values3) {
            if (counts % 2 != 0) {
                System.out.println(counts);
            }
        }


        short [] numbers22 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20};

        for (short num : numbers22) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        int [] values123 = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        int sumOfoddNumbers = 0;

        for (int val22 : values123) {
            if (val22 % 2 != 0) {
                System.out.println(val22);
                sumOfoddNumbers += val22;
            }
        }

        System.out.println("Sum of odd number is: " +sumOfoddNumbers);

        int [] numbers23 = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        int SumOfOddNumbers =0;

        System.out.println("Odd number is: ");
        for (int number00 : numbers23) {
            if (number00 % 2 != 0) {
                System.out.println(number00 + ", ");
                sumOfoddNumbers += number00;
            }

        }

        System.out.println();

        System.out.println("Sum of odd number is: " +sumOfoddNumbers);


     //int [] values11 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
     //int SumOfEvenNumbers =0;

     //for ( int number11 : values11) {
      //   if (number11 % 2 == 0) {
       //      System.out.println(number11);
      //       sumOfEvenNumbers += number11;



        //System.out.println("Sum of even number is: " + sumOfEvenNumbers);

       // String [] Articals = {"Bob", "Sam", "Dorani", "Rahmani", "Helen" };

       // for (int input: Articals) {
       //     System.out.println(input);
       // }
    }
}


