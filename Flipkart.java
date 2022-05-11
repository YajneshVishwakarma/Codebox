package com.coursera;

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
