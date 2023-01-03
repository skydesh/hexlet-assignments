package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage storage){
        Map<String, String> map = new HashMap<>(storage.toMap());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            storage.unset(entry.getKey());
            storage.set(entry.getValue(), entry.getKey());
        }
        return storage;
    }
}
// BEGIN

// END
