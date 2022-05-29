
class parent
{
    int a = 10;
    String h ="Hello1";
    parent()
    {
        System.out.println(h);
    }
    void m1()
    {
        System.out.println(h);
    }
}

class child extends parent
{
    int b= 20;
    String w ="World2";
    child()
    {
        System.out.println(w);
    }

    void m1()
    {
        System.out.println(w);
    }
}


public class Upcasting {
    public static void main(String[] args) {
        child c = new child();
        c.m1();
        System.out.println("-------------------------");
        parent up = new child();
        up.m1();
        System.out.println("--------------------------");
        child dw = (child) up;
        System.out.println(c.a + c.b);
        System.out.println(c.h+" "+c.w);
        System.out.println(dw.h+dw.w+dw.b+dw.a+dw.b);
    }
}


