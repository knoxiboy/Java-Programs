package yt;
import java.util.Scanner;

public class func1 {
    public static void printname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String arg[]){
        System.out.print("name = ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printname(name);
    }
}