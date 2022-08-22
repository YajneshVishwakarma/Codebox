import java.util.Arrays;
import java.util.Scanner;

class Sorter
{
    int m,n;
    int arr1[],arr2[];
    static int lastInd;
    Scanner scan = new Scanner(System.in);

    @Override
    public String toString()
    {
        String str = "";
        for (int i: arr1) {
            str += i+" ";
        }
        return str;
    }

    Sorter(int m, int n)
    {
        this.m = m;
        this.n = n;
    }

    void create()
    {
        arr1 = new int[m];
        arr2 = new int[n];

        Arrays.fill(arr1,0);
    }

    void read()
    {

        System.out.println("Enter the elements in an sorted manner to 1st Array");
        for (int i=0; i<(arr1.length - arr2.length); i ++)
        {
            arr1[i] = scan.nextInt();
        }



        System.out.println("Enter the elements in an sorted manner to 2nd Array");
        for (int i=0; i<arr2.length; i++)
        {
            arr2[i] = scan.nextInt();
        }

    }

    void sortAndMerge()
    {
        int last1 = (m - arr2.length) - 1, last2 = n - 1;
        lastInd = arr1.length-1;

        while(last1 >= 0 && last2 >= 0 && lastInd >= 0)
        {
            System.out.println("last1: "+last1+" ----- last2: "+last2+" -------- "+"lastInd: "+lastInd);
            System.out.println(Arrays.toString(arr1)+" ---- "+Arrays.toString(arr2)+"\n");
            if(arr1[last1] > arr2[last2])
            {
                System.out.println("Greater last1: "+last1+" last2:"+last2+" lastInd: "+lastInd);
                arr1[lastInd] = arr1[last1];
                last1--;
                lastInd--;
            }
            else if (arr1[last1] <arr2[last2])
            {
                System.out.println("Lesser last1: "+last1+" last2:"+last2+" lastInd: "+lastInd);
                arr1[lastInd] = arr2[last2];
                last2--;
                lastInd--;
            }

        }

        System.out.println(Arrays.toString(arr1)+"\n");
    }
}

public class SortAndMerge {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of m & n");
        int m = scan.nextInt();
        int n = scan.nextInt();

        if (!(m-n >= n))
        {
            System.err.println("Values m & n are not valid");
            System.exit(0);
        }

        Sorter s = new Sorter(m,n);

        s.create();
        System.out.println(s);
        s.read();
        System.out.println(s);
        s.sortAndMerge();
    }
}
