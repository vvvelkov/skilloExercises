package Lecture_08.Exercise_01;

public class Square extends Shape{
    public double side;
    public double areaOfSquare;
    public double perimeterOfSquare;
    public double getArea(double side) {
        this.side = side;
        double area = this.areaOfSquare;
        this.areaOfSquare = side * side;
        return this.areaOfSquare;
    }
    public double getPerimeter(double side) {
        this.side = side;
        double perimeter = this.perimeterOfSquare;
        this.perimeterOfSquare = 4 * side;
        return this.perimeterOfSquare;
    }
}
