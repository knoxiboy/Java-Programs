package exercise1;

import java.util.Scanner;

public class Ques4{
    public static void circumference(double r){
        double ans = 2*3.14*r;
        System.out.println("Circumference = "+ ans);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = sc.nextInt();

        circumference(r);
    }
}