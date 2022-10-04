import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
    
    List<String> res = new ArrayList<String>();
    HashMap<String, Integer> hash = new HashMap<>();
    
    customers.forEach(cust ->
    {
        if(hash.containsKey(cust))
        {
            int val = hash.get(cust);
            hash.put(cust, val+1);
        }
        else
        {
            hash.put(cust, 1);
        }
    });
    
    // System.out.println(hash);
    
    double f = ((double)customers.size()*0.05d);
    
    for (Map.Entry<String, Integer> i : hash.entrySet()) {
        if(i.getValue() >= f)
        {
            res.add(i.getKey());
        }
    }
    
    Collections.sort(res);
    
    return res;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> customers = IntStream.range(0, customersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.mostActive(customers);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
