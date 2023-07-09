package com.lwx.test.operation;

import com.lwx.test.arithmetic.ConsecutiveReplace;
import com.lwx.test.config.StringProcessor;
import com.lwx.test.config.StringProcessorRunner;

import java.util.Scanner;

public class replaceDuplicateString {
    public static void main(String[] args) {
        String input = "aaa";
/*        Scanner scanner = new Scanner(System.in);
        String input = "";
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        scanner.close();*/
        StringProcessor processor = new ConsecutiveReplace();
        StringProcessorRunner.run(input, processor);
    }
}
