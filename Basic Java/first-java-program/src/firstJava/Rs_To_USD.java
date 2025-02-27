package firstJava;

import java.util.Scanner;

public class Rs_To_USD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = 0.011;

        System.out.print("Enter amount in INR: ");
        double inr = scanner.nextDouble();
        double usd = inr * exchangeRate;
        System.out.printf("%.0f INR is equivalent to %.3f USD1" ,inr , usd);
//        "%.2f INR is equivalent to %.2f USD%n"

        scanner.close();
    }
    }

