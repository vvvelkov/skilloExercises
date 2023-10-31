package Lecture_06;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }

    static boolean isEven(int num){
        if(num % 2 == 0){
             return true;
        }else{
            return false;
        }
    }
}
