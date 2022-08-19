package com.coursera;

import java.util.Scanner;

public class Bag_Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bag b = new Bag();
        int ch = 1,choice;
        do {
            System.out.println("Enter your choice:\n1.Add ball\n2.Get radius\n3.Is bag empty\n4.Remove ball\n(0 To exit)\n");
            choice = scan.nextInt();
            switch (choice){
                case 0: ch = 0;
                        break;
                case 1: b.addBall();
                    break;
                case 2:
                    System.out.println(b.b);
                    break;
                case 3: b.isBagEmpty();
                    break;
                case 4: b.removeBall();
                    break;
            }
        }while (ch!=0);

    }
}
