package prob;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        System.out.print("height");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++){
            for(int j = h; j >= i; j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
