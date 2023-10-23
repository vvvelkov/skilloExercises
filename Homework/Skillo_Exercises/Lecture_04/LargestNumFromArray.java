package Lecture_04;

public class LargestNumFromArray {
    public static void main(String[] args) {

        largestNumFromArray();
    }
    private static void largestNumFromArray() {

        int arr[] = {14,24,5,10};
        int largestNum = 0;

        for(int i=0; i<arr.length; i++){
            int iValue = arr[i];

            if(iValue > largestNum){
                largestNum = iValue;
            }
        }

        System.out.println("Largest num is from the array is: " + largestNum);
    }
}

                // variant 2
//    private static void largestNumFromArray() {
//
//        int arr[] = {4,3,5,10};
//        int largestNum = Integer.MIN_VALUE;
//
//        for(int i=0; i<arr.length; i++){
//            int iValue = arr[i];
//
//            if(iValue > largestNum){
//                largestNum = iValue;
//            }
//        }
//
//        System.out.println("Largest num is: " + largestNum);
//}