package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

// BEGIN
public class App{
    public static LinkedHashMap<String, Object> genDiff(Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> expected = new LinkedHashMap<>();
        LinkedHashMap<String, Object> expected2 = new LinkedHashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if(!map2.containsKey(entry.getKey())) {
                expected.put(entry.getKey(), "deleted");
                map2.remove(entry.getKey());
            }
            if(map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                expected.put(entry.getKey(), "unchanged");
                map2.remove(entry.getKey());
            }
            if(map2.containsKey(entry.getKey()) && !map2.get(entry.getKey()).equals(entry.getValue())) {
                expected.put(entry.getKey(), "changed");
                map2.remove(entry.getKey());
            }
        }
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            expected.put(entry.getKey(), "added");
        }
        expected.entrySet()
                .stream()
                .sorted(Map.Entry.
                        comparingByKey())
                .forEach(y -> expected2.put(y.getKey(), y.getValue()));
        return expected2;
    }}
//END
