package com.coursera;

class now
{
     Constructor obj;
    now(Constructor obj)
    {
        System.out.println("Object successfully created");
        System.out.println(obj.y);
    }
}

 public class Constructor {
    int y;
    Constructor ()
    {
        this.y=30;
        now mow = new now(this);
    }
    public static void main(String[] args) {
        Constructor and = new Constructor();
    }

}
