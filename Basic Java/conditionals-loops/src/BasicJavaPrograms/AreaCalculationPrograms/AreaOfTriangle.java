package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base of triangle :- ");
        double base = scn.nextDouble();
        System.out.print("Enter the height of triangle :- ");
        double height = scn.nextDouble();

        double Area = 0.5 * (base*height);
        System.out.println("Area of Triangle " + Area);
    }
}