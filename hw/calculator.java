package hw;
import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        System.out.println("1=addition");
        System.out.println("2=subtraction");
        System.out.println("3=multipication");
        System.out.println("4=division");
        System.out.println("5=remainder");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        System.out.print("what to do? ");
        int q = sc.nextInt();

/*      
        if(q == 1){
            System.out.println(a+b);
        }
        else if(q == 2){ 
            System.out.println(a-b);
        }
        else if(q == 3){
            System.out.println(a*b);
        }
        else if(q == 4){
            if(b == 0){
                System.out.println("invalid divison");
            }
            else{
                System.out.println(a/b);
            }    
        }
        else if(q == 5){
            if(b == 0){
                System.out.println("invalid divison");
            }
            else{
                System.out.println(a%b);
            }
        }
        else{
            System.out.println("enter a valid operation...");
        }
*/

        switch (q) {
            case 1: System.out.println(a+b);
            break;

            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: if(b == 0){
                        System.out.println("invalid divison");
                    }
                    else{
                        System.out.println(a/b);
                    }
            break;

            case 5: if(b == 0){
                        System.out.println("invalid divison");
                    }
                    else{
                        System.out.println(a%b);
                    }
            break;

            default: System.out.println("enter a valid operation...");
            
        }




    }
}
