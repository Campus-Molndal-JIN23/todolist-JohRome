package org.campusmolndal;

import java.util.Scanner;

public class Input {
    private final Scanner input;

    // TODO: Test this class and all its edge cases

    public Input() {
        input = new Scanner(System.in);
    }

    public int readIntFromUser() {
        // Check for negative numbers
        // Check for decimals
        // Check for Integer MAX
        return input.nextInt();
    }

    public String readStringFromUser() {
        // Check for empty string
        // Check for string with only whitespace
        // Check for null
        return input.nextLine();
    }
        public void consumeNewLine() {
        input.nextLine();
    }
}

