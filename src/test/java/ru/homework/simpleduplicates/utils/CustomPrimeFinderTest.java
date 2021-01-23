package ru.homework.simpleduplicates.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomPrimeFinderTest {

    @Autowired
    CustomPrimeFinder primeFinder;

    @Test
    void isPrime() {
        assertTrue(primeFinder.isPrime(1077011022107L));
    }
}