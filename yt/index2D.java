package yt;

import java.util.Scanner;

public class index2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows = ");
        int row = sc.nextInt();
        System.out.print("no. of columbs = ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++){
            System.out.print("Enter no.'s for row "+ i +" : ");
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }

        System.out.print("Enter no. to search : ");
        int search = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == search){
                    System.out.print("Index is ["+ i +"]["+ j +"]");
                    System.exit(0);
                }
            }
        }
        System.out.println("Not found");
    }
}