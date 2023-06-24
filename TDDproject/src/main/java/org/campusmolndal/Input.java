package org.campusmolndal;

import java.util.Scanner;

public class Input {
    private Scanner input;

    // TODO: Test this class and all its edge cases

    public Input(Scanner input) {
        this.input = input;
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
        return input.nextLine();
    }
        public void consumeNewLine() {
        input.nextLine();
    }
}

