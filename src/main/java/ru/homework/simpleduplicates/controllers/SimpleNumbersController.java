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
public class SimpleNumbersController {

    private final DuplicatesService duplicatesService;

    @Autowired
    public SimpleNumbersController(DuplicatesService duplicatesService) {
        this.duplicatesService = duplicatesService;
    }

    @GetMapping("/check")
    public String lifeCheck(){
        return "You have reached simple numbers controller";
    }

    @PostMapping("/findDuplicate")
    public Map<Long, Long> findDuplicates(@RequestBody List<Long> numbers){
        log.info("Someone has reached duplicate finding method");
        Map<Long, Long> duplicates = duplicatesService.checkDuplicate(numbers);
        return duplicates;
    }
}
