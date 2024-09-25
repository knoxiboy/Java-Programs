package yt;

import java.util.Scanner;

public class func3 {
    public static int product(int a, int b){
        int product = a*b;
        return product;
        
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("Product = " + product(a, b));
    }
}
