package Lecture_04;

import java.util.Scanner;

public class TriangleBuild {
    public static void main(String[] args) {

        triangleBuild();
    }

    private static void triangleBuild() {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a triangle angle: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a triangle angle: ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a triangle angle: ");
        c = Integer.parseInt(scanner.nextLine());

        if(a + b + c == 180){
            String type = "";

            if(a == 90 || b == 90 || c == 90){
                type = "right-angled";
            } else if (a > 90 || b > 90 || c > 90) {
                type = "obtuse";
            } else {
                type = "acute";
            }

            System.out.printf("This is a valid %s triangle", type);

        }else {
            System.out.println("This is an invalid triangle");
        }

    }
}