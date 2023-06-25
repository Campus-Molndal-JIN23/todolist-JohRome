package org.campusmolndal;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InputTest {

    private Input sut;
    private InputStream inputStream;
    private Scanner scanner;


    @Test
    void testReadStringFromUser() {
        // Arrange
        String fakeInput = "Test";
        inputStream = new ByteArrayInputStream(fakeInput.getBytes());
        scanner = new Scanner(inputStream);
        sut = new Input(scanner);

        // Act
        String result = sut.readStringFromUser();

        // Assert
        assertEquals(fakeInput, result);
    }

    @Test
    void testReadIntegerFromUser() {
        // Arrange
        String fakeInput = "1";
        inputStream = new ByteArrayInputStream(fakeInput.getBytes());
        scanner = new Scanner(inputStream);
        sut = new Input(scanner);

        // Act
        int actual = sut.readCorrectIntFromUser();

        // Assert
        assertEquals(1,actual);
    }
}
