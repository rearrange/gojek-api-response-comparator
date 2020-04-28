package com.gojek;

import java.util.Scanner;

public class GojekAPIResponseComparatorMain {
    public static void main(String[] args) throws Exception {
        Scanner fileNameInput = new Scanner(System.in);
        System.out.println("Enter the first filename (with it's full path) to be compared: ");
        String firstFile = fileNameInput.nextLine();
        System.out.println("Enter the second filename (with it's full path) to be compared: ");
        String secondFile = fileNameInput.nextLine();

        FileInputData inputs = new FileInputData(firstFile, secondFile);

        if(!inputs.isValidInput())
            throw new Exception("One or both file(s) provided is invalid - please provide text files only");

        inputs.processInput();

    }
}
