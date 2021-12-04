package com.kodilla.exception.test;

import com.kodilla.exception.SecondChallange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTestSuite {

    @Test
    void probablyWillThrowExceptionTest() {

        //Given
        SecondChallange secondChallange = new SecondChallange();

        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(1, 0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyWillThrowException(3, 2))
        );
    }
}
