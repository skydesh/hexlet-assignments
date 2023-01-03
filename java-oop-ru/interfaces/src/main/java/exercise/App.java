package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        if (apartments.isEmpty()) {
            return new ArrayList<>();
        }
        if (n > apartments.size()) {
            throw new IndexOutOfBoundsException();
        }
        return apartments.stream()
                .sorted(Home::compareTo)
                .map(Object::toString)
                .collect(Collectors.toList())
                .subList(0, n);
    }
}
// BEGIN

// END
