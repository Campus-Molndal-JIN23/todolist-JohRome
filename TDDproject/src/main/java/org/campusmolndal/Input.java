package org.campusmolndal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input(Scanner input) {
        this.input = input;
    }

    public int readCorrectIntFromUser() {
        int answer = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                answer = input.nextInt();
                isValid = errorCheckIntInput(answer);
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Wrong input");
                //Output.tellUserWrongInputIsMade(e);
            }
        }
        return answer;
    }

    private boolean errorCheckIntInput(int answer) {
        if (answer < 0) {
            Output.promptUserForCorrectInt();
            return false;
        } else {
            return true;
        }
    }

    public String readStringFromUser() {
        String answer = "";
        boolean isValid = false;

        while (!isValid) {
            try {
                answer = input.nextLine();
                isValid = errorChecksStringInput(answer);
            } catch (Exception e) {
                System.out.println("Empty string");
            }
        }

        return answer;
    }

    private boolean errorChecksStringInput(String input) {
        return !input.trim().isEmpty();
    }


    public void consumeNewLine() {
        input.nextLine();
    }
}

