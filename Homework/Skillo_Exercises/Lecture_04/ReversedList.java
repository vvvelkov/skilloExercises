package Lecture_04;

import java.util.Scanner;

public class ReversedList {
    public static void main(String[] args) {

        reversedList();
    }

    private static void reversedList() {

        int[] list1 = {10, 20, 30, 40, 50};
        int[] reversedList = {1, 1, 1, 1, 1};
        int i = 0;

        for(int index = list1.length - 1; index >= 0; index--){
            reversedList[i] = list1[index];
            int currentNum = reversedList[i];
            System.out.print(currentNum + " ");
            i++;
        }

    }
}