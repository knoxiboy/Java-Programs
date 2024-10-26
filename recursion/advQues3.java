package recursion;

import java.util.*;

public class advQues3 {
    public static int place(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        int vertplace = place(n-m, m);

        int horiplace = place(n-1, m);

        return vertplace + horiplace;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();

        System.out.println("Total ways = "+place(n, m));
    }
}