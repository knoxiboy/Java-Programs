package recursion;
import java.util.*;

public class rec6 {
    public static int Power(int n, int p) {
        if(p == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0) {
            return Power(n/2, p) * Power(n/2, p);
        }
        else {
            return p * Power(n/2, p) * Power(n/2, p);
        }
        
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. = ");
        int n = sc.nextInt();
        System.out.print("power = ");
        int p = sc.nextInt();

        int ans = Power(n, p);
        System.out.println("Ans = "+ ans);
    }
}