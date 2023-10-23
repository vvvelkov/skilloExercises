package Lecture_01;

public class TrianglePerimeter_02 {
    public static void main(String[] args) {

        trianglePerimeter();
    }

    private static void trianglePerimeter() {

        float a = 5.3F;
        float b = 4.2F;
        float c = 3.14F;

        float perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);

    }
}