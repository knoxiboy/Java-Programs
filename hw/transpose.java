package hw;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows = ");
        int row = sc.nextInt();
        System.out.print("no. of columbs = ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        //for input
        for(int i = 0; i < row; i++){
            System.out.print("Enter no.'s for row "+ i +" : ");
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }

        //for output
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
