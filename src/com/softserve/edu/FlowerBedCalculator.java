package com.softserve.edu;

import java.util.Scanner;
import static java.lang.Math.*;

/*Task 1: Calculate the Perimeter and Area of a Flower Bed*/
public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;
        double perimeter;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the int radius > 0: ");
        radius = sc.nextInt();
        if (radius > 0) {
            perimeter = 2 * PI * radius;
            System.out.println("perimeter =  " + perimeter);
            area = PI * radius * radius;
            System.out.println("area =  " + area);
        }
        else {
            System.out.println("wrong radius, restart programm");
        }

    }
}