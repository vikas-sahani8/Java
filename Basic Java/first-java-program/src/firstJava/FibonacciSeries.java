package firstJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

        int first = 0, second = 1;
        System.out.print(first +", "+ second);
        for(int i=2;i<n;i++){
            int next = first+second;
            System.out.print(", "+ next);
            first = second;
            second = next;
        }

    }
}
