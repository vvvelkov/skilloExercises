package Lecture_01;

import java.util.Scanner;

public class InputTrianglePerimeterAndArea_05 {

    public static void main(String[] args) {

        inputTrianglePerimeter();
        inputTriangleArea();
    }

    private static void inputTriangleArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle side: ");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter triangle height: ");
        float h = Float.parseFloat(scanner.nextLine());

        float area = (b * h) / 2.0F;

        System.out.println("Triangle Area is: " + area);

    }

    private static void inputTrianglePerimeter() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle side a: ");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter triangle side b: ");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter triangle side c: ");
        float c = Float.parseFloat(scanner.nextLine());

        float perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);
        System.out.println();

    }
}