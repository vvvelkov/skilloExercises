package Lecture_05;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixWithStaticRows {
    public static void main(String[] args) {

        matrixElements();
    }
    private static void matrixElements() {

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int currentRow = 0;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                currentRow = i;
                System.out.printf("Add an array element from %d currentRow: ", ++currentRow);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Our Matrix is: ");
        for(int[] printArr : arr){
            System.out.println(Arrays.toString(printArr));
        }
    }
}


