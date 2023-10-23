package Lecture_04;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        age();
    }

    private static void age() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        if(age >= 16){
            System.out.println("You are eligible to work.");
        }else {
            System.out.println("You are NOT eligible to work.");
        }

    }
}