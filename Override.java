abstract class student1 {

    static {
        System.out.println("Static multiline initializer");
    }

    {
        System.out.println("Non static multiline initializer");
    }
    int i;
    student1(int i)
    {
        this.i = i;
    }
    public static void m1()
    {
        System.out.println("m1 ---> static method");
    }

    public static void m2()
    {
        System.out.println("m2 ---> static method");
    }

    abstract public void m3();
    abstract public void m4();

    public void m5()
    {
        System.out.println("m5 ---> non static method");
    }

    public void m6()
    {
        System.out.println("m6 ---> non static method");
    }
}

class student2 extends student1 {

    student2(int i)
    {
        super(i);
    }

    @Override
    public void m3() {
        System.out.println("m3 ---> non static method");
    }

    @Override
    public void m4() {
        System.out.println("m4 ---> non static method");
    }
}


public class Override {
    public static void main(String[] args) {
        student1 ss = new student2(13);
        ss.m1();
        ss.m2();
        ss.m3();
        ss.m4();
        ss.m5();
        ss.m6();
    }
}
