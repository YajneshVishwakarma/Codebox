import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program15 {

    public static void main(String[] args) {

        Pattern pat1 = Pattern.compile("^[0-9]*$");
        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9]*$");
        Pattern pat3 = Pattern.compile("^[^a-zA-Z0-9]*$");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the data to check the Data type");
        String n = scan.next();

        if (pat1.matcher(String.valueOf(n)).matches())
        {
            System.out.println("Integer");
        }
        else if (pat2.matcher(String.valueOf(n)).matches())
        {
            System.out.println("String");
        }
        else if (pat3.matcher(String.valueOf(n)).matches())
        {
            System.out.println("Special Character");
        }
        else
        {
            System.out.println("Mixed string");
        }

    }
}
