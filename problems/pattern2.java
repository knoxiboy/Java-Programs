package prob;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        System.out.print("m:");
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i == 1 || i == n){
                for(int j = 1; j <= m; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1; j <= m; j++){
                    if(j == 1 || j == m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
