//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    
    
    int res = 0, temp = 0, N = n;
    while(n>0)
    {
        temp = n%10;
        
        temp = (temp == 0)? 5: temp;
        res = res*10+temp;
        n = n/10;
        
    }
    
    n = res;
    temp = 0;
    res = 0;
    
    while(n>0)
    {
        temp = n%10;
        
        temp = (temp == 0)? 5: temp;
        res = res*10+temp;
        n = n/10;
        
    }
    
    return res;
    
    }
}
