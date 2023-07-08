package com.lwx.test.operation;

import com.lwx.test.arithmetic.ConsecutiveRemover;
import com.lwx.test.config.StringProcessor;
import com.lwx.test.config.StringProcessorRunner;

import java.util.Scanner;

public class removeDuplicateString {
    public static void main(String[] args) {
        String input = "aabcccbbad";
/*        Scanner scanner = new Scanner(System.in);
        String input = "";
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        scanner.close();*/
        StringProcessor processor = new ConsecutiveRemover();
        StringProcessorRunner.run(input, processor);
    }
}
