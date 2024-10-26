package recursion;

import java.util.Scanner;

public class ques5 {
    public static String s;
    public static char x;

    public static void moveAll(int n, int count, String ns){
        if(n == s.length()){
            for(int i = 0; i < count; i++){
                ns += x;
            }
            System.out.println("New String is : "+ ns);
            return;
        }

        char curChar = s.charAt(n);
        if(curChar == x){
            count++;
        }
        else{
            ns += curChar;
        }

        moveAll(n+1, count, ns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        s = sc.nextLine();
        System.out.print("Enter char to move at last : ");
        x = sc.next().charAt(0);

        int index = 0, count = 0;
        String ns = "";

        moveAll(index, count, ns);
    }
}
