package recursion;

import java.util.*;

public class ques3 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(int n, String s, char x){
        if(n == s.length()){
            System.out.println("First occurence is at index "+ first);
            System.out.println("Last occurence is at index "+ last);
            return;
        }

        char currentChar = s.charAt(n);
        if(currentChar == x){
            if(first == -1){
                first = n;
            }
            else{
                last = n;
            }
        }

        findOccurance(n+1, s, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter element for searching : ");
        char element = sc.next().charAt(0);
        int n = 0;

        findOccurance(n, str, element);
    }
}
