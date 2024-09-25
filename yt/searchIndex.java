package yt;

import java.util.Scanner;

public class searchIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length of array = ");
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter no. ");
            int x = sc.nextInt();
            array[i] = x;
        }

        System.out.print("Search for : ");
        int y = sc.nextInt();

        for(int i = 0; i < n ; i++){
            if (array[i] == y){
                System.out.println("Index of "+ y +" is "+ i);
            }
        }
    }
}
