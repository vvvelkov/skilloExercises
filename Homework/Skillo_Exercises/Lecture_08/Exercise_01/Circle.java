package Lecture_08.Exercise_01;

public class Circle extends Shape {

    public double r;
    public double areaOfCircle;
    public double perimeterOfCircle;
    public double getArea(double r) {
        this.r = r;
        double area = this.areaOfCircle;
        this.areaOfCircle = Math.PI * r * r;
        return this.areaOfCircle;
    }

    public double getPerimeter(double r) {
        this.r = r;
        double perimeter = this.perimeterOfCircle;
        this.perimeterOfCircle = 2 * r;
        return this.perimeterOfCircle;
    }
}
