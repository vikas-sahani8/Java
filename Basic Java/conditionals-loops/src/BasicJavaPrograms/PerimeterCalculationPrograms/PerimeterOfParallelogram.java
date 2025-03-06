package BasicJavaPrograms.PerimeterCalculationPrograms;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side ");
        int side = scn.nextInt();
        System.out.println("Enter base ");
        int base = scn.nextInt();
        int p = 2 * (base + side);
        System.out.println("Perimeter Of Parallelogram " + p);
    }
}
