package firstJava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is greater then "+ num2);
        }else{
            System.out.println(num2 + " is greater then "+ num1);
        }
    }
}
