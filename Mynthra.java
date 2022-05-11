package com.coursera;

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