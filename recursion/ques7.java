package recursion;

import java.util.Scanner;

public class ques7 {
    public static String s;

    public static void subSeq(int n, String newStr) {
        if(n == s.length()){
            System.out.println(newStr);
            return;
        }

        char curChar = s.charAt(n);
        //choose
        subSeq(n+1, newStr+curChar);
        //not choose
        subSeq(n+1, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        s = sc.nextLine();
        
        subSeq(0, "");
    }
}
