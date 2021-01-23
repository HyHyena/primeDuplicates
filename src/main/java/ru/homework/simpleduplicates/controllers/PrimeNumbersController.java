package ru.homework.simpleduplicates.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.homework.simpleduplicates.services.DuplicatesService;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/simpleNumbers")
@Slf4j
public class PrimeNumbersController {

    private final DuplicatesService duplicatesService;

    @Autowired
    public PrimeNumbersController(DuplicatesService duplicatesService) {
        this.duplicatesService = duplicatesService;
    }

    @GetMapping("/check")
    public String lifeCheck(){
        return "You have reached prime numbers controller\n";
    }

    @PostMapping("/findDuplicates")
    public Map<Long, Long> findDuplicates(@RequestBody List<Long> numbers){
        log.info("Someone has reached duplicate finding method");
        Map<Long, Long> duplicates = duplicatesService.checkDuplicate(numbers);
        return duplicates;
    }
}
