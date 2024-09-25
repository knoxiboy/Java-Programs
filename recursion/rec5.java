package recursion;
import java.util.*;

public class rec5 {
    public static void power(int n, int p, int ans) {
        if(p == 0){
            System.out.println(ans);
            return;
        }
        if(n == 0){
            System.out.println(0);
            return;
        }
        ans *= n;
        power(n, p-1, ans);
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. = ");
        int n = sc.nextInt();
        System.out.print("power = ");
        int p = sc.nextInt();
        int ans = 1;

        power(n, p, ans);
    }
}

/*

class Recursion1 {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        int x_ = printPower(x, n-1);
        int xn = x * x_;
        return xn;
    }
        
    public static void main(String args[]) {
    int x = 2, n = 5;
    int output = printPower(x, n);
    System.out.println(output);
    }
}

*/