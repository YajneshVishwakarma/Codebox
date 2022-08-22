import java.util.Scanner;

public class MissingNumber {

    static int missingNumber(int arr[])
    {
        int n = 0,sum = 0;
        n = ((arr.length + 1) * (arr.length+2))/2;
        for (int num: arr) {
            sum += num;
        }
        return n - sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the Array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println(example.missingNumber(arr));
    }
}
