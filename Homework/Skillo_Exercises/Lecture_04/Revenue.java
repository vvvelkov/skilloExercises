package Lecture_04;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        revenue();
    }

    private static void revenue() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int unit = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        float revenue = unit * quantity;
        float discount = 0F;
        float discountPercantage = 0F;

        if(quantity >= 100 && quantity <= 120){
            discountPercantage = 15.0F;
            discount = 15.0F/100 * revenue;
            revenue -= discount;
        } else if (quantity > 120) {
            discountPercantage = 20.0F;
            discount = 20.0F/100 * revenue;
            revenue -= discount;
        }

        System.out.printf("The revenue from sale: %.1f$ %n", revenue);
        System.out.printf("Discount: %.1f$(%.1f%%) %n", discount, discountPercantage);
    }
}