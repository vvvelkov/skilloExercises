package Lecture_06;

public class MiddleOfString {
    public static void main(String[] args) {
        middleChar("Animal");
    }

    static void middleChar(String str){
        int length;
        int position;

        if(str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        }else {
            position = str.length() / 2;
            length = 1;
        }

        System.out.println(str.substring(position, length + position));
    }

}
