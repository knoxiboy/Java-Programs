package hw;

import java.util.Scanner;

public class spiralMatrix {
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
        int rs = 0;
        int re = row-1;
        int cs = 0;
        int ce = col-1;
        do{
            //1st row
            for(int i = cs; i <= ce; i++){
                System.out.print(matrix[rs][i]+" ");
            }
            rs++;
            //last col
            for(int i = rs; i <= re; i++){
                System.out.print(matrix[i][ce]+" ");
            }
            ce--;
            //last row
            for(int i = ce; i >= cs; i--){
                System.out.print(matrix[re][i]+" ");
            }
            re--;
            //1st col
            for(int i = re; i >= rs; i--){
                System.out.print(matrix[i][cs]+" ");                
            }
            cs++;
        }while(rs <= re && cs <= ce);
    }
}