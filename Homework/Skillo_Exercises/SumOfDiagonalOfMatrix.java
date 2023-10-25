package Lecture_05;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonalOfMatrix {
        public static void main(String[] args) {

            sumOfDiagonal();
        }
        private static void sumOfDiagonal() {

            Scanner scanner = new Scanner(System.in);
            int[][] arr = new int[4][4];
            int currentRow = 0;
            int sum = 0;

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    currentRow = i;
                    System.out.printf("Add an array element from %d currentRow: ", ++currentRow);
                    arr[i][j] = Integer.parseInt(scanner.nextLine());

                    if(i == j ){
                        sum += arr[i][j];
                    }
                }
            }

            System.out.println("Our Matrix is: ");
            for(int[] printArr : arr){
                System.out.println(Arrays.toString(printArr));
            }

            System.out.println("Sum of the diagonal of the array is: " + sum);
        }
    }


