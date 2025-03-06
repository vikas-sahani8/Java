package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle :- ");
        double r = scn.nextDouble();
        double pi = 3.14;
        double area = pi * (r*r);
        System.out.println("Area if circle " +area);
    }
}
