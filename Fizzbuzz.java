package com.coursera;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the choice");
        int choice= scan.nextInt();

        System.out.println("Enter the number:");
        int i = scan.nextInt();

//        while (i-->= 0)
//        {
//            if (i % 5 == 0)
//            {
//                System.out.print("Fizz");
//            }
//            if (i % 3 == 0)
//            {
//            System.out.println("Buzz");
//            }
//            if (i % 3 != 0 && i % 5 != 0)
//            {
//            System.out.println(i);
//            }
//        }

        switch (choice) {
            case 1:
                if (i % 5 == 0 && i != 0) {
                    System.out.print("Fizz");
                }
                if (i % 3 == 0 && i != 0) {
                    System.out.println("Buzz");
                }
                if (i % 3 != 0 && i % 5 != 0) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                }
                break;

            case 2:
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Fizz");
                } else if (i % 3 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                break;
        }
    }
}
