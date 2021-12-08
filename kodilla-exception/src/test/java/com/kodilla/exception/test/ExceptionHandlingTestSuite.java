package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void probablyWillThrowExceptionTest() {

        //Given
        SecondChallange secondChallange = new SecondChallange();

        //When&Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallange.probablyWillThrowException(1.0, 0.0)),
                () -> assertDoesNotThrow(() -> secondChallange.probablyWillThrowException(1.1, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(0.999999999, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(2.00000001, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(2.0, 2.0)),
                () -> assertDoesNotThrow(() -> secondChallange.probablyWillThrowException(1.99999999, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(2.0, 7.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(2.1, 7.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(0.0, 7.0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(5.0, 1.50000001)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(5.0, 1.49999999))
        );
    }
}
