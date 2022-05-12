
public class Student_School {
    int id;
    String name;
    long rno;

    public String toString()
    {
        return "\nStudent id : "+this.id+"\nStudent name: "+this.name+"\nStudent rno : "+this.rno+"\n";
    }

    Student_School()
    {

    }

    Student_School(int id)
    {
        this.id = id;
    }
    Student_School(int id, String name)
    {
        this(id);
        this.name = name;
    }

    Student_School(int id, String name,long rno)
    {
        this(id,name);
        this.rno = rno;
    }



}


import java.util.ArrayList;
import java.util.Scanner;

public class School {
    Student_School ss ;
    ArrayList<Student_School> sal = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public void addStudent()
    {
        System.out.println(this.ss);
        System.out.println("Enter the Student id");
        int id = scan.nextInt();
        System.out.println("Enter the Student name");
        String name = scan.next();
        System.out.println("Enter the Student rno");
        long rno = scan.nextLong();

        this.ss = new Student_School(id,name,rno);
        sal.add(ss);
    }

    public void studentDetails()
    {
        System.out.println(sal);
    }

    public void studentDetailsVId()
    {
        boolean flag = false;
        System.out.println("Enter the Student id");
        int newId = scan.nextInt();

        for (Student_School a: sal) {
            if(a.id == newId)
            {
                System.out.println(a);
                flag = true;
            }
        }

        if (!flag){
            System.out.println("Student not found!!!");
        }
    }

    public void updateDetailsVId()
    {
        boolean flag = false;
        System.out.println("Enter the Student id");
        int newId = scan.nextInt();

        for (Student_School a: sal) {
            if(a.id == newId)
            {
                System.out.println(a);
                System.out.println("Enter the new name of the student");
                a.name = scan.next();
                System.out.println("Student name updated!!!");
                return;
            }
        }

        if (!flag){
            System.out.println("Student not found!!!");
        }
    }
    public void removeStudent()
    {
        System.out.println("Enter the Student id ");
        int sid = scan.nextInt();

        for(Student_School s: sal)
        {
            if(s.id == sid)
            {
                sal.remove(s);
                System.out.println("Student removed!!!");
                return;
            }
        }
        System.out.println("Student not found!!!");
    }


}

import java.util.Scanner;

public class School_Driver {
    public static void main(String[] args) {
        int ch;

        School sch = new School();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter your choice:\n1.Add Student\n2.Student Details\n3.Details of student\n4.Update student name\n5.Remove student");
            ch = scan.nextInt();

            switch (ch) {
                case 1 -> sch.addStudent();
                case 2 -> sch.studentDetails();
                case 3 -> sch.studentDetailsVId();
                case 4 -> sch.updateDetailsVId();
                case 5 -> sch.removeStudent();
            }
        } while (ch != 0);

    }
}
