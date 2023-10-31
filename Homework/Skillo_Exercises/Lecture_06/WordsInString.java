package Lecture_06;

public class WordsInString {
    public static void main(String[] args) {
        System.out.println(countOfWords(" ALl s 1"));
    }

    static int countOfWords(String str){

        String trimmedStr = str.trim();
        int trimmedLength = trimmedStr.length();
        int counter = 0;

        if(trimmedLength > 1){
            counter++;

            for (int i = 1; i < trimmedLength ; i++) {
                if(trimmedStr.charAt(i) == ' '){
                    counter++;
                }
            }
        }

        return counter;
    }

}
