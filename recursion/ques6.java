package recursion;

import java.util.Scanner;

public class ques6 {
    public static String s;

    public static void remove(int n,String newStr, boolean[] map){
        if(n == s.length()){
            System.out.println("New string is : "+ newStr);
            return;
        }
        char curChar = s.charAt(n);
        int idx = curChar - 'a';
        if(map[idx] == false){
            newStr += curChar;
            map[idx] = true;
        }

        remove(n+1, newStr, map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        s = sc.nextLine();

        String newStr = "";
        int index = 0;

        boolean[] map = new boolean[26];
        for(int i = 0; i < 26; i++){
            map[i] = false;
        }

        remove(index, newStr, map);
    }
}
