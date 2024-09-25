package recursion;
import java.util.*;

public class rec3 {
    public static void fact(int n, int p){
        if(n == 0){
            System.out.println("Factorial = "+ p);
            return;
        }
        p *= n;
        fact(n-1, p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int p = 1;

        fact(n, p);
    }
}

/* 
public static void printFactorial(int n, int fact) {
    if(n == 0) {
        System.out.println(fact);
        return;
    }

    fact *= n;
    printFactorial(n-1, fact);
}

public static void main(String args[]) {
    printFactorial(5, 1);
}
*/