package com.lwx.test.arithmetic;

import com.lwx.test.config.StringProcessor;

public class ConsecutiveReplace implements StringProcessor {
    @Override
    public String process(String input) {
        StringBuilder output = new StringBuilder();
        int count = 1;
        char prev = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                if (count >= 3) {
                    if(prev != 'a'){
                        output.append((char) (prev - 1));
                    }
                } else {
                    for (int j = 0; j < count; j++) {
                        output.append(prev);
                    }
                }
                count = 1;
                prev = curr;
            }
        }
        if (count >= 3) {
            if(prev != 'a'){
                output.append((char) (prev - 1));
            }
        } else {
            for (int j = 0; j < count; j++) {
                output.append(prev);
            }
        }
        return output.toString();
    }
}
