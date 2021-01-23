package ru.homework.simpleduplicates.services;

import java.util.List;
import java.util.Map;

public interface DuplicatesService {

    Map<Long, Long> checkDuplicate(List<Long> numbers);

}
