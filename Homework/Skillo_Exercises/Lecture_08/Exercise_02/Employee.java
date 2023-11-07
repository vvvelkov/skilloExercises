package Lecture_08.Exercise_02;

import java.util.Scanner;

public class Employee {

    final public int id = 1;
    final public String firstName = "Valentin";
    final public String lastName = "Velkov";
    public double salaryPerMonth;

    public String getName(){
        System.out.print("Employee name: ");
        return firstName + " " + lastName;
    }
    public double getAnnualSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        this.salaryPerMonth = Double.parseDouble(scanner.nextLine());
        System.out.print("Employee salary is: ");
        return this.salaryPerMonth;
    }
    public double raiseSalary() {
        System.out.print("Employee salary after raise: ");
        return this.salaryPerMonth + (10.0/100 * this.salaryPerMonth);
    }
}
