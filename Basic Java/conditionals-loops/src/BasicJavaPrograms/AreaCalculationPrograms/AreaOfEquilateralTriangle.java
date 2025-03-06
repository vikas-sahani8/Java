package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side ");
        double side = scn.nextDouble();
        double area = (Math.sqrt(3)/4) * (side*side);
        System.out.printf("Area Of Equilateral Triangle is: %.2f",  area);
    }
}
