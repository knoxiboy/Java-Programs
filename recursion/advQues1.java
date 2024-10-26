package recursion;

import java.util.Scanner;

public class advQues1{
    public static void allString(String s ,String permutation){
        if(s.length() == 0){
            System.out.print(permutation + " ");
            return;
        }

        for(int i = 0; i < s.length(); i++){
            char curchar = s.charAt(i);
            String newstr = s.substring(0, i) + s.substring(i+1);
            allString(newstr, permutation+curchar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.print("All possible permutations are : ");
        allString(s, "");
    }
}
