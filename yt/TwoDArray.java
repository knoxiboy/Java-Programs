package yt;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows = ");
        int row = sc.nextInt();
        System.out.print("no. of columbs = ");
        int col = sc.nextInt();

        int[][] numbers = new int[row][col];

        for(int i = 0; i < row; i++){
            System.out.print("Enter no.'s for row "+ i +" : ");
            for(int j = 0; j < col; j++){
                numbers[i][j] = sc.nextInt(); 
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
