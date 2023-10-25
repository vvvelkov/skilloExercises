package Lecture_05;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        sum();
    }
    private static void sum() {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.print("Add an array element: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            sum += arr[i];
      }

        System.out.println("Sum of array elements is: " + sum);
    }
}


