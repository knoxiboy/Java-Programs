package hw;
import java.util.Scanner;

public class evennum {
    public static void main(String arg[]){
        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
