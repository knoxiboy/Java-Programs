package yt;
import java.util.Scanner;

public class func2 {
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println(sum(a,b));
    }
}
