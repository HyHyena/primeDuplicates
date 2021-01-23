package ru.homework.simpleduplicates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.homework.simpleduplicates.utils.PrimeFinder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SimpleDuplicatesService implements DuplicatesService{

    private final PrimeFinder primeFinder;

    @Autowired
    public SimpleDuplicatesService(PrimeFinder primeFinder) {
        this.primeFinder = primeFinder;
    }

    @Override
    public Map<Long, Long> checkDuplicate(List<Long> numbers){
        Map<Long, Long> duplicates = new HashMap<>();
        for (Long number : numbers) {
            if (primeFinder.isPrime(number)) {
                Long value = duplicates.get(number);
                if (value == null)
                    duplicates.put(number, 1L);
                else {
                    duplicates.put(number, ++value);
                }
            }
        }
        return duplicates;
    }

}
