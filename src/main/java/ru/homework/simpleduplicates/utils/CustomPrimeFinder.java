package ru.homework.simpleduplicates.utils;

import org.springframework.stereotype.Component;

@Component
public class CustomPrimeFinder implements PrimeFinder {

    @Override
    public boolean isPrime(long number) {
        if (number == 2)
            return true;
        if (number % 2 == 0 || number <= 1)
            return false;
        long sqr = (long) Math.sqrt(number) + 1;
        for (long divisor = 3; divisor < sqr; divisor += 2)
            if (number % divisor == 0)
                return false;
        return true;
    }

}
