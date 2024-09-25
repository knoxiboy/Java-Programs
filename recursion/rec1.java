package recursion;
import java.util.*;

public class rec1 {
    public static void printNum(int a){
        if(a == 0){
            return;
        }
        System.out.print(a+" ");
        printNum(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.println("num in rev ord : ");
        printNum(a);
    }
}
