package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class ques8 {
    public static String str;

    public static void Subseq(int idx, String newStr, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            }
            set.add(newStr);
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);
        //choose
        Subseq(idx+1, newStr+curChar, set);
        //don't choose
        Subseq(idx+1, newStr, set);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        str = sc.nextLine();

        HashSet<String> set = new HashSet<>();
        Subseq(0, "", set);
    }
}