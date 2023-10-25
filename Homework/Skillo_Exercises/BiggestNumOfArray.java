package Lecture_05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumOfArray {
    public static void main(String[] args) {

        biggestNumOfArray();
    }
    private static void biggestNumOfArray() {

        int[] arr = {1, 5, 50, 60};
        System.out.println("The array is: " + Arrays.toString(arr));
        int biggestNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > biggestNum){
                biggestNum = arr[i];
            }
        }

        System.out.printf("Biggest Num from the array is: %d", biggestNum);
    }
}


