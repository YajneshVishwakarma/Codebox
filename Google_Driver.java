
public class Shopping {
    int belt;
    int shoe;
    int dress;

    public Shopping(int belt, int shoe, int dress) {
        this.belt = belt;
        this.shoe = shoe;
        this.dress = dress;
    }
}

public class Amazon extends Shopping {
    Amazon(int belt,int shoe,int dress)
    {
        super(belt, shoe, dress);
    }

    public String toString()
    {
        return "Belt quantity : "+this.belt+ "\nShoe quantity : "+this.dress+"\nDress quantity : "+this.shoe;
    }

}

public class Flipkart extends Shopping {
    Flipkart(int belt,int shoe,int dress)
    {
        super(belt, shoe, dress);
    }

    public String toString()
    {
        return "Belt quantity : "+this.belt+ "\nShoe quantity : "+this.dress+"\nDress quantity : "+this.shoe;
    }

}


public class Mynthra extends Shopping {
    Mynthra(int belt,int shoe,int dress)
    {
        super(belt, shoe, dress);
    }

    public String toString()
    {
        return "Belt quantity : "+this.belt+ "\nShoe quantity : "+this.dress+"\nDress quantity : "+this.shoe;
    }

}


import java.util.Scanner;

public class Google {
    Shopping s = null;
    Scanner scan;

    public Google() {
        this.scan = new Scanner(System.in);
    }

    void addOrder() {
        if (this.s != null) {
            System.out.println("**********Order object already exists!!!**********");
        } else {
            System.out.println("Enter the shopping website you want to use");
            System.out.println("1.Flipkart\n2.Mynthra\n3.Amazon");
            int choice = this.scan.nextInt();
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

    void showDetails() {
        if (this.s == null) {
            System.out.println("**********| Object does not exist!!! |**********");
        } else {
            if (this.s instanceof Flipkart) {
                Flipkart s = (Flipkart)this.s;
                this.s = s;
                System.out.println(s);
            } else if (this.s instanceof Mynthra) {
                Mynthra s = (Mynthra)this.s;
                this.s = s;
                System.out.println(s);
            } else {
                Amazon s = (Amazon)this.s;
                this.s = s;
                System.out.println(s);
            }

        }
    }

    void cancelOrder() {
        if (this.s == null) {
            System.out.println("**********| Object does not exist |**********");
        } else {
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
