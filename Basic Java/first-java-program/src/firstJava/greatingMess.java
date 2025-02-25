package firstJava;

import java.util.Scanner;

public class greatingMess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name  = scn.nextLine();
        System.out.println("Welcome to the coding world " + name + " you are the best");
    }
}
