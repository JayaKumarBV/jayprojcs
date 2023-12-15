package com.jayxyram;

import java.util.Scanner;

public class whiletest {
    public static  void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){ //while(true)
            System.out.println("input: ");
            input = scanner.next().toLowerCase();
            //if (!input.equals("quit")) this is one method to stop avoiding printing quit
            if (input.equals("pass"))
                continue; //move control to begining of loop
            if (input.equals("quit"))
                break; //break stataments and terminates loop
            System.out.println("input is : "+input);
        }

    }
}
