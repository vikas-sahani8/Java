package BasicJavaPrograms.PerimeterCalculationPrograms;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length ");

        int l =  scn.nextInt();
        int b = scn.nextInt();
        int p = 2*(l*b);
        System.out.println("Perimeter Of Rectangle " + p);
    }
}
