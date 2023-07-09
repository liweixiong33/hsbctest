package com.lwx.test.config;


import org.apache.commons.lang3.StringUtils;

public class StringProcessorRunner {
    public static String run(String input, StringProcessor processor) {
        String output = input;
        String newOutput = "";
        while (true) {
            if (!StringUtils.isEmpty(output)) {
                newOutput = processor.process(output);
            }
            if (newOutput.equals(output)) {
                break;
            } else {
                System.out.println(newOutput);
                output = newOutput;
            }
        }
        return newOutput;
    }
}
