package yt;
import java.util.Scanner;

public class compare {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         if (a>b) {
            System.out.println("a is grater");
         }
         else if (a<b) {
            System.out.println("a is lesser");
         }
         else {
            System.out.println("both are equal");
         }
         
    }
}
