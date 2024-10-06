package recursion;

import java.util.*;

public class ques2 {
    public static void revStr(int n, String x) {
        if(n == 0){
            System.out.print(x.charAt(n));
            return;
        }

        System.out.print(x.charAt(n));
        
        revStr(n-1, x);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String x = sc.nextLine();
        int n = x.length()-1;

        revStr(n, x);
    }
}
