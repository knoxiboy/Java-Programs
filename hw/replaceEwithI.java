package hw;

import java.util.*;

public class replaceEwithI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){ // Use single quotes for character comparison & not double quotes which are used for strings.
                result += "i";
            }
            else{
                result += str.charAt(i);
            }
        }
        System.out.println("Result = "+ result);
    }
}
