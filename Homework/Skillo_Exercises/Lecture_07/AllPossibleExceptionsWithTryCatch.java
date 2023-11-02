package Lecture_07;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AllPossibleExceptionsWithTryCatch {
    private static FileWriter getFileWriter(String filePath) {

        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            return fileWriter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    protected static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printToFile(FileWriter fileWriter, String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            try {
                fileWriter.write(text + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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