package yt;

public class stringBuilder {
    public static void main(String[] args) {
        //Declaration
        StringBuilder sb = new StringBuilder("Hello, myself Karan Mani Tripathi");
        System.out.println(sb);

        //Get A Char from Index
        System.out.println(sb.charAt(0));

        //Set a Char at Index
        sb.setCharAt(0, 'h');
        System.out.println(sb);

        //Insert a Char at Some Index
        sb.insert(5, '.');
        System.out.println(sb);

        //Delete char at some Index
        sb.delete(5, 6);
        System.out.println(sb);

        //Append a char
        sb.append(" and i love coding");
        System.out.println(sb);

        //Print Length of String
        System.out.println(sb.length());


    }
}
