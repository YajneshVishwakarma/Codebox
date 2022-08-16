public class Student {
        String name;
        long id;
        String place;
        double fees;

    Student(String var1) {
            this.name = var1;
            System.out.println("Program Started");
        }

    Student(String var1, long var2) {
            this.name = var1;
            this.id = var2;
            System.out.println(var1);
            System.out.println(var2);
        }

    Student(String var1, long var2, String var4) {
            this.name = var1;
            this.id = var2;
            this.place = var4;
            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var4);
        }

    Student(String var1, long var2, String var4, double var5) {
            this.name = var1;
            this.id = var2;
            this.place = var4;
            this.fees = var5;
            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var4);
            System.out.println(var5);



    }

}


public class Student_Driver {
    public static void main(String[] var0) {
        System.out.println("Program Started");
        System.out.println("=============================");
        new Student("Yash");
        System.out.println("=============================");
        new Student("Yash", 121L);
        System.out.println("=============================");
        new Student("Yash", 12221L, "Mijar");
        System.out.println("=============================");
        new Student("Yash", 12221L, "Mijar", 1888.0D);
        System.out.println("=============================");
        System.out.println("Program Ended");

    }
}
