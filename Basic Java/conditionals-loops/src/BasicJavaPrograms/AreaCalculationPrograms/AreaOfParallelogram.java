package BasicJavaPrograms.AreaCalculationPrograms;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base  ");
        double b= scn.nextDouble();
        System.out.println("Enter height");
        double h = scn.nextDouble();
        double area = b*h;
        System.out.println("Area of Parallelogram " + area);



    }


}
