package com.coursera;

import java.util.Scanner;

public class Google {
    Shopping s = null;
    Scanner scan = new Scanner(System.in);

    void addOrder()
    {
        if(this.s != null)
        {
            System.out.println("**********Order object already exists!!!**********");
        }
        else {
            System.out.println("Enter the shopping website you want to use");
            System.out.println("1.Flipkart\n2.Mynthra\n3.Amazon");
            int choice = scan.nextInt();
            if (choice == 1) {
                this.s = new Flipkart(10, 12, 22);
                System.out.println("**********| Order added to Flipkart |**********");
            } else if (choice == 2) {
                this.s = new Mynthra(1, 23, 11);
                System.out.println("**********| Order added to Mynthra |**********");
            } else {
                this.s = new Amazon(12, 3, 12);
                System.out.println("**********| Order added to Flipkart |**********");
            }
        }
    }

    void showDetails()
    {
        if (this.s == null) {

            System.out.println("**********| Object does not exist!!! |**********");
            return;
        }
        else {
            if (this.s instanceof Flipkart)
            {
                Flipkart s  = (Flipkart) this.s;
                this.s = s;
                System.out.println(s);;
            }
            else if(this.s instanceof Mynthra)
            {
                Mynthra s = (Mynthra) this.s;
                this.s = s;
                System.out.println(s);
            }
            else {
                Amazon s = (Amazon) this.s;
                this.s = s;
                System.out.println(s);
            }
        }

    }
    void cancelOrder()
    {
        if (this.s == null) {

            System.out.println("**********| Object does not exist |**********");
            return;
        }
        else {
            if (this.s instanceof Flipkart) {
                this.s = null;
                System.out.println("**********| Order object deleted!!! |**********");
            } else if (this.s instanceof Mynthra) {
                this.s = null;
                System.out.println("**********| Order object deleted!!! |**********");
            } else {
                this.s = null;
                System.out.println("**********| Order object deleted!!! |**********");
            }
        }
    }
}
