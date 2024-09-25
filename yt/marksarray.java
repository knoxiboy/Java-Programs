package yt;
import java.util.Scanner;

public class marksarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of subjects = ");
        int n = sc.nextInt();

        int marks[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter marks: ");
            int x = sc.nextInt();
            marks[i] = x;
        }
        int total = 0;
        for(int i = 0; i < n; i++){
            total += marks[i];
        }
        System.out.println("Total marks = " + total + " out of " + n*100);
        System.out.println("Percentage = " + total/n);
    }
}