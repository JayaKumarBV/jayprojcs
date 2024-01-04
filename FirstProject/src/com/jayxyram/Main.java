package com.jayxyram;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args){
        /*
       // int age = 30, temperature = 20;
       // age = temperature;
        byte age = 30;
        long viewsCount = 2_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        String message = "   Hello \nWorld"+"!!";

        // System.out.print(isEligible);

       // System.out.println(message.replace("ll","s"));

        // below is pointers example for Primitive and reference types
        Point point1 = new Point(1,1); //Point is the Point object and not references like Point1 and Point2
        Point point2 = point1 ;
        point1.x=2;
        System.out.println(point2);
        */

        // below are string class
        /*
        String message = "Hello World"+"!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length()); // this is to check sign in type of things
        System.out.println(message.indexOf("e")); // case sensitive
        System.out.println(message.replace("!","$")); // it doesnt modify original string , just manipulates
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

         */

        /*
        //Escape sequence "\"
        String message = "Hello \"Jay\"";
        String message1 = "c:\\Windows\\...";
        String message2 = "c:\nWindows\\..."; //newline
        String message3 = "c:\tWindows\\..."; //newtab
        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);
        */

/*
        //arrays
        int[] numbers = new int[5];
        int[] numbers2 = {5,3,2,1,4};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[4] = 3;

        String[] stringArray1  = new String[2];
        stringArray1[0] = "jay";
        stringArray1[1] = "Ajay";

        Arrays.sort(numbers); // sorts the data
        System.out.println(Arrays.toString(numbers)); // converts the array data to readable data

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // converts the array data to readable data
        System.out.println(numbers2.length);

        Arrays.sort(stringArray1);
        System.out.println(Arrays.toString(stringArray1));


        //Multui dimensional arrays - store matrix,cube
        int[][] numbersmulti = new int[2][3];
        numbersmulti[0][0]= 1;
        System.out.println(Arrays.deepToString(numbersmulti));

        int[][] numbersmulti2 = {{1,2,3},{4,5,6}};
        numbersmulti2[0][0]= 1;
        System.out.println(Arrays.deepToString(numbersmulti2));
*/
/*
        //Constants

        final float PI = 3.14F; //final means constants
             //   pi=1; // this failed ( when small pi)  since we have assigned the value to pi as constant(final
                        // use capitals to name constants
        int pi = 1; // this wont fail since we declared pi as small case




         */
        // Arithmetic expressions

        /*
        // + ; - ; / ; *


        double result = (double)10 / (double)3;
        System.out.println(result);
        int x =1;
        int y = x++;
        System.out.println(x);
        System.out.println(y); // the reason y =1 is becase of that ++ is a postfix, if you change that to ++x then y will 2

        int y1 = ++x;
        System.out.println("output of y1 : "+ y1);

        int x2 =1;
        x2 = x2+2;

        System.out.println(x2);

        x2 +=2; // line 118 (x2 = x2+2;) does the same
        System.out.println(x2);

        int x3 = 2;
        x3 /= 2; // x3 *= 2; x3 -= 2;
        System.out.println(x3);

        */

        /*

        //order of operations

        int x = 10 + 3 * 2 ; // this result is 16 because multiply and division has higher priority
        System.out.println(x);

        int x1 = (10 + 3) * 2 ; // this result is 26 because of usage of paranthesis ()
        System.out.println(x1);

        //casting
        // Implicit casting ( automatic casting )
        //byte > short > int > long > float > double
        short Implicitcast =1;
        int y = Implicitcast+2;
        System.out.println(y);

        double explicitcast =1.1;
        int explicitcasty = (int) (explicitcast+2);
        System.out.println(y);

        String xstring = "1.1";
        double ystring = Double.parseDouble(xstring)+2;
        System.out.println(ystring);

         */
/*
        //Math class

        int result = Math.round(1.4F);
        // ceil , floor ,max , min,random , same like sql
        double random1 = Math.random()*100 ;
        int random2 = (int) (Math.random() * 100);
        Math.abs(1);
        System.out.println(random1);
        System.out.println(random2);

 */

        /*
        // Formatting Numbers
        //1234567 --> $123,456,7.89
        //0.1 --> 10%

        //NumberFormat currency = new NumberFormat();
         NumberFormat currency   = NumberFormat.getCurrencyInstance();
        // NumberFormat percent   = NumberFormat.getPercentInstance().format(0.1);


         String result = currency.format(1234567.7891);

         String result1   = NumberFormat.getPercentInstance().format(0.1);

         System.out.println(result);
         System.out.println(result1);


       // System.out.flush();

*/
        //Input Method
/*
        System.out.print("Enter Age: ");
        Scanner scanner = new Scanner(System.in);// gets input
        byte age = scanner.nextByte();


        System.out.print("Enter Name: ");
        String name = scanner.nextLine().toLowerCase();

        System.out.println("Your name is : "+name +"\nYou are aged : "+age);
        //String message = "Hello \"Jay\"";

*/

            // comparison operator
            int x= 1 ;
            int y = 2 ;
            System.out.println( x <= y ); //== boolean expression // != inequality //> >= < <=

            //logical operator

            int temperature = 12;
            boolean isWarm = temperature > 20 && temperature < 30; //java looks left to right
            System.out.println(isWarm);


            boolean hasHighIncome = false;
            boolean hasGoodCredit = true;
            boolean hasCriminalRecord = true;
            boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
            System.out.println(isEligible);

            //ifstatements
            int temp = 31;
            if (temp > 30) {
                    System.out.println("Its a Hot Day");
                    System.out.println("Drink Water");
            }
            else if (temp > 20 )
                    System.out.println("Beautiful day");
            else
                    System.out.println("Cold day");

            // simplify if statements
            int income = 90_000;
          //  boolean hasHighIncome2 = false;
        /*stage 1
                    if (income > 100_00){
                             hasHighIncome2 = true;
                    }
                    else hasHighIncome2 = false ;
                    System.out.println(hasHighIncome2 );
        */
            /*
            * stage 2
            *  if (income > 100_00){
                     hasHighIncome2 = true;
            }
            else hasHighIncome2 = true ;
            System.out.println(hasHighIncome2 );
            * */
            boolean hasHighIncome3 = (income > 100_000);

            //Ternary operator

            int income_tern = 120_000;
            String className = income_tern >100_000 ? "First" : "Economy";
            System.out.println(className);

            //Switch
            String role = "admin";
            switch (role) {
                    case "admin":
                            System.out.println("admin switch");
                            break; //if not used , next statemsnts will run

                    case "moderator":
                            System.out.println("moderator switch");
                            break;
                    case "guest":
                            System.out.println("guest switch");
                            break;
            }

                if (role == "admin")
                        System.out.println("admin you are");
                else if (role == "moderator")
                        System.out.println("moderator");
                else
                        System.out.println("guest");


            //Fizzbuzz
        Scanner scanner = new Scanner(System.in);// gets input
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        if (number % 5 ==0 && number % 3 == 0 )
                    System.out.println("FizzBuzz");
        else if (number % 3 == 0) 
                System.out.println("buzz");
        else if (number % 5 ==0 )
                    System.out.println("Fizz");
        else System.out.println(number);



        //try 1
            if (number % 5 ==0 ) {
                    if (number % 3 == 0)
                            System.out.println("FizzBuzz");
                    else System.out.println("Fizz");
            }
            else if (number % 3 == 0)
                    System.out.println("buzz");
            else System.out.println(number);


      /*
        //for loops
            for(int i = 5; i > 0; i--)
                    System.out.println("Hello World"+ i);

        //while loops

            int i = 0;
            while (i>0){
                    System.out.println("Hello World"+ i);
                    i--;
            }
            */
        //for each

                    String[] fruits ={"Apple","Orange","Banana"};
                    for (String fruit : fruits)
                            System.out.println(fruit);



    }

}
