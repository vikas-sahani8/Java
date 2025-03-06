package BasicJavaPrograms.PerimeterCalculationPrograms;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side");
        int side = scn.nextInt();

        int p = 3*side;
        System.out.println("Perimeter Of Equilateral Triangle " + p);
    }
}
