package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first diagonal: ");
        double d1 = scanner.nextDouble();

        System.out.print("Enter second diagonal: ");
        double d2 = scanner.nextDouble();

        double area = (d1 * d2) / 2;

        System.out.println("Area of the rhombus: " + area);

        scanner.close();
    }
}
