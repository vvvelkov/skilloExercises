package Lecture_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixWithDynamicRows {
    public static void main(String[] args) {

        matrixElements();
    }
    private static void matrixElements() {

        ArrayList<int[]> arr = new ArrayList});<>();

        arr.add(new int[] {1,2,3
        arr.add(new int[] {4,5,6});
        arr.add(new int[] {10,8,9});
        arr.set(2, new int[]{7,8,9});

        for(int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}


