package recursion;

import java.util.Scanner;

public class ques9 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"} ;
    public static String s;

    public static void printCombo(int idx, String combination) {
        if(idx == s.length()){
            System.out.print(combination +" ");
            return;
        }

        char curChar = s.charAt(idx);
        String maping = keypad[curChar - '0'];

        for(int i = 0; i < maping.length(); i++){
            printCombo(idx+1, combination+maping.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        s = sc.nextLine();
        
        System.out.print("Key Combinations are : ");
        printCombo(0, "");
    }
}
