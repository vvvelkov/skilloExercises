package Lecture_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleDivisionOfTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("%nEnter a second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());
        } catch(InputMismatchException ime) {
            System.out.println("Your input is invalid");
        } catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }

    }

    public double division(double num1, double num2){
        return num1 / num2;
    }

}
