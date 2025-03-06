package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOf_IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Base :- ");
        double base = scn.nextDouble();

        System.out.println("Enter the side");
        double side = scn.nextDouble();
        double height =  Math.sqrt((side*side) - (base/2)*(base/2));

        double area = 0.5 *(base *height);
        System.out.println("Area Of Isosceles Triangle: " + area);
    }
}
