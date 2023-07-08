package com.lwx.test.config;

public class StringProcessorRunner {
    public static void run(String input, StringProcessor processor) {
        String output = input;
        while (true) {
            String newOutput = processor.process(output);
            if (newOutput.equals(output)) {
                break;
            } else {
                System.out.println(newOutput);
                output = newOutput;

            }
        }
    }
}
