package Lecture_04;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        daysOfTheWeek();
    }

    private static void daysOfTheWeek() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a digit from 1 to 7: ");
        String input = scanner.nextLine();
        String day = "";

        switch (input){
            case "1":
                input = "1-st";
                day = "Monday"; break;
            case "2":
                input = "2-nd";
                day = "Tuesday"; break;
            case "3":
                input = "3-rd";
                day = "Wednesday"; break;
            case "4":
                input = "4-th";
                day = "Thursday"; break;
            case "5":
                input = "5-th";
                day = "Friday"; break;
            case "6":
                input = "6-th";
                day = "Saturday"; break;
            case "7":
                input = "7-th";
                day = "Sunday"; break;
            default:
                System.out.println("Chosen digit is less than 1 or greater than 7");
        }

        System.out.printf("The %s day of the week is %s", input, day);

    }
}