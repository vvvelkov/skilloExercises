package Lecture_01;

public class FullName_01 {
    public static void main(String[] args) {

        printName();
    }

    private static void printName() {

        String firstName = "Valentin ";
        String middleName = "Ventsislavov ";
        String lastName = "Velkov\n";

        String fullName = firstName + middleName + lastName;

        System.out.println(fullName);

    }
}