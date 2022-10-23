package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;

// BEGIN
public class App{
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> whereBooks = new ArrayList<>();
        int count = 0;
        Set<String> whereKeys = where.keySet();
        for(Map<String, String> bookMap : books) {
            for (String key : whereKeys) {
                if (bookMap.containsValue(where.get(key))) {
                    count++;
                }
                if (count == whereKeys.size()) {
                    whereBooks.add(bookMap);
                }
            }
            count = 0;
        }
        return whereBooks;
    }
}
//END
