package firstJava;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Principal Amount (P): ");
        double p = scn.nextInt();
        System.out.print("Enter Time (in years, T): ");
        double t = scn.nextInt();
        System.out.print("Enter Rate of Interest per annum (R%): ");
        double r = scn.nextInt();

        double si = (p*r*t)/100;
        System.out.println("Simple Interest: " + si);

    }
}
