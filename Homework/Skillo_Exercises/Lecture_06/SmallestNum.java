package Lecture_06;

public class SmallestNum {
    public static void main(String[] args) {
        double result = smallestNum(3.2, 4.5, 1.2);
        System.out.printf("Smallest Num is: %.1f", result);
    }

    static double smallestNum(double num1, double num2, double num3) {
        double smallestNum = num1;

        if(smallestNum > num2){
            smallestNum = num2;
        }

        if(smallestNum > num3){
            smallestNum = num3;
        }

        return smallestNum;
    }
}