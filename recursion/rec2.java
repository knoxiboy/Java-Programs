package recursion;
import java.util.*;

public class rec2 {
    public static void Sum(int n, int sum){
        if(n == 0){
            System.out.println("sum = "+ sum);
            return;
        }
        sum += n;
        Sum(n-1, sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int sum = 0;

        Sum(n, sum);

    }
}
