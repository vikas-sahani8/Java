package firstJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        StringBuilder rvs = new StringBuilder();
        for(int i = str.length()-1; i>=0;i--){
            rvs.append(str.charAt(i));
        }
        if (str.contentEquals(rvs))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}
