package exercise1;

import java.util.Scanner;

//done by mam
/*
public class Ques5 {
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age = ");
        int age = sc.nextInt();
        System.out.println(isElligible(age));
    }
}
*/

//done by me
public class Ques5 {
    public static void vote(){
        int x;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Age = ");
            int age = sc.nextInt();

            if(age >= 18 & age <=150){
                System.out.println("Eligible to vote");
                x = 1;

            }
            else if(age >= 0 & age < 18){
                System.out.println("Not eligible to vote");
                x = 1;
            }
            else{
                System.out.println("plz enter correct age");
                x = 0;
            }
        }while (x == 0);
        
    }
    public static void main(String[] args) {
        vote();
    }
}
