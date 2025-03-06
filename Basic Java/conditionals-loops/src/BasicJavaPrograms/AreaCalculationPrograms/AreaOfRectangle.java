package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Length :- ");
        double l = scn.nextDouble();
        System.out.println("Enter Breadth :- ");
        double b = scn.nextDouble();
        double area = l*b;
        System.out.println("Area of Rectangle " + area);
    }
}
