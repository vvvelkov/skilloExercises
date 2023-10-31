package Lecture_06;

public class IsNumPalindrome {
    public static void main(String[] args) {
        int num = 3553;
        System.out.printf("Is %d a palindrome?\n",num);
        System.out.println(isPalindrome(3553));
    }

    static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder;

        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
