package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter{
    public static List<String> takeOldestMans(List<Map<String, String>> personList) {
        return personList.stream()
            .filter(man -> man.get("gender").equals("male"))
            .sorted((person, person2) -> {
                LocalDate date = LocalDate.parse(person.get("birthday"));
                LocalDate date2 = LocalDate.parse(person2.get("birthday"));
                return date.compareTo(date2);
            })
            .map(man -> man.get("name"))
            .collect(Collectors.toList());
    }
}
// END
