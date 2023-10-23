package Lecture_04;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        vacation();
    }
    private static void vacation() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an option for a vacation: ");
        String option = scanner.nextLine();

        System.out.print("Enter Budget: ");
        int budget = Integer.parseInt(scanner.nextLine());

        if(option.equals("Beach")){
            if(budget < 50){
                System.out.println("Bulgaria is a good fit.");
            } else {
                System.out.println("Outside Bulgaria is a good fit.");
            }

        } else if (option.equals("Mountain")) {
            if(budget < 30){
                System.out.println("Bulgaria is a good fit.");
            } else {
                System.out.println("Outside Bulgaria is a good fit.");
            }

        } else {
            System.out.println("There is no information about this type of vacation.");
        }

    }
}
