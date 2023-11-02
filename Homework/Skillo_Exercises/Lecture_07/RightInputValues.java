package Lecture_07;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class RightInputValues {
        private static FileWriter getFileWriter(String filePath) throws IOException {
            FileWriter fileWriter = new FileWriter(filePath, true); // "Skillo_Exercises/Lecture_07/textFile.txt"
            return fileWriter;
        }
        protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
            fileWriter.close();
        }
        public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
            for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
            }
        }

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();
            int howManyTimesToPrintTheTextToFile = scanner.nextInt();
            String textToAdd = scanner.nextLine();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        }
}