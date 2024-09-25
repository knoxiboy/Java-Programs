package recursion;
import java.util.*;

/*

public class rec4 {
    public static void fibo(int n, int a, int b) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
        fibo(n-1, b, c );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonaci series is : ");
        System.out.print(a+" ");
        System.out.print(b+" ");

        fibo(n-2, a, b);
    }
}

*/


public class rec4 {
    public static void printFibonaci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        System.out.print(a+" ");
        printFibonaci(b, a+b, n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("Fibonaci series is : ");
        
        printFibonaci(0, 1, n);
    }
}
