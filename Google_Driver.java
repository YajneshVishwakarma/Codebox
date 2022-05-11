package com.coursera;

import java.util.Scanner;

public class Google_Driver {

    public static void main(String[] args) {
        Google g = new Google();

        boolean exit = true;
        Scanner scan = new Scanner(System.in);

        while(exit)
        {
            System.out.println("Choose the option");
            System.out.println("1.Add order\n2.Order details\n3.Cancel order\n4.Exit");
            int choice=scan.nextInt();
            switch(choice)
            {
                case 1:g.addOrder();
                    break;
                case 2:g.showDetails();
                    break;
                case 3:g.cancelOrder();
                    break;
                case 4:exit=false;
                    break;
                default:System.out.println("**********| Invalid option |**********");
            }
        }
    }
}
