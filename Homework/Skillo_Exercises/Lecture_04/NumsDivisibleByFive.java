package Lecture_04;

public class NumsDivisibleByFive {
    public static void main(String[] args) {

        numsDivisibleByFive();
    }

    private static void numsDivisibleByFive() {

        int list1[] = {12, 15, 32, 42,
                55, 75, 122, 132, 150, 180, 200};

        for(int index = 0; index < list1.length; index++){
            int breakageNum = list1[index];

            if(breakageNum > 150){
                break;
            }

            if(breakageNum % 5 == 0){
                System.out.println(breakageNum);
            }
        }

    }
}