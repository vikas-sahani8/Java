package BasicJavaPrograms.PerimeterCalculationPrograms;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Radius ");
        double r= scn.nextDouble();
        double p = 2 * Math.PI*r;
        System.out.printf("Perimeter Of Circle %.2f", p);
    }
}
